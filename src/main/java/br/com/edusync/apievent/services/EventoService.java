package br.com.edusync.apievent.services;

import br.com.edusync.apievent.models.Evento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventoService {

    private List<Evento> eventos = new ArrayList<>();
    public void adicionar(Evento eventoQueSeraSalvo) {
        eventos.add(eventoQueSeraSalvo);
    }

    public List<Evento> listarTudo() {
        return eventos;
    }

    public Evento buscarPorCogido(Integer codigo) {
        return eventos.stream().filter(p -> codigo.equals(p.getCodigo())).findFirst().orElseThrow();
    }

    public void update(Integer codigo, Evento evento) {
        remover(codigo);
        adicionar(evento);
    }

    public void remover(Integer codigo) {
        Evento eventoPesquisa = buscarPorCogido(codigo);
        if (eventoPesquisa != null) {
            eventos.remove(eventoPesquisa);
        }
    }
}
