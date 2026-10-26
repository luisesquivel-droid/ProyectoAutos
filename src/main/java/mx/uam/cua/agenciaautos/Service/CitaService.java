package mx.uam.cua.agenciaautos.Service;

import mx.uam.cua.agenciaautos.DTO.CitaDTO;

import java.util.List;

public interface CitaService {
    CitaDTO save(CitaDTO citaDTO);
    List<CitaDTO> findAll();
    List<CitaDTO> findByClienteId(Long clientesIdclientes);
    CitaDTO findById(Long idCita);
}