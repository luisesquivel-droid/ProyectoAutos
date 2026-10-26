package mx.uam.cua.agenciaautos.Service.impl;

import mx.uam.cua.agenciaautos.DTO.ClientesDTO;
import mx.uam.cua.agenciaautos.Entity.ClienteEntity;
import mx.uam.cua.agenciaautos.Mapper.ClienteMapper;
import mx.uam.cua.agenciaautos.Repository.ClienteRepository;
import mx.uam.cua.agenciaautos.Service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteMapper clienteMapper;
    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteMapper clienteMapper, ClienteRepository clienteRepository) {
        this.clienteMapper = clienteMapper;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public ClientesDTO save(ClientesDTO clientesDTO) {
        ClienteEntity cliente =new ClienteEntity();
        cliente = clienteMapper.toClienteEntity(clientesDTO);
        cliente = clienteRepository.save(cliente);
        clientesDTO = clienteMapper.toClienteDTO(cliente);
        return clientesDTO;
    }

    @Override
    public List<ClientesDTO> findAll(){
        List<ClienteEntity> clientes = clienteRepository.findAll();
        List<ClientesDTO> clientesDtos = new ArrayList<>();

        for (ClienteEntity clienteEntity : clientes){
            clientesDtos.add(clienteMapper.toClienteDTO(clienteEntity));
        }
        return clientesDtos;
    }

    @Override
    public List<ClientesDTO> findByNombre(String nombre){
        List<ClienteEntity> clientes =clienteRepository.findAllByNombre(nombre);

        List<ClientesDTO>clientesDTOS=new ArrayList<>();

        for (ClienteEntity clienteEntity: clientes){
clientesDTOS.add(clienteMapper.toClienteDTO(clienteEntity));
        }
        return clientesDTOS;
    }

    @Override
    public ClientesDTO findById(Long idclientes){
        ClienteEntity clienteEntity=clienteRepository.findById(idclientes)
                .orElseThrow(() -> new RuntimeException("Elusuario con el ID: "+idclientes+ "No se encontro."));
        return clienteMapper.toClienteDTO(clienteEntity);
    }
}