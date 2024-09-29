package gian.empleados.controller;

import gian.empleados.model.Empleado;
import gian.empleados.service.EmpleadoService;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController {

    private static final Logger logger =
            LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private EmpleadoService empleadoService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String iniciar(ModelMap modelo) {
        List<Empleado> empleados = empleadoService.listarEmpleados();
        empleados.forEach((empleado -> logger.info(empleado.toString())));
        //compartimos el model con la vista
        modelo.put("empleados", empleados);
        return "index";//index.jsp
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.GET)
    public String mostrarAgregar() {
        return "agregar";//agregar.jsp
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public String agregar(@ModelAttribute("empleadoForma") Empleado empleado,
                          HttpServletRequest request) {
        logger.info("Empleado a agregar: " + empleado);
        empleadoService.saveEmpleado(empleado);
        return "redirect:/";//redirige al path "/"
    }

    @RequestMapping(value = "/editar", method = RequestMethod.GET)
    public String mostrarEditar(@RequestParam int idEmpleado, ModelMap modelo) {
        Empleado empleado = empleadoService.findByIdEmpleado(idEmpleado);
        logger.info("Empleado a editar: " + empleado);
        modelo.put("empleado", empleado);
        return "editar";//mostrar editar.jsp
    }

    @RequestMapping(value = "/editar", method = RequestMethod.POST)
    public String editar(@ModelAttribute("empleadoForma") Empleado empleado) {
        logger.info("Empleado a actualizar: " + empleado);
        empleadoService.saveEmpleado(empleado);
        return "redirect:/";//redirige al controlador "/"
    }

    @RequestMapping(value = "/eliminar", method = RequestMethod.GET)
    public String eliminar(@RequestParam int idEmpleado){
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(idEmpleado);
        empleadoService.deleteEmpleado(empleado);
        return "redirect:/";//index.jsp
    }


}
