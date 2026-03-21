package actividad2compuwork;

public class ReporteDesempenio {
    private Empleado empleado;
    private String evaluacion;

    
    public ReporteDesempenio(Empleado empleado, String evaluacion) {
        this.empleado = empleado;
        this.evaluacion = evaluacion;
    }

 
    public void generarReporte() throws Exception {
        if (empleado == null) {
            throw new Exception("No se puede generar reporte sin empleado.");
        }

        System.out.println("----- REPORTE DE DESEMPEÑO -----");
        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Actividad: " + empleado.trabajar());
    }
}
