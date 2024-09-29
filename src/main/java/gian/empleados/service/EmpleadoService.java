package gian.empleados.service;

import gian.empleados.model.Empleado;
import gian.empleados.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService implements IEmpladoService{

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado findByIdEmpleado(Integer idEmpleado) {
        Empleado empleado = empleadoRepository.findById(idEmpleado).orElse(null);
        return empleado;
    }

    @Override
    public void saveEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    @Override
    public void deleteEmpleado(Empleado empleado) {
        empleadoRepository.delete(empleado);
    }
}
