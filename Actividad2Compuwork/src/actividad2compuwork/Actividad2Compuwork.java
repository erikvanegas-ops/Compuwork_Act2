package actividad2compuwork;

public class Actividad2Compuwork {
    
    public static void main(String[] args) {
        try {
            
            EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto("Carlos", 1, 2000);

            
            Departamento dep = new Departamento("Tecnología");

            
            dep.asignarEmpleado(emp1);
            dep.mostrarEmpleado();

           
            ReporteDesempenio reporte = new ReporteDesempenio (emp1, "Excelente rendimiento");

            
            reporte.generarReporte();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
