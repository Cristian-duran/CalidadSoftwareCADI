from re import A


def accion(a, b):

    if a == "si" and b == True:
        return "actualizar"
    else:
        return "matricular"

def accion2(a, b):
    if a == True and b == "porConfirmar":
        return "actualizar"
    else:
        return "matricular"

def accion3(a, b):
    if a == True and b == "externo":
        return "registrar"

print(accion("si", True))