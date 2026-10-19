package mx.uam.cua.agenciaautos.Mapper.impl;

import mx.uam.cua.agenciaautos.DTO.DTOclientes;
import mx.uam.cua.agenciaautos.Entity.ClienteEntity;
import mx.uam.cua.agenciaautos.Mapper.ClienteMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteEntity toClienteEntity(DTOclientes dtoclientes) {
        if (dtoclientes == null) {
            return null;
        }
        ClienteEntity clienteEntity = new ClienteEntity();
        BeanUtils.copyProperties(dtoclientes, clienteEntity);
        return clienteEntity;
    }

    @Override
    public DTOclientes toDtoClientes(ClienteEntity clienteEntity) {
        if (clienteEntity == null) {
            return null;
        }
        DTOclientes dtoclientes = new DTOclientes();
        BeanUtils.copyProperties(clienteEntity, dtoclientes);
        return dtoclientes;
    }
}