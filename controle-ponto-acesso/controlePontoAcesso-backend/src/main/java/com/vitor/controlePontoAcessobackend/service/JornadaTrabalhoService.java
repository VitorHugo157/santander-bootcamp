package com.vitor.controlePontoAcessobackend.service;

import com.vitor.controlePontoAcessobackend.model.JornadaTrabalho;
import com.vitor.controlePontoAcessobackend.repository.JornadaTrabalhoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class JornadaTrabalhoService {

    private JornadaTrabalhoRepository repository;

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return repository.save(jornadaTrabalho);

    }

    public List<JornadaTrabalho> findAll() {
        return repository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return repository.findById(idJornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return repository.save(jornadaTrabalho);

    }

    public void deleteJornada(Long idJornada) {
        repository.deleteById(idJornada);
    }
}
