package mx.uam.cua.agenciaautos.Service.impl;

import mx.uam.cua.agenciaautos.DTO.DTOclientes;
import mx.uam.cua.agenciaautos.Entity.ClienteEntity;
import mx.uam.cua.agenciaautos.Mapper.ClienteMapper;
import mx.uam.cua.agenciaautos.Repository.ClienteRepository;
import mx.uam.cua.agenciaautos.Service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements ClienteService {

    private final ClienteMapper clienteMapper;
    private final ClienteRepository clienteRepository;

    public UserServiceImpl(ClienteMapper clienteMapper, ClienteRepository clienteRepository) {
        this.clienteMapper = clienteMapper;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public DTOclientes save(DTOclientes dtoclientes) {
        // Usamos la instancia inyectada (clienteMapper), no la clase (ClienteMapper)
        ClienteEntity clienteEntity = this.clienteMapper.toClienteEntity(dtoclientes);
        clienteEntity = this.clienteRepository.save(clienteEntity);
        return this.clienteMapper.toDtoClientes(clienteEntity);
    }
}