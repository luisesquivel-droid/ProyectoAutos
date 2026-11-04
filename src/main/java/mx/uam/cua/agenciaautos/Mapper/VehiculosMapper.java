package mx.uam.cua.agenciaautos.Mapper;

import mx.uam.cua.agenciaautos.DTO.VehiculosDTO;
import mx.uam.cua.agenciaautos.Entity.VehiculosEntity;
import org.springframework.stereotype.Component;

@Component
public interface VehiculosMapper {
    VehiculosDTO toVehiculoDTO(VehiculosEntity vehiculoEntity);
    VehiculosEntity toVehuculosEntity(VehiculosDTO vehiculoDTO);
}
