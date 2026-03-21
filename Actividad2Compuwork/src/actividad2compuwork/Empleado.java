package actividad2compuwork;

public class Empleado {
    private String nombre;
    private int id;
    private double salario;

   
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String trabajar() {
        return "El empleado está trabajando.";
    }
}
