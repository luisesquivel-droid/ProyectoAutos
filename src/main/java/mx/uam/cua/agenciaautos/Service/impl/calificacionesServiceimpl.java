

package mx.uam.cua.agenciaautos.Service.impl;

import mx.uam.cua.agenciaautos.DTO.calificacionesDTO;
import mx.uam.cua.agenciaautos.Entity.calificacionesEntity;
import mx.uam.cua.agenciaautos.Mapper.calificacionesMapper;
import mx.uam.cua.agenciaautos.Repository.calificacionesRepository;
import mx.uam.cua.agenciaautos.Service.calificacionesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class calificacionesServiceimpl implements calificacionesService {

    private final calificacionesRepository repository;
    private final calificacionesMapper mapper;

    public calificacionesServiceimpl(
            calificacionesRepository repository,
            calificacionesMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public calificacionesDTO calificaciones(calificacionesDTO dto) {
        calificacionesEntity entidad =
                mapper.tocalificacionesEntity(dto);

        calificacionesEntity guardada = repository.save(entidad);

        return mapper.tocalificacionesDTO(guardada);
    }

    @Override
    public List<calificacionesDTO> getCalificaciones() {
        return repository.findAll()
                .stream()
                .map(mapper::tocalificacionesDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<calificacionesDTO> getCalificaciones(Integer puntuacion) {
        return repository.findByPuntuacion(puntuacion)
                .stream()
                .map(mapper::tocalificacionesDTO)
                .collect(Collectors.toList());
    }

    @Override
    public calificacionesDTO getCalificacion(Integer id) {
        calificacionesEntity entidad = repository.findById(id).orElseThrow(() ->
                new RuntimeException("calificacion no encontrada"));
        return mapper.tocalificacionesDTO(entidad);
    }

    @Override
    public calificacionesDTO actualizarCalificacion(
            Integer id, calificacionesDTO dto) {

        calificacionesEntity entidad = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Calificación no encontrada"));

        entidad.setPuntuacion(dto.getPuntuacion());
        entidad.setComentario(dto.getComentario());
        entidad.setCalificacionescol(dto.getCalificacionescol());

        calificacionesEntity actualizada = repository.save(entidad);

        return mapper.tocalificacionesDTO(actualizada);
    }

    @Override
    public void eliminarCalificacion(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Calificación no encontrada");
        }

        repository.deleteById(id);
    }
}
