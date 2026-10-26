package mx.uam.cua.agenciaautos.Mapper.impl;

import mx.uam.cua.agenciaautos.DTO.almacenDTO;
import mx.uam.cua.agenciaautos.Entity.almacenEntity;
import mx.uam.cua.agenciaautos.Mapper.almacenMapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component

public class almacenMapperimpl implements almacenMapper {
    @Override
    public almacenEntity toalmacenEntity(almacenDTO almacenDTO) {
        almacenEntity almacenEntity = new almacenEntity();
        BeanUtils.copyProperties(almacenDTO, almacenEntity);
        return almacenEntity;
    }

    @Override
    public almacenDTO toalmacenDTO(almacenEntity almacenEntity) {
        almacenDTO almacenDTO = new almacenDTO();
        BeanUtils.copyProperties(almacenEntity, almacenDTO);
        return almacenDTO;
    }
}
