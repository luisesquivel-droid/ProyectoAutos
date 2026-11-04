package mx.uam.cua.agenciaautos.Mapper.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import mx.uam.cua.agenciaautos.Mapper.CotizacionMapper;
import mx.uam.cua.agenciaautos.Entity.cotizacionEntity;
import mx.uam.cua.agenciaautos.DTO.CotizacionDTO;

@Component
public class CotizacionMapperImpl implements CotizacionMapper{

    @Override
    public cotizacionEntity toCotizacionEntity(CotizacionDTO cotizacionDTO){
        cotizacionEntity cotizacionEntity = new cotizacionEntity();
        BeanUtils.copyProperties(cotizacionDTO, cotizacionEntity);
        return cotizacionEntity;
    }

    @Override
    public CotizacionDTO toCotizacionesDTO(cotizacionEntity cotizacionEntity){
        CotizacionDTO cotizacionDTO = new CotizacionDTO();
        BeanUtils.copyProperties(cotizacionEntity, cotizacionDTO);
        return cotizacionDTO;
    }
}
