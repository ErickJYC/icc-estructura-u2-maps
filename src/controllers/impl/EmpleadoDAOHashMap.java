package controllers.impl;

import controllers.EmpleadoDAO;
import models.Empleado;

import java.util.HashMap;
import java.util.TreeMap;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private HashMap<Empleado, Empleado> empleados;
    public EmpleadoDAOHashMap() {
        this.empleados = new HashMap<>();
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void listarEmpleados() {
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
    }

    @Override
    public void detalleEmpleado(int id) {
        empleados.get(empleados.get(id));

    }
}
