package mx.uam.cua.agenciaautos.Mapper;

import mx.uam.cua.agenciaautos.DTO.ClientesDTO;
import mx.uam.cua.agenciaautos.Entity.ClienteEntity;

public interface ClienteMapper {
    ClientesDTO toClienteDTO(ClienteEntity clienteEntity);
    ClienteEntity toClienteEntity(ClientesDTO clientesDTO);
}