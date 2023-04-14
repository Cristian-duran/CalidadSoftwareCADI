import unittest
import obtenerAccion

class TestobtenerAccion(unittest.TestCase):

    def test_prueba1(self):
        self.assertEqual(obtenerAccion.accion("si", True), "actualizar")

    def test_prueba2(self):
        self.assertEqual(obtenerAccion.accion("no", True), "matricular")

    def test_prueba3(self):
        self.assertEqual(obtenerAccion.accion2(True, "porConfirmar"), "actualizar")

    def test_prueba4(self):
        self.assertEqual(obtenerAccion.accion3(True, "externo"), "registrar")

    def test_prueba5(self):
        self.assertEqual(obtenerAccion.accion2(True, "vigente"), "matricular")

if __name__ == "__main__":
    unittest.main()