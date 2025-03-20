package co.ucentral.bkedgame.persistencia.repositorios;

import co.ucentral.bkedgame.persistencia.entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Equiporepositorio extends JpaRepository<Equipo, Long> {
}
