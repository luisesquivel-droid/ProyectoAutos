package mx.uam.cua.agenciaautos.Repository;

import mx.uam.cua.agenciaautos.Entity.CitaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitaRepository extends JpaRepository<CitaEntity, Long> {
    List<CitaEntity> findAllByClientesIdclientes(Long clientesIdclientes);
}
