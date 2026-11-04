package mx.uam.cua.agenciaautos.Repository;

import mx.uam.cua.agenciaautos.Entity.VehiculosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiculosRepository extends JpaRepository<VehiculosEntity, Long> {
    List<VehiculosEntity> findAllByMarca(String marca);
}
