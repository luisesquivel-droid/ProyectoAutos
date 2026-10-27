
package mx.uam.cua.agenciaautos.Mapper;

import mx.uam.cua.agenciaautos.DTO.calificacionesDTO;
import mx.uam.cua.agenciaautos.Entity.calificacionesEntity;

public interface calificacionesMapper {

    calificacionesDTO tocalificacionesDTO(
            calificacionesEntity entidad);

    calificacionesEntity tocalificacionesEntity(
            calificacionesDTO dto);
}
