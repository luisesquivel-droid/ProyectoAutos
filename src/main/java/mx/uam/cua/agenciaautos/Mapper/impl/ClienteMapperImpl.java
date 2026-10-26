package mx.uam.cua.agenciaautos.Mapper.impl;

import mx.uam.cua.agenciaautos.DTO.ClientesDTO;
import mx.uam.cua.agenciaautos.Entity.ClienteEntity;
import mx.uam.cua.agenciaautos.Mapper.ClienteMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteEntity toClienteEntity(ClientesDTO clientesDTO) {
        ClienteEntity clienteEntity = new ClienteEntity();
        BeanUtils.copyProperties(clientesDTO, clienteEntity);   // DTO → entity
        clienteEntity.setPassword("PA55WORD");
        return clienteEntity;
    }

    @Override
    public ClientesDTO toClienteDTO(ClienteEntity clienteEntity) {
        ClientesDTO clientesDTO = new ClientesDTO();
        BeanUtils.copyProperties(clienteEntity, clientesDTO);   // entity → DTO
        return clientesDTO;
    }
}