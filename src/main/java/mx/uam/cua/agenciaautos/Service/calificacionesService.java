
package mx.uam.cua.agenciaautos.Service;

import mx.uam.cua.agenciaautos.DTO.calificacionesDTO;
import java.util.List;

public interface calificacionesService {

    calificacionesDTO calificaciones(calificacionesDTO dto);

    List<calificacionesDTO> getCalificaciones();

    List<calificacionesDTO> getCalificaciones(Integer puntuacion);

    calificacionesDTO getCalificacion(Integer id);

    calificacionesDTO actualizarCalificacion(Integer id, calificacionesDTO dto);

    void eliminarCalificacion(Integer id);
}
