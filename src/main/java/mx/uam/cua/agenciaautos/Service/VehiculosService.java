package mx.uam.cua.agenciaautos.Service;

import mx.uam.cua.agenciaautos.DTO.VehiculosDTO;

import java.util.List;

public interface VehiculosService {

    VehiculosDTO save(VehiculosDTO vehiculoDTO);

    List<VehiculosDTO>findAll();

    List<VehiculosDTO>findAllByMarca(String marca);

    VehiculosDTO findById(Long id_vehiculos);
}
