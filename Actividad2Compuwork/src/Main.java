//Con scanner capturamos datos del usuario por consola
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados(); //Nuevo objeto 
        Scanner scanner = new Scanner(System.in);
        int opcion;
        //Creamos el menu de opciones para la interacción con el usuario
        do {
            System.out.println("\n=== GESTIÓN EMPLEADOS ===");
            System.out.println("1. Crear Empleado");
            System.out.println("2. Actualizar Empleado");
            System.out.println("3. Eliminar Empleado");
            System.out.println("4. Crear Departamento");
            System.out.println("5. Asignar Empleado a Depto");
            System.out.println("6. Mostrar Empleados");
            System.out.println("7. Mostrar Departamentos");
            System.out.println("0. Salir");
            System.out.print("Opción: "); opcion = scanner.nextInt();
            scanner.nextLine();
            
            //Con switch gestionamos los casos de uso de opciones elegidas por el usuario
            switch (opcion) {
                case 1: gestor.crearEmpleado(); break;
                case 2: gestor.actualizarEmpleado(); break;
                case 3: gestor.eliminarEmpleado(); break;
                case 4: gestor.crearDepartamento(); break;
                case 5: gestor.asignarDepartamento(); break;
                case 6: gestor.mostrarEmpleados(); break;
                case 7: gestor.mostrarDepartamentos(); 
                        for (Departamento d : gestor.getDepartamentos()) {
                            d.mostrarEmpleados();
                        } break;
            }
        } while (opcion != 0); //Usamos 0 para salir
    }
}
