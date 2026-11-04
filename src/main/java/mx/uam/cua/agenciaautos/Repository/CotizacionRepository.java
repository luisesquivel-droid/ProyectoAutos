package mx.uam.cua.agenciaautos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.uam.cua.agenciaautos.Entity.cotizacionEntity;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CotizacionRepository extends JpaRepository<cotizacionEntity, Long > {
    List<cotizacionEntity> findAllByfechcotizacion(LocalDateTime fechcotizacion);
}
