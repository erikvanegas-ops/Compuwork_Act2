package GestionEmpleados;

// Creamos el CRUD para gestión de empleados
import java.util.ArrayList;//Nos ayuda a crear la lista de empleados
import java.util.Scanner;

public class GestorEmpleados { //Creamos dos listas:
    private ArrayList<Empleado> empleados;//1 para empleados
    private ArrayList<Departamento> departamentos;//1 para Departamentos
    private Scanner scanner = new Scanner(System.in);
    
    public GestorEmpleados() {//Creamos nuevos objetos de cada lista
        empleados = new ArrayList<>();
        departamentos = new ArrayList<>();
    }
    
    // Creamos el CRUD (Create _ Rename _ Update _ Delete) para empleados
    public void crearEmpleado() {
        System.out.print("ID: "); String id = scanner.nextLine(); //Pedimos ID
        System.out.print("Nombre: "); 
        String nombre = scanner.nextLine(); //Pedimos Nombre
        System.out.print("Tipo (Permanente/Temporal): "); //Pedimos tipo de empleado
        String tipo = scanner.nextLine();
        
        //Mediante condicional if almacenamos datos según el tipo de empleado
        if (tipo.equalsIgnoreCase("Permanente")) {
            System.out.print("Salario base: "); 
            double sal = scanner.nextDouble();
            System.out.print("Bono anual: "); 
            double bono = scanner.nextDouble();
            scanner.nextLine();  // Limpiamos
            empleados.add(new EmpleadoPermanente(id, nombre, sal, bono));
        } else {
            System.out.print("Horas mensuales: "); 
            int horas = scanner.nextInt();
            System.out.print("Tarifa hora: "); 
            double tarifa = scanner.nextDouble();
            scanner.nextLine();
            empleados.add(new EmpleadoTemporal(id, nombre, horas, tarifa));
        }
        System.out.println("Empleado creado");
    }
    
    public void actualizarEmpleado() {
        System.out.print("ID a actualizar: "); 
        String id = scanner.nextLine();
        Empleado emp = buscarEmpleado(id);
        if (emp != null) { 
            System.out.print("Nuevo nombre: "); 
            emp.setNombre(scanner.nextLine());
            System.out.println("Actualizado");
        }
    }
    
    public void eliminarEmpleado() {
        System.out.print("ID a eliminar: "); 
        String id = scanner.nextLine();
        Empleado emp = buscarEmpleado(id);
        if (emp != null) {
            for (Departamento dept : departamentos) {
                dept.eliminarEmpleado(emp);
            }
            empleados.remove(emp);
            System.out.println("✓ Eliminado");
        }
    }
    
    // Asignamos o cambiamos Departamento
    public void asignarDepartamento() {
        System.out.print("ID empleado: "); 
        String idEmp = scanner.nextLine();
        Empleado emp = buscarEmpleado(idEmp);
        if (emp != null) {
            mostrarDepartamentos();
            System.out.print("ID depto (D0, D1...): "); 
            String idDept = scanner.nextLine();
            Departamento dept = buscarDepartamento(idDept);
            if (idDept != null) {
                emp.asignarDepartamento(dept);
            }
        }
    }
    
    // Hacemos las consultas, se comparan y muestran
    private Empleado buscarEmpleado(String id) {
        for (Empleado emp : empleados) {
            if (emp.getId().equals(id)) 
                return emp; //Si Id coincide devuelve empleado
        }
        System.out.println("No encontrado");
        return null;
    }
    
    private Departamento buscarDepartamento(String id) {
        int index = Integer.parseInt(id.substring(1));
        if (index < departamentos.size()) 
            return departamentos.get(index);
        return null;
    }
    
    public void mostrarEmpleados() {
        System.out.println("\n=== TODOS LOS EMPLEADOS ===");
        for (Empleado emp : empleados) {
            System.out.println(emp);
        }
    }
    
    public void mostrarDepartamentos() {
        System.out.println("\n=== DEPARTAMENTOS ===");
        for (int i = 0; 
                i < departamentos.size(); i++) {
            System.out.println("D" + i + ": " + departamentos.get(i));
        }
    }
    
    public void crearDepartamento() {
        System.out.print("Nombre depto: "); 
        String nom = scanner.nextLine();
        departamentos.add(new Departamento(nom));
        System.out.println("Departamento creado");
    }
    
    // Getters para acceso a lista de Empleados y Departamentos
    public ArrayList<Empleado> getEmpleados() { 
        return empleados; }
    public ArrayList<Departamento> getDepartamentos() { 
        return departamentos; }
      
}
