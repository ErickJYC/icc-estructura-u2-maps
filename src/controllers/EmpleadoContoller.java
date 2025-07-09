package controllers;

import java.util.HashMap;
import java.util.Map;

import controllers.impl.EmpleadoDAOHashMap;
import models.Empleado;

public class EmpleadoContoller {
    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoD) {
        this.empleadoDAO = empleadoD;
    }
    public void agregarEmpleado(Empleado empleado) {
        empleadoDAO.add(empleado);

    }
    public void eliminarEmpleado(int id) {
        empleadoDAO.detalleEmpleado(id);

    }
    public void listarEmpleados() {
        empleadoDAO.listarEmpleados();
    }
}