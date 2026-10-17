package mx.uam.cua.agenciaautos.Controller;

import mx.uam.cua.agenciaautos.DTO.DTOclientes;
import mx.uam.cua.agenciaautos.Service.ClienteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    // Inyección de dependencias por constructor
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public DTOclientes save(@RequestBody DTOclientes dtoclientes) {
        return this.clienteService.save(dtoclientes);
    }
}