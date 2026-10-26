package mx.uam.cua.agenciaautos.Controller;

import mx.uam.cua.agenciaautos.DTO.ClientesDTO;
import mx.uam.cua.agenciaautos.Service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class ClienteController {

    private final ClienteService clienteService;

    // Inyección de dependencias por constructor
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping("/cliente")
    public ClientesDTO createCliente(@RequestBody ClientesDTO clientesDTO) {
        return clienteService.save(clientesDTO);
    }

    @GetMapping("/clientes")
    public List<ClientesDTO>getClientes(@RequestParam(required = false)String nombre){
        List<ClientesDTO> clientesDTOS;
        if (nombre != null && !nombre.isEmpty()){
            clientesDTOS = clienteService.findByNombre(nombre);
        }else {
            clientesDTOS = clienteService.findAll();
        }

        return clientesDTOS;
    }

    @GetMapping("/clientes/{id}")
    public ClientesDTO getCliente(@PathVariable("id")Long idclientes){
        return clienteService.findById(idclientes);
    }

    @GetMapping("/clientes/nombre/{Nombre}")
    public List<ClientesDTO> getClienteByNombre(@PathVariable String Nombre){
        return clienteService.findByNombre(Nombre);
    }
}