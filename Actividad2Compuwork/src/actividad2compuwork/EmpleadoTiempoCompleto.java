
package actividad2compuwork;

public class EmpleadoTiempoCompleto extends Empleado {
    public EmpleadoTiempoCompleto(String nombre, int id, int salario) {
        super(nombre, id, salario);
        
         }    
    @Override
    public String trabajar() {
        return "El empleado de tiempo completo está trabajando 8 horas.";
    }
}
