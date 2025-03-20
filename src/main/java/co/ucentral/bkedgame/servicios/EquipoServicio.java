package co.ucentral.bkedgame.servicios;

import co.ucentral.bkedgame.persistencia.entidades.Equipo;
import co.ucentral.bkedgame.persistencia.repositorios.Equiporepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipoServicio {
    Equiporepositorio equiporepositorio;

    public List<Equipo> obtenerEquipos()
    {
        return equiporepositorio.findAll();
    }
}
