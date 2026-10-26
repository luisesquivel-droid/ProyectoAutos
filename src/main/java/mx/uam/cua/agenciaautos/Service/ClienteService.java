package mx.uam.cua.agenciaautos.Service;

import mx.uam.cua.agenciaautos.DTO.ClientesDTO;

import java.util.List;

public interface ClienteService {

    ClientesDTO save(ClientesDTO clientesDTO);

    List<ClientesDTO>findAll();

    List<ClientesDTO>findByNombre(String nombre);

    ClientesDTO findById(Long idclientes);
}
