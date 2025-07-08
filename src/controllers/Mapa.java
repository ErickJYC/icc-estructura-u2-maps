package controllers;

import models.Empleado;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
    }
    public void ejemploConHashMap() {
        System.out.println("\n-----------------------------HasMap--------------------------");
        HashMap<String, String> capitales = new HashMap<String,String>();
        capitales.put("Ecuador","Quito");
        capitales.put("Peru","Lima");
        capitales.put("Colombia","Bogota");
        System.out.println(capitales.keySet());
        for (String key : capitales.keySet()) {
            System.out.println(" Pais " + key + " Capital: " + capitales.get(key));

        }
        // Ejemplo de acceso directo
        String capital = capitales.get("Ecuador");
        System.out.println(" La capital de Ecuador es: " + capital);

        System.out.println("\n-------------Empleados ID - Name - Position----------------");

        Map<Integer, Empleado> empleados = new HashMap<Integer,Empleado>();
        empleados.put(1, new Empleado(10, "Pedro", "Tester"));
        empleados.put(2, new Empleado(20, "Ana", "Dev"));
        empleados.put(3, new Empleado(30, "Luis", "Disenador"));
        empleados.put(1, new Empleado(10, "Pedro", "Tester"));

        for(Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println("Clave:"+entry.getKey() + " Valor: " + entry.getValue());
        }
        System.out.println("\n-------------EmpleadosDos ID - Name - Position--------------");

        Map<Empleado,Integer> empleadosDos = new HashMap<Empleado,Integer>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");


        empleadosDos.put(emp1, 1000);
        empleadosDos.put(emp2, 1200);
        empleadosDos.put(emp3, 1500);
        empleadosDos.put(emp4, 2000);

        for (Map.Entry<Empleado, Integer> entry : empleadosDos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
    public void ejemploConLinkedHashMap() {
        System.out.println("\n-----------------------------LinkedHashMap--------------------------");
        Map<String, Integer> producto = new LinkedHashMap<String,Integer>();
        producto.put("Peras", 20);
        producto.put("Paloma", 40);
        producto.put("Cafe", 10);
        producto.put("Chocolate", 50);
        producto.put("Naranja", 30);
        System.out.println(producto.keySet());
        for (String cantidad : producto.keySet()) {
            System.out.println(" Producto " + cantidad + " Valor: " + producto.get(cantidad));
        }

    }
    public void ejemploConTreeMap() {
        System.out.println("\n-----------------------------TreeMap--------------------------");
        Map<Integer, String> personas = new TreeMap<Integer,String>();
        personas.put(10, "Erick");
        personas.put(2, "Juan");
        personas.put(3, "Maria");
        personas.put(40, "Pedro");
        personas.put(5, "Jose");
        System.out.println(personas.keySet());
        for (int id : personas.keySet()) {
            System.out.println(" Persona " + id + " Nombre: " + personas.get(id));
        }

        System.out.println("\n-----------------------------ComparadorTreeMap--------------------------");

        Map<Empleado,Integer> empleadosDos = new TreeMap<Empleado,Integer>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");


        empleadosDos.put(emp1, 1000);
        empleadosDos.put(emp2, 1200);
        empleadosDos.put(emp3, 1500);
        empleadosDos.put(emp4, 2000);

        for (Map.Entry<Empleado, Integer> entry : empleadosDos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

}
