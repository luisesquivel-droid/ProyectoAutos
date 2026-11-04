package mx.uam.cua.agenciaautos.Service;

import mx.uam.cua.agenciaautos.DTO.CotizacionDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface CotizacionesService {

    CotizacionDTO save(CotizacionDTO cotizacionDTO);

    List<CotizacionDTO>findAll();

    List<CotizacionDTO>findByFecha(LocalDateTime fechcotizacion);

    CotizacionDTO findById(Long idcotizacion);
}
