package mx.uam.cua.agenciaautos.Service.impl;

import mx.uam.cua.agenciaautos.DTO.CotizacionDTO;
import mx.uam.cua.agenciaautos.Entity.cotizacionEntity;
import mx.uam.cua.agenciaautos.Mapper.CotizacionMapper;
import mx.uam.cua.agenciaautos.Repository.CotizacionRepository;
import mx.uam.cua.agenciaautos.Service.CotizacionesService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class CotizacionServiceImpl implements CotizacionesService {

    private final CotizacionMapper cotizacionMapper;
    private final CotizacionRepository cotizacionRepository;

    public CotizacionServiceImpl(CotizacionMapper cotizacionMapper, CotizacionRepository cotizacionRepository){
        this.cotizacionMapper=cotizacionMapper;
        this.cotizacionRepository=cotizacionRepository;
    }

    @Override
    public CotizacionDTO save(CotizacionDTO cotizacionDTO){
        cotizacionEntity cotizacion=new cotizacionEntity();
        cotizacion = cotizacionMapper.toCotizacionEntity(cotizacionDTO);
        cotizacion = cotizacionRepository.save(cotizacion);
        cotizacionDTO = cotizacionMapper.toCotizacionesDTO(cotizacion);
        return  cotizacionDTO;
    }

    @Override
    public List<CotizacionDTO>findAll(){
        List<cotizacionEntity> cotizaciones = cotizacionRepository.findAll();
        List<CotizacionDTO>cotizacionDTOs = new ArrayList<>();

        for (cotizacionEntity cotizacionEntity: cotizaciones){
            cotizacionDTOs.add(cotizacionMapper.toCotizacionesDTO(cotizacionEntity));
        }
        return cotizacionDTOs;
    }

    @Override
    public List<CotizacionDTO> findByFecha(LocalDateTime fechcotizacion){
        List<cotizacionEntity> cotizaciones = cotizacionRepository.findAllByfechcotizacion(fechcotizacion);

        List<CotizacionDTO>cotizacionDTOs = new ArrayList<>();

        for(cotizacionEntity cotizacionEntity: cotizaciones){
            cotizacionDTOs.add(cotizacionMapper.toCotizacionesDTO(cotizacionEntity));
        }
        return cotizacionDTOs;
    }

    @Override
    public CotizacionDTO findById(Long idcotizacion){
        cotizacionEntity cotizacionEntity = cotizacionRepository.findById(idcotizacion)
                .orElseThrow(() ->new RuntimeException("La cotizacion con el ID:"+idcotizacion+" no existe."));
        return cotizacionMapper.toCotizacionesDTO(cotizacionEntity);
    }

}
