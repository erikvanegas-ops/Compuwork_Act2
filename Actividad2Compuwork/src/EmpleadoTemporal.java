// Clase de Empleado Temporal, se hacen operaciones de horas mensuales y tarifa hora
public class EmpleadoTemporal extends Empleado {
    private int horasMensuales;
    private double tarifaHora;
    
    public EmpleadoTemporal(String id, String nombre, int horasMensuales, double tarifaHora) {
        super(id, nombre, 0);  // Salario base igual a 0 _ tercer dato heredado
        this.horasMensuales = horasMensuales;
        this.tarifaHora = tarifaHora;
    }
    
    @Override
    public double calcularSalario() {
        return horasMensuales * tarifaHora;
    }
    
    @Override
    public String getTipo() {
        return "Temporal";
    }
}
