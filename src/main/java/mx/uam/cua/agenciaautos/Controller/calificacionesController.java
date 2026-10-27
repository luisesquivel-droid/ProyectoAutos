
package mx.uam.cua.agenciaautos.Controller;

import mx.uam.cua.agenciaautos.DTO.calificacionesDTO;
import mx.uam.cua.agenciaautos.Service.calificacionesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v5/calificaciones")
public class calificacionesController {

    private final calificacionesService calificacionesService;

    public calificacionesController(
            calificacionesService calificacionesService) {
        this.calificacionesService = calificacionesService;
    }

    @PostMapping
    public calificacionesDTO calificaciones(
            @RequestBody calificacionesDTO dto) {
        return calificacionesService.calificaciones(dto);
    }

    @GetMapping
    public List<calificacionesDTO> getCalificaciones(
            @RequestParam(required = false) Integer puntuacion) {

        if (puntuacion == null || puntuacion == -1) {
            return calificacionesService.getCalificaciones();
        }

        return calificacionesService.getCalificaciones(puntuacion);
    }

    @GetMapping("/{id}")
    public calificacionesDTO getCalificacionPorId(
            @PathVariable Integer id) {
        return calificacionesService.getCalificacion(id);
    }

    @PutMapping("/{id}")
    public calificacionesDTO actualizarCalificacion(
            @PathVariable Integer id,
            @RequestBody calificacionesDTO dto) {
        return calificacionesService.actualizarCalificacion(id, dto);
    }

    @DeleteMapping("/{id}")
    public void eliminarCalificacion(@PathVariable Integer id) {
        calificacionesService.eliminarCalificacion(id);
    }
}
