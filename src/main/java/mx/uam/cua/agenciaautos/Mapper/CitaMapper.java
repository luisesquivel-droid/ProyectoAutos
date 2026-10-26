package mx.uam.cua.agenciaautos.Mapper;

import mx.uam.cua.agenciaautos.DTO.CitaDTO;
import mx.uam.cua.agenciaautos.Entity.CitaEntity;

public interface CitaMapper {
    CitaDTO toCitaDTO(CitaEntity citaEntity);
    CitaEntity toCitaEntity(CitaDTO citaDTO);
}