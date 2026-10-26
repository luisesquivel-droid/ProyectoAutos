package mx.uam.cua.agenciaautos.Repository;

import mx.uam.cua.agenciaautos.Entity.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {
    List<EmpleadoEntity> findAllByNombre(String nombre);
}
