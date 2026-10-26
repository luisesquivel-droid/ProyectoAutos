package mx.uam.cua.agenciaautos.Mapper.impl;

import mx.uam.cua.agenciaautos.DTO.CitaDTO;
import mx.uam.cua.agenciaautos.Entity.CitaEntity;
import mx.uam.cua.agenciaautos.Mapper.CitaMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CitaMapperImpl implements CitaMapper {

    @Override
    public CitaEntity toCitaEntity(CitaDTO citaDTO) {
        CitaEntity citaEntity = new CitaEntity();
        BeanUtils.copyProperties(citaDTO, citaEntity);
        return citaEntity;
    }

    @Override
    public CitaDTO toCitaDTO(CitaEntity citaEntity) {
        CitaDTO citaDTO = new CitaDTO();
        BeanUtils.copyProperties(citaEntity, citaDTO);
        return citaDTO;
    }
}
