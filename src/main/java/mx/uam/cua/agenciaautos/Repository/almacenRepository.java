
package mx.uam.cua.agenciaautos.Repository;

import mx.uam.cua.agenciaautos.Entity.almacenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface almacenRepository extends JpaRepository<almacenEntity, Long> {

    @Query("SELECT a FROM almacenEntity a WHERE a.nom_sucursal = :nombre")
    List<almacenEntity> buscarPorSucursal(@Param("nombre") String nom_sucursal);
}
