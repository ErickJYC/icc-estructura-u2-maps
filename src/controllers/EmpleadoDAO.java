package controllers;

import models.Empleado;

public interface EmpleadoDAO {
    void add(Empleado empleado);
    void listarEmpleados();
    void detalleEmpleado(int id);

}
