package controllers.impl;

import controllers.EmpleadoDAO;
import models.Empleado;

import java.util.TreeMap;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    private TreeMap<Empleado, Empleado> empleados;
    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>();
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado,empleado);

    }

    @Override
    public void listarEmpleados() {
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
    }

    @Override
    public void detalleEmpleado(int id) {
        empleados.remove(empleados.get(id));
    }
}
