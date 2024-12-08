package br.com.edusync.apievent.repositories.criteria;

import br.com.edusync.apievent.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventoRepository extends JpaRepository <Evento, Integer> {

    public List<Evento> findBy
}
