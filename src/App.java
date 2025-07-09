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
        System.out.println("---------------------------------------EJERCICIOS---------------------------");
        Ejercicios ejercicios = new Ejercicios();

        // Ejercicio 1: Verificar si son anagramas
        String str1 = "listen";
        String str2 = "silent";
        boolean anagramResult = Ejercicios.areAnagrams(str1, str2);
        System.out.println("¿" + str1 + " y " + str2 + " son anagramas? " + anagramResult);

        // Ejercicio 2: Sumatoria de dos
        int[] numeros = {9, 2, 3, 6};
        int objetivo = 5;
        int[] resultado = ejercicios.sumatoriaDeDos(numeros, objetivo);
        if (resultado != null) {
            System.out.println("Índices que suman " + objetivo + ": [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontró una combinación que sume " + objetivo);
        }

        // Ejercicio 3: Contar caracteres
        String texto = "hola";
        System.out.println("Conteo de caracteres en " + texto + " : ");
        ejercicios.contarCaracteres(texto);

        // Ejercicio 4: Verificar si son anagramas usando método no estático
        String palabra1 = "roma";
        String palabra2 = "amor";
        boolean resultado2 = ejercicios.sonAnagramas(palabra1, palabra2);
        System.out.println("¿" + palabra1 + " y " + palabra2 + " son anagramas? " + resultado2);

    }
}
