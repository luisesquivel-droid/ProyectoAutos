package mx.uam.cua.agenciaautos.Mapper;

import mx.uam.cua.agenciaautos.DTO.CotizacionDTO;
import mx.uam.cua.agenciaautos.Entity.cotizacionEntity;

public interface CotizacionMapper {
    CotizacionDTO toCotizacionesDTO(cotizacionEntity cotizacionEntity);
    cotizacionEntity toCotizacionEntity(CotizacionDTO cotizacionDTO);
}
