import json
import csv
from itertools import zip_longest
from functools import reduce
from copy import copy


class JsonOperationException(Exception):
    def __init__(self, left, right, operation):
        self.left = left
        self.right = right
        self.operation = operation
        self.message = str(type(left)) + " and " + str(type(right)) + " are not compatible for operation" + operation
        super().__init__(self.message)



def disjunction(left, right):

    return (left is not None and left is not False) or (right is not None and right is not False)


def conjunction(left, right):

    return (left is not None and left is not False) and (right is not None and right is not False)

def addition(left, right):

    if left is None:
        return right
    elif right is None:
        return left

    if type(left) is list:
        assert type(right) is list, 'can only concat list with list'
        return left + right

    elif type(left) is int or type(left) is float:
        assert type(right) is int or type(right) is float, 'can only add numbers with numbers'
        return left + right

    elif type(left) is str:
        assert type(right) is str, 'can only concat strings with strings (try using TO_STRING)'
        return left + right

    elif type(left) is dict:
        assert type(right) is dict, 'can only concat object with object (try using INSERT)'
        res = copy(left)
        res.update(right)
        if res is None:
            return {}
        else:
            return res

    else:
        raise JsonOperationException(left, right, "addition")


def substraction(left, right):
    if type(left) is int or type(left) is float:
        assert type(right) is int or type(right) is float, 'can only substract numbers with numbers'
        return left - right

    elif type(left) is list:
        assert type(right) is list, 'can only substract list with list'
        res = copy(left)
        for i in left:
            if i in right:
                res.remove(i)
        return res

    else:
        raise JsonOperationException(left, right, "substraction")

def multiplication(left, right):

    if type(left) is int or type(left) is float:
        assert type(right) is int or type(right) is float or type(right) is str, ''
        if type(right) is str:
            if int(left) == 0:
                return None
            else:
                return int(left) * right
        else:
            return left * right

    elif type(left) is str:
        assert type(right) is int or type(right) is float, ''
        if int(right) == 0:
            return None
        else:
            return left * int(right)

    elif type(left) is dict:
        assert type(right) is dict, ''
        res = left
        for key, value in right.items():
            if key in res and type(res[key]) is dict and type(value) is dict:
                res[key] = multiplication(res[key], value)
            else:
                res[key] = value
        if res is None:
            return {}
        else:
            return res

    else:
        raise JsonOperationException(left, right, "multiplication")


def division(left, right):
    if left is None:
        return right
    elif right is None:
        return left

    if type(left) is int or type(left) is float:
        assert type(right) is int or type(right) is float, 'can only substract numbers with numbers'
        return left / right

    elif type(left) is str:
        assert type(right) is str, ''
        return left.split(right)

    else:
        raise JsonOperationException(left, right, "division")


def modulo(left, right):

    if type(left) is int or type(left) is float:
        assert type(right) is int or type(right) is float, 'can only modulate numbers with numbers'
        return int(left % right)

    else:
        raise JsonOperationException(left, right, "modulate")


def strict_equal(left, right):
    return left == right


def equal(left, right):
    return (type(left) is type(right)) and left == right


def strict_not_equal(left, right):
    return left != right


def not_equal(left, right):
    return not equal(left, right)


def superior(left, right):
    if left is None:
        return False
    else:
        if right is None:
            return True
        elif type(left) is dict:
            if type(right) is dict:
                for (x, y) in zip_longest(left.keys(), right.keys(), fillvalue=False):
                    if not_equal(x, y):
                        return superior(x, y)
                for (x, y) in zip_longest(left.values(), right.values(), fillvalue=False):
                    if not_equal(x, y):
                        return superior(x, y)
                return False
            else:
                return True
        elif type(left) is list:
            if type(right) is dict:
                return False
            elif type(right) is list:
                for (x, y) in zip_longest(left, right, fillvalue=False):
                    if x != y:
                        return superior(x, y)
                return False
            else:
                return True
        elif type(left) is str:
            if type(right) is dict or type(right) is list:
                return False
            elif type(right) is str:
                if len(left) != len(right):
                    return len(left) > len(right)
                else:
                    return left > right
            else:
                return True
        elif type(left) is int or type(left) is float:
            if type(right) is dict or type(right) is list or type(right) is str:
                return False
            elif type(right) is int or type(right) is float:
                return left > right
            else:
                return True
        elif type(left) is bool:
            if type(right) is bool:
                return left and not right
            else:
                return False


def superior_or_equal(left, right):
    return superior(left, right) or equal(left, right)


def inferior(left, right):
    return superior(right, left)


def inferior_or_equal(left, right):
    return inferior(left, right) or equal(left, right)


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
                res += ",\n" + "  " * (nb_tab + 1) + key + ': ' + str(aux_print(value, nb_tab + 1))
            else:
                sep = True
                res += "\n" + "  " * (nb_tab + 1) + key + ': ' + str(aux_print(value, nb_tab + 1))
        if sep:
            res += "\n" + "  " * nb_tab + '}'
        else:
            res += '}'
        return res
    elif type(x) is list:
        res = '['
        sep = False
        for value in x:
            if sep:
                res += ",\n" + "  " * (nb_tab + 1) + str(aux_print(value, nb_tab + 1))
            else:
                sep = True
                res += "\n" + "  " * (nb_tab + 1) + str(aux_print(value, nb_tab + 1))
        if sep:
            res += "\n" + "  " * nb_tab + ']'
        else:
            res += ']'
        return res
    elif type(x) is float:
        return int(x) if float.is_integer(x) else x
    else:
        return x
