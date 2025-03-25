package co.ucentral.bkedgame.servicios;

import co.ucentral.bkedgame.persistencia.entidades.Equipo;
import co.ucentral.bkedgame.persistencia.repositorios.Equiporepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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

    public Equipo crear(Equipo equipo){
        return equiporepositorio.save(equipo);
    }

    public Equipo obtenerxNombre(String nombre){
        return equiporepositorio.findByNombre(nombre);
    }

    public Equipo obtenerxPK(Long pk){
        return  equiporepositorio.findById(pk).orElseThrow(null);
    }
}