package mx.uam.cua.agenciaautos.Service.impl;

import mx.uam.cua.agenciaautos.DTO.EmpleadoDTO;
import mx.uam.cua.agenciaautos.Entity.EmpleadoEntity;
import mx.uam.cua.agenciaautos.Mapper.EmpleadoMapper;
import mx.uam.cua.agenciaautos.Repository.EmpleadoRepository;
import mx.uam.cua.agenciaautos.Service.EmpleadoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoMapper empleadoMapper;
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoServiceImpl(EmpleadoMapper empleadoMapper, EmpleadoRepository empleadoRepository) {
        this.empleadoMapper = empleadoMapper;
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public EmpleadoDTO save(EmpleadoDTO empleadoDTO) {
        EmpleadoEntity empleado = empleadoMapper.toEmpleadoEntity(empleadoDTO);
        empleado = empleadoRepository.save(empleado);
        return empleadoMapper.toEmpleadoDTO(empleado);
    }

    @Override
    public List<EmpleadoDTO> findAll() {
        List<EmpleadoEntity> empleados = empleadoRepository.findAll();
        List<EmpleadoDTO> empleadoDtos = new ArrayList<>();

        for (EmpleadoEntity empleadoEntity : empleados) {
            empleadoDtos.add(empleadoMapper.toEmpleadoDTO(empleadoEntity));
        }
        return empleadoDtos;
    }

    @Override
    public List<EmpleadoDTO> findByNombre(String nombre) {
        List<EmpleadoEntity> empleados = empleadoRepository.findAllByNombre(nombre);
        List<EmpleadoDTO> empleadoDtos = new ArrayList<>();

        for (EmpleadoEntity empleadoEntity : empleados) {
            empleadoDtos.add(empleadoMapper.toEmpleadoDTO(empleadoEntity));
        }
        return empleadoDtos;
    }

    @Override
    public EmpleadoDTO findById(Long idempleados) {
        EmpleadoEntity empleadoEntity = empleadoRepository.findById(idempleados)
                .orElseThrow(() -> new RuntimeException("El empleado con el ID: " + idempleados + " no se encontró."));
        return empleadoMapper.toEmpleadoDTO(empleadoEntity);
    }
}