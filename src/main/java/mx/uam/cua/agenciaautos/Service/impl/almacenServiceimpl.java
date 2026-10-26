
package mx.uam.cua.agenciaautos.Service.impl;

import mx.uam.cua.agenciaautos.Entity.almacenEntity;
import mx.uam.cua.agenciaautos.Mapper.almacenMapper;
import mx.uam.cua.agenciaautos.Repository.almacenRepository;
import mx.uam.cua.agenciaautos.Service.almacenService;
import mx.uam.cua.agenciaautos.DTO.almacenDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class almacenServiceimpl implements almacenService {

    private final almacenMapper almacenMapper;
    private final almacenRepository almacenRepository;

    public almacenServiceimpl(almacenMapper almacenMapper,
                              almacenRepository almacenRepository) {
        this.almacenMapper = almacenMapper;
        this.almacenRepository = almacenRepository;
    }

    @Override
    public almacenDTO almacen(almacenDTO almacenDTO) {
        almacenEntity almacen = almacenMapper.toalmacenEntity(almacenDTO);
        almacen = almacenRepository.save(almacen);
        return almacenMapper.toalmacenDTO(almacen);
    }

    @Override
    public List<almacenDTO> getalmacen() {
        List<almacenEntity> almacenes = almacenRepository.findAll();
        List<almacenDTO> almacenDTO = new ArrayList<>();

        for (almacenEntity almacenEntity : almacenes) {
            almacenDTO.add(almacenMapper.toalmacenDTO(almacenEntity));
        }

        return almacenDTO;
    }

    @Override
    public almacenDTO getalmacen(Long id) {
        almacenEntity almacen = almacenRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException(
                                "No se encontró el almacén con ID: " + id));

        return almacenMapper.toalmacenDTO(almacen);
    }

    @Override
    public List<almacenDTO> getalmacen(String nom_sucursal) {
        List<almacenEntity> almacenes =
                almacenRepository.buscarPorSucursal(nom_sucursal);

        List<almacenDTO> almacenDTO = new ArrayList<>();

        for (almacenEntity almacenEntity : almacenes) {
            almacenDTO.add(almacenMapper.toalmacenDTO(almacenEntity));
        }

        return almacenDTO;
    }
}
