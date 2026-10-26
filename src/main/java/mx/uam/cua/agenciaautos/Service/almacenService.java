
package mx.uam.cua.agenciaautos.Service;

import mx.uam.cua.agenciaautos.DTO.almacenDTO;
import java.util.List;

public interface almacenService {

    almacenDTO almacen(almacenDTO almacenDTO);

    List<almacenDTO> getalmacen();

    almacenDTO getalmacen(Long id);

    List<almacenDTO> getalmacen(String nom_sucursal);
}
