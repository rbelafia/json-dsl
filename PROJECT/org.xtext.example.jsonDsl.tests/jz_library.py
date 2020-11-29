import json
import csv
from itertools import zip_longest


class JsonOperationException(Exception):
    def __init__(self, left, right, operation):
        self.left = left
        self.right = right
        self.operation = operation
        self.message = str(type(left)) + " and " + str(type(right)) + " are not compatible for operation" + operation
        super().__init__(self.message)


def jsum(array, *fields):

    if len(fields) == 0:
        res = None
        for elem in array:
            res = addition(res, elem)
        return res

    else:
        res = {}
        for field in fields:
            x = None
            for obj in array:
                x = addition(x, obj[field])
            res[field] = x
        raise TypeError


def disjunction(left, right):

    if left is None:
        return right
    elif right is None:
        return left

    if type(left) is list:
        if type(right) is list:
            return [disjunction(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [disjunction(x, right) for x in left]

    else:
        if type(left) is bool and type(right) is bool:
            return left or right
        elif type(right) is list:
            return [disjunction(left, x) for x in right]
        else:
            raise JsonOperationException(left, right, "disjunction")


def conjunction(left, right):

    if left is None:
        return right
    elif right is None:
        return left

    if type(left) is list:
        if type(right) is list:
            return [conjunction(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [conjunction(x, right) for x in left]

    else:
        if type(left) is bool and type(right) is bool:
            return left and right
        elif type(right) is list:
            return [conjunction(left, x) for x in right]
        else:
            raise JsonOperationException(left, right, "conjunction")


def addition(left, right):

    if left is None:
        return right
    elif right is None:
        return left

    if type(left) is list:
        if type(right) is list:
            return [addition(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [addition(x, right) for x in left]

    else:
        if type(right) is list:
            return [addition(left, x) for x in right]

        elif type(left) is int or type(left) is float:
            assert type(right) is int or type(right) is float, 'can only add numbers with numbers'
            return left + right

        elif type(left) is str:
            assert type(right) is str, 'can only concat strings with strings (try using TO_STRING)'
            return left + right

        elif type(left) is dict:
            assert type(right) is str, 'can only concat object with object (try using INSERT)'
            return left.update(right)

        else:
            raise JsonOperationException(left, right, "addition")


def substraction(left, right):
    if left is None:
        return right
    elif right is None:
        return left

    if type(left) is list:
        if type(right) is list:
            return [substraction(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [substraction(x, right) for x in left]

    else:
        if type(right) is list:
            return [substraction(left, x) for x in right]

        elif type(left) is int or type(left) is float:
            assert type(right) is int or type(right) is float, 'can only substract numbers with numbers'
            return left - right

        else:
            raise JsonOperationException(left, right, "substraction")


def multiplication(left, right):
    if left is None:
        return right
    elif right is None:
        return left

    if type(left) is list:
        if type(right) is list:
            return [multiplication(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [multiplication(x, right) for x in left]

    else:
        if type(right) is list:
            return [multiplication(left, x) for x in right]

        elif type(left) is int or type(left) is float:
            assert type(right) is int or type(right) is float or str, ''
            return int(left) * right

        elif type(left) is str:
            assert type(right) is int or type(right) is float, ''
            return left * int(right)

        elif type(left) is dict:
            assert type(right) is dict, ''
            res = left
            for key, value in right.items:
                if key in res and type(res[key]) is dict and type(value) is dict:
                    res[key] = multiplication(res[key], value)
                else:
                    res[key] = value

        else:
            raise JsonOperationException(left, right, "multiplication")


def division(left, right):
    if left is None:
        return right
    elif right is None:
        return left

    if type(left) is list:
        if type(right) is list:
            return [division(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [division(x, right) for x in left]

    else:
        if type(right) is list:
            return [division(left, x) for x in right]

        elif type(left) is int or type(left) is float:
            assert type(right) is int or type(right) is float, 'can only substract numbers with numbers'
            return left / right

        elif type(left) is str:
            assert type(right) is str, ''
            return left.split(right)

        else:
            raise JsonOperationException(left, right, "division")


def modulo(left, right):
    if left is None:
        return right
    elif right is None:
        return left

    if type(left) is list:
        if type(right) is list:
            return [modulo(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [modulo(x, right) for x in left]

    else:
        if type(right) is list:
            return [modulo(left, x) for x in right]

        elif type(left) is int or type(left) is float:
            assert type(right) is int or type(right) is float, 'can only substract numbers with numbers'
            return left % right

        else:
            raise JsonOperationException(left, right, "modulate")


def strict_equal(left, right):
    return left == right


def equal(left, right):
    if type(left) is list:
        if type(right) is list:
            return [equal(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [equal(x, right) for x in left]

    else:
        if type(right) is list:
            return [equal(left, x) for x in right]

        elif type(left) is int or type(left) is float:
            if type(right) is int or type(right) is float:
                return left == right
            elif type(right) is str:
                return str(left) == str(right)
            elif type(right) is bool:
                return left == 1 and right or left == 0 and not right
            else:
                return False

        elif type(left) is str:
            if type(right) is int or type(right) is float:
                return left == str(right) or left == "" and right == 0
            elif type(right) is str:
                return left == right
            elif type(right) is bool:
                return left == str(right).lower() or left == "" and not right
            else:
                return False

        elif type(left) is bool:
            if type(right) is int or type(right) is float:
                return left and right == 1 or not left and right == 0
            elif type(right) is str:
                return str(left).lower() == right \
                       or not left and right == "" \
                       or not left and right == "0" \
                       or left and right == "1"
            elif type(right) is bool:
                return left == right
            else:
                return False

        elif left is None:
            return right is None

        else:
            return left == right


def strict_not_equal(left, right):
    return left != right


def not_equal(left, right):
    if type(left) is list:
        if type(right) is list:
            return [not_equal(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [not_equal(x, right) for x in left]

    else:
        if type(right) is list:
            return [not_equal(left, x) for x in right]
        else:
            return not equal(left, right)


def superior(left, right):
    if type(left) is list:
        if type(right) is list:
            return [superior(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [superior(x, right) for x in left]

    else:
        if type(left) is list:
            if type(right) is list:
                return [superior(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
            else:
                return [superior(x, right) for x in left]

        else:
            return left > right


def superior_or_equal(left, right):
    if type(left) is list:
        if type(right) is list:
            return [superior_or_equal(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [superior_or_equal(x, right) for x in left]

    else:
        if type(left) is list:
            if type(right) is list:
                return [superior_or_equal(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
            else:
                return [superior_or_equal(x, right) for x in left]

        else:
            return left >= right


def inferior(left, right):
    if type(left) is list:
        if type(right) is list:
            return [inferior(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [inferior(x, right) for x in left]

    else:
        if type(left) is list:
            if type(right) is list:
                return [inferior(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
            else:
                return [inferior(x, right) for x in left]

        else:
            return left < right


def inferior_or_equal(left, right):
    if type(left) is list:
        if type(right) is list:
            return [inferior_or_equal(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
        else:
            return [inferior_or_equal(x, right) for x in left]

    else:
        if type(left) is list:
            if type(right) is list:
                return [inferior_or_equal(a, b) for (a, b) in zip_longest(left, right, fillvalue=False)]
            else:
                return [inferior_or_equal(x, right) for x in left]

        else:
            return left < right


def logical_negation(elem):
    if type(elem) is list:
        return [logical_negation(x) for x in elem]

    else:
        assert type(elem) is bool, 'can only negate boolean'
        return not elem


def unary_minus(elem):
    if type(elem) is list:
        return [unary_minus(x) for x in elem]

    else:
        assert type(elem) is int or float, ''
        return - elem


def unary_plus(elem):
    if type(elem) is list:
        return [unary_plus(x) for x in elem]

    else:
        assert type(elem) is int or float, ''
        return + elem


def load_json(path):
    with open(path) as file:
        return json.load(file)


def store_json(obj, path):
    with open(path, 'w') as file:
        json.dump(obj, file)


def export_csv(obj: list, path):
    with open(path, 'w') as output_file:
        output = csv.writer(output_file)
        output.writerow(obj[0].keys())
        for row in obj:
            output.writerow(row.values())


def depth_json(obj: dict):
    rec = []
    for v in obj.values():
        if isinstance(v, dict):
            rec.append(1 + depth_json(v))

    if len(rec) == 0:
        return 1
    else:
        return max(rec)


def infos_json(obj: dict):
    res = {}
    for key, value in obj.items():
        if isinstance(value, int) or isinstance(value, float):
            res[key] = "Number"
        elif isinstance(value, str):
            res[key] = "String"
        elif isinstance(value, bool):
            res[key] = "Boolean"
        elif value is None:
            res[key] = "Null"
        elif isinstance(value, list):
            res[key] = "Array"
        else:
            res[key] = infos_json(value)
    return res


def contains(obj, *keys):
    for k in keys:
        if k not in obj:
            return False
    return True


def concat(*obj):
    res = 0
    if isinstance(obj[0], dict):
        res = {}
        for e in obj:
            assert isinstance(e, dict), "Cannot concat object with " + str(type(e))
            res.update(e)

    elif isinstance(obj[0], list):
        res = []
        for e in obj:
            if isinstance(e, list):
                res += e
            else:
                res.append(e)

    return res

def json_print(x):
    print(aux_print(x, 0))


def aux_print(x, nb_tab):
    if type(x) is dict:
        res = '{'
        sep = False
        for key, value in x.items():
            if sep:
                res += ",\n" + " " * (nb_tab + 1) + key + ': ' + str(aux_print(value, nb_tab + 1))
            else:
                sep = True
                res += "\n" + " " * (nb_tab + 1) + key + ': ' + str(aux_print(value, nb_tab + 1))
        if sep:
            res += "\n" + " " * nb_tab + '}'
        else:
            res += '}'
        return res
    elif type(x) is list:
        res = '['
        sep = False
        for value in x:
            if sep:
                res += ",\n" + " " * (nb_tab + 1) + str(aux_print(value, nb_tab + 1))
            else:
                sep = True
                res += "\n" + " " * (nb_tab + 1) + str(aux_print(value, nb_tab + 1))
        if sep:
            res += "\n" + " " * nb_tab + ']'
        else:
            res += ']'
        return res
    else:
        return x
