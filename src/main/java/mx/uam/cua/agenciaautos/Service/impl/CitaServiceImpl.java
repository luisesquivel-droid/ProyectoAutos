package mx.uam.cua.agenciaautos.Service.impl;

import mx.uam.cua.agenciaautos.DTO.CitaDTO;
import mx.uam.cua.agenciaautos.Entity.CitaEntity;
import mx.uam.cua.agenciaautos.Mapper.CitaMapper;
import mx.uam.cua.agenciaautos.Repository.CitaRepository;
import mx.uam.cua.agenciaautos.Service.CitaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    private final CitaMapper citaMapper;
    private final CitaRepository citaRepository;

    public CitaServiceImpl(CitaMapper citaMapper, CitaRepository citaRepository) {
        this.citaMapper = citaMapper;
        this.citaRepository = citaRepository;
    }

    @Override
    public CitaDTO save(CitaDTO citaDTO) {
        CitaEntity cita = citaMapper.toCitaEntity(citaDTO);
        cita = citaRepository.save(cita);
        return citaMapper.toCitaDTO(cita);
    }

    @Override
    public List<CitaDTO> findAll() {
        List<CitaEntity> citas = citaRepository.findAll();
        List<CitaDTO> citaDtos = new ArrayList<>();

        for (CitaEntity citaEntity : citas) {
            citaDtos.add(citaMapper.toCitaDTO(citaEntity));
        }
        return citaDtos;
    }

    @Override
    public List<CitaDTO> findByClienteId(Long clientesIdclientes) {
        List<CitaEntity> citas = citaRepository.findAllByClientesIdclientes(clientesIdclientes);
        List<CitaDTO> citaDtos = new ArrayList<>();

        for (CitaEntity citaEntity : citas) {
            citaDtos.add(citaMapper.toCitaDTO(citaEntity));
        }
        return citaDtos;
    }

    @Override
    public CitaDTO findById(Long idCita) {
        CitaEntity citaEntity = citaRepository.findById(idCita)
                .orElseThrow(() -> new RuntimeException("La cita con el ID: " + idCita + " no se encontró."));
        return citaMapper.toCitaDTO(citaEntity);
    }
}