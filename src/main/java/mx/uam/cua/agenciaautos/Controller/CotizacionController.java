package mx.uam.cua.agenciaautos.Controller;

import mx.uam.cua.agenciaautos.DTO.CotizacionDTO;
import mx.uam.cua.agenciaautos.Service.CotizacionesService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(value = "ArchCotizaciones") //arch por archivo de cotizaciones
public class CotizacionController {

    private final CotizacionesService cotizacionesService;

    public CotizacionController (CotizacionesService cotizacionesService){
        this.cotizacionesService = cotizacionesService;
    }

    @PostMapping("/Cotizacion")
    public CotizacionDTO crearCotizacion(@RequestBody CotizacionDTO cotizacionDTO){
        return cotizacionesService.save(cotizacionDTO);
    }

    @GetMapping("/Cotizaciones")
    public List<CotizacionDTO>getCotizaciones(@RequestParam(required = false)LocalDateTime fech_cot){
        List<CotizacionDTO>cotizacionDTOs;
        if (fech_cot !=null){
            cotizacionDTOs = cotizacionesService.findByFecha(fech_cot);
        }else{
            cotizacionDTOs = cotizacionesService.findAll();
        }
        return cotizacionDTOs;
    }

    @GetMapping("/Cotizaciones/{id}")
    public CotizacionDTO getCotizacion(@PathVariable("id") Long idcotizacion){
        return cotizacionesService.findById(idcotizacion);
    }
}
