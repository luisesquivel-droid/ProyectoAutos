package mx.uam.cua.agenciaautos.Controller;

import mx.uam.cua.agenciaautos.DTO.EmpleadoDTO;
import mx.uam.cua.agenciaautos.Service.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class EmpleadoController {

     private final EmpleadoService empleadoService;

     public EmpleadoController(EmpleadoService empleadoService) {
          this.empleadoService = empleadoService;
     }

     @PostMapping("/empleado")
     public EmpleadoDTO createEmpleado(@RequestBody EmpleadoDTO empleadoDTO) {
          return empleadoService.save(empleadoDTO);
     }

     @GetMapping("/empleados")
     public List<EmpleadoDTO> getEmpleados(@RequestParam(required = false) String nombre) {
          if (nombre != null && !nombre.isEmpty()) {
               return empleadoService.findByNombre(nombre);
          } else {
               return empleadoService.findAll();
          }
     }

     @GetMapping("/empleados/{id}")
     public EmpleadoDTO getEmpleado(@PathVariable("id") Long idempleados) {
          return empleadoService.findById(idempleados);
     }

     @GetMapping("/empleados/nombre/{nombre}")
     public List<EmpleadoDTO> getEmpleadoByNombre(@PathVariable String nombre) {
          return empleadoService.findByNombre(nombre);
     }
}