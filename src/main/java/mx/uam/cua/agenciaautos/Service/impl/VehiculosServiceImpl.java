package mx.uam.cua.agenciaautos.Service.impl;

import mx.uam.cua.agenciaautos.Mapper.VehiculosMapper;
import mx.uam.cua.agenciaautos.Repository.VehiculosRepository;
import mx.uam.cua.agenciaautos.DTO.VehiculosDTO;
import mx.uam.cua.agenciaautos.Entity.VehiculosEntity;
import mx.uam.cua.agenciaautos.Service.VehiculosService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehiculosServiceImpl implements VehiculosService {

    private final VehiculosMapper vehiculoMapper;
    private final VehiculosRepository vehiculosRepository;

    public VehiculosServiceImpl(VehiculosMapper vehiculoMapper, VehiculosRepository vehiculosRepository){
        this.vehiculoMapper= vehiculoMapper;
        this.vehiculosRepository= vehiculosRepository;
    }

    @Override
    public VehiculosDTO save(VehiculosDTO vehiculoDTO){
        VehiculosEntity vehiculos= new VehiculosEntity();
        vehiculos = vehiculoMapper.toVehuculosEntity(vehiculoDTO);
        vehiculos= vehiculosRepository.save(vehiculos);
        vehiculoDTO = vehiculoMapper.toVehiculoDTO(vehiculos);
        return vehiculoDTO;
    }

    @Override
    public List<VehiculosDTO> findAll(){
        List<VehiculosEntity> vehiculos = vehiculosRepository.findAll();
        List<VehiculosDTO> vehiculosDTOs = new ArrayList<>();

        for (VehiculosEntity vehiculosEntity: vehiculos){
            vehiculosDTOs.add(vehiculoMapper.toVehiculoDTO(vehiculosEntity));
        }
        return vehiculosDTOs;
    }

    @Override
    public List<VehiculosDTO>findAllByMarca(String marca){
        List<VehiculosEntity> vehiculos = vehiculosRepository.findAllByMarca(marca);

        List<VehiculosDTO> vehiculosDTOS = new ArrayList<>();

        for (VehiculosEntity vehiculosEntity: vehiculos){
            vehiculosDTOS.add(vehiculoMapper.toVehiculoDTO(vehiculosEntity));

        }
        return vehiculosDTOS;
    }

    @Override
    public VehiculosDTO findById(Long id_vehiculos){
        VehiculosEntity vehiculosEntity=vehiculosRepository.findById(id_vehiculos).orElseThrow(()-> new RuntimeException("El usuario con ID: "+id_vehiculos+" no existe."));
        return vehiculoMapper.toVehiculoDTO(vehiculosEntity);
    }

}
