package mx.uam.cua.agenciaautos.Mapper.impl;

import mx.uam.cua.agenciaautos.DTO.calificacionesDTO;
import mx.uam.cua.agenciaautos.Entity.calificacionesEntity;
import mx.uam.cua.agenciaautos.Mapper.calificacionesMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class calificacionesMapperimpl
        implements calificacionesMapper {

    @Override
    public calificacionesDTO tocalificacionesDTO(
            calificacionesEntity entidad) {

        calificacionesDTO dto = new calificacionesDTO();
        BeanUtils.copyProperties(entidad, dto);
        return dto;
    }

    @Override
    public calificacionesEntity tocalificacionesEntity(
            calificacionesDTO dto) {

        calificacionesEntity entidad = new calificacionesEntity();
        BeanUtils.copyProperties(dto, entidad);
        return entidad;
    }
}
