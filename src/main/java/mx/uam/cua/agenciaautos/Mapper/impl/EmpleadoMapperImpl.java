package mx.uam.cua.agenciaautos.Mapper.impl;

import mx.uam.cua.agenciaautos.DTO.EmpleadoDTO;
import mx.uam.cua.agenciaautos.Entity.EmpleadoEntity;
import mx.uam.cua.agenciaautos.Mapper.EmpleadoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class EmpleadoMapperImpl implements EmpleadoMapper {

    @Override
    public EmpleadoEntity toEmpleadoEntity(EmpleadoDTO empleadoDTO) {
        EmpleadoEntity empleadoEntity = new EmpleadoEntity();
        BeanUtils.copyProperties(empleadoDTO, empleadoEntity);
        return empleadoEntity;
    }

    @Override
    public EmpleadoDTO toEmpleadoDTO(EmpleadoEntity empleadoEntity) {
        EmpleadoDTO empleadoDTO = new EmpleadoDTO();
        BeanUtils.copyProperties(empleadoEntity, empleadoDTO);
        return empleadoDTO;
    }
}
