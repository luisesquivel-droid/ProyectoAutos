package mx.uam.cua.agenciaautos.Controller;

import mx.uam.cua.agenciaautos.DTO.CitaDTO;
import mx.uam.cua.agenciaautos.Service.CitaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class CitaController {

    private final CitaService citaService;

    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }

    @PostMapping("/cita")
    public CitaDTO createCita(@RequestBody CitaDTO citaDTO) {
        return citaService.save(citaDTO);
    }

    @GetMapping("/citas")
    public List<CitaDTO> getCitas(@RequestParam(required = false) Long clienteId) {
        if (clienteId != null) {
            return citaService.findByClienteId(clienteId);
        } else {
            return citaService.findAll();
        }
    }

    @GetMapping("/citas/{id}")
    public CitaDTO getCita(@PathVariable("id") Long idCita) {
        return citaService.findById(idCita);
    }
}