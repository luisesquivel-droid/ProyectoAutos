
package mx.uam.cua.agenciaautos.Controller;

import mx.uam.cua.agenciaautos.DTO.almacenDTO;
import mx.uam.cua.agenciaautos.Service.almacenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/almacen")
public class almacenController {

    private final almacenService almacenService;

    public almacenController(almacenService almacenService) {
        this.almacenService = almacenService;
    }

    @PostMapping
    public almacenDTO almacen(@RequestBody almacenDTO almacenDTO) {
        return this.almacenService.almacen(almacenDTO);
    }

    @GetMapping
    public List<almacenDTO> getalmacen(
            @RequestParam(required = false) String nom_sucursal) {

        if (nom_sucursal == null || nom_sucursal.isBlank()) {
            return almacenService.getalmacen();
        }

        return almacenService.getalmacen(nom_sucursal);
    }

    @GetMapping("/{id}")
    public almacenDTO getalmacen(@PathVariable Long id) {
        return almacenService.getalmacen(id);
    }

    @GetMapping("/nom_sucursal/{nom_sucursal}")
    public List<almacenDTO> getalmacenNomSucursal(
            @PathVariable String nom_sucursal) {

        return almacenService.getalmacen(nom_sucursal);
    }
}
