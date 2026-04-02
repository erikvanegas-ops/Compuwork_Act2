
import GestionEmpleados.Departamento;
import GestionEmpleados.EmpleadoPermanente;
import org.junit.Test;
import static org.junit.Assert.*;

public class DepartamentoTest {
    
    @Test
    public void testAgregarEmpleado() {
        // ARRANGE
        Departamento dept = new Departamento("Ventas");
        EmpleadoPermanente emp = new EmpleadoPermanente("E001", "Juan", 3000, 0);
        int tamañoInicial = dept.getEmpleados().size();
        
        // ACT
        dept.agregarEmpleado(emp);
        
        // ASSERT
        assertEquals("Debe tener 1 empleado más", tamañoInicial + 1, dept.getEmpleados().size());
    }
}