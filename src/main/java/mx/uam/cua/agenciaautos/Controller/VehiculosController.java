package mx.uam.cua.agenciaautos.Controller;

import org.springframework.web.bind.annotation.*;
import mx.uam.cua.agenciaautos.Service.VehiculosService;
import mx.uam.cua.agenciaautos.DTO.VehiculosDTO;

import java.util.List;

@RestController
@RequestMapping(value = "/Dir")
public class VehiculosController {

    private final VehiculosService vehiculosService;

    public VehiculosController (VehiculosService vehiculosService){
        this.vehiculosService=vehiculosService;
    }

    @PostMapping("/vehiculos")
    public VehiculosDTO crearVehiculo(@RequestBody VehiculosDTO vehiculosDTOs){
        return vehiculosService.save(vehiculosDTOs);
    }

    @GetMapping("/vehiculosDir")
    public List<VehiculosDTO> getVehiculos(@RequestParam(required = false)String marca){
        List<VehiculosDTO> vehiculosDTOS;

        if (marca != null && !marca.isEmpty()){
            vehiculosDTOS = vehiculosService.findAllByMarca(marca);
        }else {
            vehiculosDTOS = vehiculosService.findAll();
        }
        return vehiculosDTOS;
    }

    @GetMapping("/vehiculosDir/{id}")
    public VehiculosDTO getVehiculos(@PathVariable("id")Long id_vehiculos) {
        return vehiculosService.findById(id_vehiculos);
    }

    @GetMapping("/vehiculosDir/marca/{marca}")
    public List<VehiculosDTO> getVehiculosByNombre(@PathVariable String marca){
        return vehiculosService.findAllByMarca(marca);
    }
}
