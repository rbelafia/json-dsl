# JZ : A JSON manipulation language

## What is JZ ?
JZ is a new EMF-based domain specific language designed to work easily with JSON files. Its design has been inspired by data manipulation language such as SQL or R. 

A program written in JZ can be compiled in two different ways: either in **Python** or **JQ**.
There are some subtle differences the behaviour of a Python or JQ compiled JZ program, but work has been done in order to keep the results similar.

JZ development has been supported by **117 JUnit tests** which ensure:
* A good code coverage on the compilation process
* Executions give the expected results
* The performance of the operations are monitored, to calculate which configurations is the best for a given purpose

## JZ's syntax
```typescript=
file = LOAD ("./jsonfile");
portion = SELECT("name", "age") FROM(file) WHERE(.~"ville" == "Montpellier");
mean = SUM(portion) ON(age) / LENGTH(portion);
PRINT(mean);
```
The JZ's meta-model is presented below.
![](https://i.imgur.com/6Z9XkME.png)
The meta model has not evolved a lot since its first presentation in the 28 September's conference. The constructs presented are globally identical.

The concrete syntax of the language is presented [here](https://github.com/rbelafia/json-dsl/blob/master/PROJECT/org.xtext.example.jsonDsl/bin/org/xtext/example/mydsl/JsonDsl.xtext). Contrary to the abstract syntax, the concrete syntax has evolved since the first draft. Some compromises have been done on the original goal of the language which was to have a SQL-like syntax for functions, which intuitively means being able to use functions without parenthesis. This objective has unfortunately not been reached, and could be the object of future works.

```typescript
// Original planned syntax
foo = SUM bar ON "age" WHERE .~"city" == "Montpellier"

// Actual syntax
foo = SUM(bar) ON ("age") WHERE (.~"city" == "Montpellier")
```

## JZ's quick manual
In this section will be presented the main features of the JZ language.
### Types, values and operations
JZ's types are based on the JSON base types: 
```typescript
// numbers
num = 4;
num = 2.78e4;

// string
str = "Hello";

// boolean
t = true;
f = false;

// null value
nil = null;

// array
foo = [1, true, ["Hello", null]];

// json objects
bar = {
    "first name": "Jean",
    "middle name": null,
    "last name": "Hugo",
    "age": 47,
    "is human": true,
    "born on": {
        "day": 27,
        "month": 7,
        "year" : 1976
    }
};
```

Arrays' elements and objects' values can be accessed respectively with their index and their keys
```typescript
second = foo[2];
age = bar~"age";
```

The basic binary and unary operations (additions, substractions, negation, etc.) behaviours are based on JQ operators behaviours. These behaviours are particularly relevant when working with Json files. 

For instance the addition operator allows to simply add two numbers but also allows to concatenate strings or arrays, while multiplication operator allows to recursively merge two objects and division operator to split strings.


```typescript
// The sum of two numbers
num_sum = 4 + 7.8;

// The concatenation of two strings
string_concatenation = "Hello" + "World";

// The recursive merging of two objects
merge = {"k": {"a": 1, "b": 2}} * {"k": {"a": 0,"c": 3}}

// ...
```

These behaviours are detailled on the JQ's manual page which can be found [here](https://stedolan.github.io/jq/manual/#Builtinoperatorsandfunctions).

### Selector
```typescript
portion = SELECT("name", "age") FROM(file) WHERE(.~"city" == "Montpellier");
total = SELECT(*) FROM(file) WHERE(.~"city" == "Montpellier");
```
The JZ's SELECT function is similar to the SQL's SELECT function. It allows the user to filter an array of objects using a condition but also to isolate a set of desired fields in the objects.

### Get informations on objects
```typescript
depth = GET_DEPTH(foo);
informations = GET_INFOS(foo);
contains = IS ("key1", "key2") IN (foo);
```

These functions allow the user to obtain some information on JSON objects:
* **GET_DEPTH** allows the user to obtain the maximum depth in a JSON object
* **GET_INFOS** allows the user to obtain information on the types of the values in an object.
* **IS ... IN** allows the user determine if an object contains one or many keys
 
### Arithmetics functions
```typescript
sum_age = SUM(foo) ON ("age");
product_values = PRODUCT(bar) WHERE(. > 28);
```

The behaviour of the SUM and PRODUCT functions is quite straightforward, they allows to apply an arithmetic operation on all the element on an array, allowing also to give a condition on the values to be added or multiplied.

In the case of an array of objects these operations can be applied on a specific field.

### IO operations

Since there are some major differences in the way I/O operations are behave according to the target compilation language, these functions will be treated in the differences section.


## JZ's compilation
As explained before JZ can be compiled in two different ways : in Python and JQ. This compilation process is done using *Xtend*.
In order to verify that the compilation process gives the expected results, the project has been equipped with almost a hundred of unit tests which allowed to verify that a JZ program is compiled correctly.
The EclEmma coverage tool, has been also added in order to check if the compilation process had no shadow zones. We obtain a satisfactory **94.8 %** of coverage with 103 unit tests dedicated to the compilation process, along with unit tests which checking if the compiled code is executed as intended.

In particular, a JUnit test ensures that all the combination of operations on a representative set of possible values give the same results. Its pseudo-code is defined below:
```js
representative_values = [0, 4, 5.2, "", "abc", ...]
operators = [OR, AND, +, -, ...]

for i in possible_values:
    for j in possible_values:
        for op in operators:
            jq_execution = execJQ(i + op + j)
            python_execution = execPython("PRINT(" + i + op + j + ")")
            assertEquals(jq_execution, python_execution)
```
These tests can be reproduce from the file [here](https://github.com/rbelafia/json-dsl/blob/master/PROJECT/org.xtext.example.jsonDsl.tests/src/org/xtext/example/mydsl/tests/JsonDslParsingTest.xtend).

Note that even though is a small tolerance between the output of the JQ and Python operations. For instance a boolean in Python is represented is represented beginning with a capital (`True` / `False`) while JQ use lower cases (`true` / `false`).

Also the error report (different between a Python and a JQ compiled JZ program) is not tested which is lacuna which can the subject of future works.
 

## Differences between Python and JQ compilation
Although lots of works has been done in order to keep the functionalities similar between a Python or JQ compiled JZ program, there are actual differences, that could make one chose between one or another (apart from a better operability with a Python project or a script). Some subtle differences have been presented in the previous sections, but more significant ones are presented here :  

### I/O Functions
JQ is not a GDL language like Python, actually it acts more like a sequence of filters on a JSON file. Thus its I/O capabilities are quite limited. Some functions work differently in a JQ programming language, i.e. : 
* **LOAD** : the Load function has two usage different according to the target language. In JQ the LOAD function (without indication on the name of the loaded file) allows to read the input of the JQ filter. On the contrary in the case of a program targeting Python for the compilation, the LOAD function allows the user to precise the file which should be loaded.
```typescript
// target: JQ
// will read the file ./jsonTestFile.json
bar = LOAD;
```
```bash=
cat ./jsonTestFile.json | jq -f jzCompiledFile.jq
```
```typescript
// target: Python
// will read the file ./jsonTestFile.json
bar = LOAD "./jsonTestFile.json";
```

```bash=
python3 jzCompiledFile.py
```



* **PRINT** : it is of course possible to display a text in the output stream, simply by having an isolated expression in the end of the program. However it is not possible to display several pieces of information from different points of the program.
* **STORE ... IN** : the store function used to store an element is not available for JQ compiled JZ program. You rather want to print an element and then redirect in the wished file.
```bash=
jq -n -f compileJQFile.jq > output.json 
```
* **EXPORT_CSV ... IN** : in a similar way, one cannot specify where to export to CSV file in a JZ programm. However it is still possible to use convert a well-structured array to a CSV before printing it to the output stream.
```bash=
jq -n -f compileJQFile.jq > output.csv 
```

### Differences of performances

An analysis on the differences of performances for operations representatives of the usages of JZ has then been done.

To analyse the difference of performance we focused on to operations that a typical user can be brought to do : 
* **Selection** : the selection of a subset of a JSON file using the **SELECT** function.
* **Mean** : calculate the mean of objects in a array on some specific field is also a way to challenge the capabilities of the language.
* **Concatenation**: concatenate all the elements of an array of objects by using the **SUM** operation.

We applied these operations on two test files : 
* [jsonGenTestFile.json](https://github.com/rbelafia/json-dsl/blob/master/PROJECT/org.xtext.example.jsonDsl.tests/src/org/xtext/example/mydsl/tests/jsonGenTestFile.json) : composed of an array of 10 objects
* [jsonBigGenTestFile.json](https://github.com/rbelafia/json-dsl/blob/master/PROJECT/org.xtext.example.jsonDsl.tests/src/org/xtext/example/mydsl/tests/jsonBigGenTestFile.json) : composed of an array of 2730 objects

Each object is composed of 3 elements :
* *name* (string)
* *age* (int)
* *adress* (string)

Each experiment is based on JUnit test files that can be found [here](https://github.com/rbelafia/json-dsl/tree/master/PROJECT/org.xtext.example.jsonDsl.tests/src/org/xtext/example/mydsl/tests/JsonDslExecutionTimeTests.xtend). The running time given for each configuration has been calculated by calculating their arithmetic mean on 10 executions as well as the standard deviation.
The configuration used is given below :
> CPU : Intel® Core™ i7-7820HQ CPU @ 2.90GHz × 8 
> Memory : 31,2 GiB


#### Selection

| File                    | Variant | Runtime (ms) |
|:----------------------- | ------- |:------------ |
| jsonGenTestFile.json    | JQ      | 43 ± 3       |
| jsonGenTestFile.json    | Python  | 57 ± 4       |
| jsonBigGenTestFile.json | JQ      | 76 ± 4       |
| jsonBigGenTestFile.json | Python  | 64 ± 4       |

*We see here that the Python selection mechanism is more performant that  the JQ's one in the case of bigger data. This can be linked to a weakness of  the JQ's selection implementation.*

#### Mean

| File                    | Variant | Runtime (ms) |
|:----------------------- | ------- |:------------ |
| jsonGenTestFile.json    | JQ      | 46 ± 2       |
| jsonGenTestFile.json    | Python  | 25 ± 8       |
| jsonBigGenTestFile.json | JQ      | 47 ± 3       |
| jsonBigGenTestFile.json | Python  | 73 ± 9       |

*The result of the performance on a mean operation is interesting. Indeed, although the Python compilation mechanism is more performant for small entry file (the running time is almost divided by 2) the execution time increase a lot when the size of the entry file increases, while the JQ's mechanism running time is almost constant.*

#### Concatenation

| File                    | Variant | Runtime (ms) |
|:----------------------- | ------- |:----------- |
| jsonGenTestFile.json    | JQ      | 45 ± 8      |
| jsonGenTestFile.json    | Python  | 53 ± 3      |
| jsonBigGenTestFile.json | JQ      | 51 ± 7      |
| jsonBigGenTestFile.json | Python  | 65 ± 5      |

*Here the concatenation operation shows an increase of the running time both in JQ and Python compilation. However the JQ compiled program is on average 17% faster than the Python compiled program.*

## Conclusion : why and how to use JZ ?
JZ is a DSL useful to manipulate JSON object. It can be compiled to JQ script or a Python file, the first one which can be used together with other scripts while the second file, can be obviously use in a Python project.
In the case of a standalone usage : one would compile JZ to JQ :
* One would compile JZ to JQ if high performances for arithmetic operations are needed, while manipulating extern files is not the core of the usage.
* On the other side one would compile JZ to Python, if a full access to the I/O functionalities are needed. 