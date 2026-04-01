// Clase de Empleado Permanente con bono anual
public class EmpleadoPermanente extends Empleado { //Extiende de Empleado
    private double bonoAnual;
    
    public EmpleadoPermanente(String id, String nombre, double salarioBase, double bonoAnual) {
        super(id, nombre, salarioBase);  // Llama al constructor padre
        this.bonoAnual = bonoAnual;
    }
    
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (bonoAnual / 12);  // Bono Mensual
    }
    
    @Override
    public String getTipo() {
        return "Permanente";
    }
}

