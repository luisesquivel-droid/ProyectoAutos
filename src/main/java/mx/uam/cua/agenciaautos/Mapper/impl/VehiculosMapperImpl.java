package mx.uam.cua.agenciaautos.Mapper.impl;

import mx.uam.cua.agenciaautos.Mapper.VehiculosMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import mx.uam.cua.agenciaautos.Entity.VehiculosEntity;
import mx.uam.cua.agenciaautos.DTO.VehiculosDTO;

@Component
public class VehiculosMapperImpl implements VehiculosMapper {

    @Override
    public VehiculosEntity toVehuculosEntity(VehiculosDTO vehiculosDTO){
        VehiculosEntity vehiculosEntity= new VehiculosEntity();
        BeanUtils.copyProperties(vehiculosDTO, vehiculosEntity);
        return vehiculosEntity;
    }

    @Override
    public VehiculosDTO toVehiculoDTO(VehiculosEntity vehiculosEntity){
        VehiculosDTO vehiculosDTO = new VehiculosDTO();
        BeanUtils.copyProperties(vehiculosEntity, vehiculosDTO);
        return vehiculosDTO;
    }
}
