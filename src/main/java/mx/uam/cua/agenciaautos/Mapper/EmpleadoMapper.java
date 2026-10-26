package mx.uam.cua.agenciaautos.Mapper;

import mx.uam.cua.agenciaautos.DTO.EmpleadoDTO;
import mx.uam.cua.agenciaautos.Entity.EmpleadoEntity;

public interface EmpleadoMapper {
    EmpleadoDTO toEmpleadoDTO(EmpleadoEntity empleadoEntity);
    EmpleadoEntity toEmpleadoEntity(EmpleadoDTO empleadoDTO);
}