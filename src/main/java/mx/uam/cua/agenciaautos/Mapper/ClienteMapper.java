package mx.uam.cua.agenciaautos.Mapper;

import mx.uam.cua.agenciaautos.DTO.DTOclientes;
import mx.uam.cua.agenciaautos.Entity.ClienteEntity;

public interface ClienteMapper {
    ClienteEntity toClienteEntity(DTOclientes dtoclientes);
    DTOclientes toDtoClientes(ClienteEntity clienteEntity);
}