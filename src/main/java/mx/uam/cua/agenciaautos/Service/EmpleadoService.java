package mx.uam.cua.agenciaautos.Service;

import mx.uam.cua.agenciaautos.DTO.EmpleadoDTO;

import java.util.List;

public interface EmpleadoService {

    EmpleadoDTO save(EmpleadoDTO empleadoDTO);

    List<EmpleadoDTO> findAll();

    List<EmpleadoDTO> findByNombre(String nombre);

    EmpleadoDTO findById(Long idempleados);
}
