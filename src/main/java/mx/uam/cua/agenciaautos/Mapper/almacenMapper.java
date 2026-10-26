package mx.uam.cua.agenciaautos.Mapper;

import mx.uam.cua.agenciaautos.DTO.almacenDTO;
import mx.uam.cua.agenciaautos.Entity.almacenEntity;

public interface almacenMapper {

    almacenDTO toalmacenDTO(almacenEntity almacenEntity);
    almacenEntity toalmacenEntity(almacenDTO almacenDTO);
}
