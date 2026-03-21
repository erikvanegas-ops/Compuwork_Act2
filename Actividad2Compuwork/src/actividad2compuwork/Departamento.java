package actividad2compuwork;

public class Departamento {
    private String nombreDepartamento;
    private Empleado empleado;

    
    public Departamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    
    public void asignarEmpleado(Empleado empleado) throws Exception {
        if (empleado == null) {
            throw new Exception("No se puede asignar un empleado nulo.");
        }
        this.empleado = empleado;
    }

    public void mostrarEmpleado() {
        if (empleado != null) {
            System.out.println("Empleado en el departamento: " + empleado.getNombre());
        } else {
            System.out.println("No hay empleado asignado.");
        }
    }
}
