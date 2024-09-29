package gian.empleados.repository;

import gian.empleados.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
}
