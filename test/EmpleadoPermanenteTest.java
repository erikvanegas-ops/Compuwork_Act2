
import GestionEmpleados.EmpleadoPermanente;

import org.junit.Test;
import static org.junit.Assert.*;  // Importa aserciones (assertEquals, etc.)

public class EmpleadoPermanenteTest {
    
    // PRUEBA 1: Verifica cálculo correcto del salario
    @Test
    public void testCalcularSalarioCorrecto() {
        // ARRANGE (Preparar datos)
        double salarioBase = 3000.0;
        double bonoAnual = 1200.0;  // 100 mensual
        double esperado = 3100.0;   // 3000 + 1200/12
        
        // ACT (Ejecutar método a probar)
        EmpleadoPermanente emp = new EmpleadoPermanente("E001", "Juan Pérez", salarioBase, bonoAnual);
        double resultado = emp.calcularSalario();
        
        // ASSERT (Verificar resultado)
        // assertEquals(mensaje, valor esperado, valor obtenido, tolerancia)
        assertEquals("El salario debe ser 3100.0", esperado, resultado, 0.01);
    }
    
    // PRUEBA 2: Verifica con bono cero
    @Test
    public void testCalcularSalarioSinBono() {
        // ARRANGE
        double salarioBase = 2500.0;
        double bonoAnual = 0.0;
        double esperado = 2500.0;
        
        // ACT
        EmpleadoPermanente emp = new EmpleadoPermanente("E002", "María López", salarioBase, bonoAnual);
        double resultado = emp.calcularSalario();
        
        // ASSERT
        assertEquals("Sin bono, salario debe ser base", esperado, resultado, 0.01);
    }
    
    // PRUEBA 3: Verifica que getTipo() retorne "Permanente"
    @Test
    public void testGetTipo() {
        // ARRANGE
        EmpleadoPermanente emp = new EmpleadoPermanente("E003", "Carlos", 3000, 500);
        
        // ACT
        String tipo = emp.getTipo();
        
        // ASSERT
        assertEquals("El tipo debe ser Permanente", "Permanente", tipo);
    }
}