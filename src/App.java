import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.Mapa;

import controllers.impl.EmpleadoDAOHashMap;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoContoller  empleadoContoller = new EmpleadoContoller(empleadoDAOHash);

        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOHashMap();
        EmpleadoContoller   empleadoContollerDos = new EmpleadoContoller(empleadoDAOTree);

        Empleado emp1 = new Empleado(5,"Pedro","Dev");
        Empleado emp2 = new Empleado(3,"Juan","Dev");
        Empleado emp3 = new Empleado(1,"Jose","Dev");
        Empleado emp4 = new Empleado(2,"Pedro","Dev");
        Empleado emp5 = new Empleado(6,"Pedro","Dev");

        empleadoContoller.agregarEmpleado(emp1);
        empleadoContoller.agregarEmpleado(emp2);
        empleadoContoller.agregarEmpleado(emp3);
        empleadoContoller.agregarEmpleado(emp4);
        empleadoContoller.agregarEmpleado(emp5);

        empleadoContollerDos.agregarEmpleado(emp1);
        empleadoContollerDos.agregarEmpleado(emp2);
        empleadoContollerDos.agregarEmpleado(emp3);
        empleadoContollerDos.agregarEmpleado(emp4);
        empleadoContollerDos.agregarEmpleado(emp5);

        System.out.println("[---------------------EmpleadosHas-------------------------]");
        empleadoContoller.listarEmpleados();
        System.out.println("[---------------------Empleadostree------------------------]");
        empleadoContoller.listarEmpleados();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
