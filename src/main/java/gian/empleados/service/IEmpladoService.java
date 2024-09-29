package gian.empleados.service;

import gian.empleados.model.Empleado;

import java.util.List;

public interface IEmpladoService {

    public List<Empleado> listarEmpleados();

    public Empleado findByIdEmpleado(Integer idEmpleado);

    public void saveEmpleado(Empleado empleado);

    public void deleteEmpleado(Empleado empleado);
}
