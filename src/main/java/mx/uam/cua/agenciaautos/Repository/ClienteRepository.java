package mx.uam.cua.agenciaautos.Repository;

import mx.uam.cua.agenciaautos.Entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    List<ClienteEntity> findAllByNombre(String nombre);
}