package co.ucentral.bkedgame.servicios;

import co.ucentral.bkedgame.dto.EquipoDto;
import co.ucentral.bkedgame.persistencia.entidades.Equipo;
import co.ucentral.bkedgame.persistencia.repositorios.Equiporepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EquipoServicio {
    Equiporepositorio equiporepositorio;

    public List<Equipo> obtenerEquipos()
    {
        return equiporepositorio.findAll();
    }

    public EquipoDto crear(EquipoDto equipoDto){
        Equipo equipo = Equipo.builder()
                .nombre(equipoDto.nombre())
                .nombreCorto(equipoDto.nombreCorto())
                .fechaCreacion(equipoDto.fechaCreacion())
                .fechaRegistro(LocalDateTime.now())
                .build();

        if (equiporepositorio.save(equipo).getId()>0)
            return  equipoDto;
        else return null;
        //return equiporepositorio.save(equipo);
    }

    public Equipo obtenerxNombre(String nombre){
        return equiporepositorio.findByNombre(nombre);
    }

    public Equipo obtenerxPK(Long pk){
        return  equiporepositorio.findById(pk).orElseThrow(null);
    }
}