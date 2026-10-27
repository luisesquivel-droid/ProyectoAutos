
package mx.uam.cua.agenciaautos.Repository;

import mx.uam.cua.agenciaautos.Entity.calificacionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface calificacionesRepository
        extends JpaRepository<calificacionesEntity, Integer> {

    List<calificacionesEntity> findByPuntuacion(int puntuacion);
}
