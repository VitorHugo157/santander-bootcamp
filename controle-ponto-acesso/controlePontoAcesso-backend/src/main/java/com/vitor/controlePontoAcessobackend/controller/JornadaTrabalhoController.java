package com.vitor.controlePontoAcessobackend.controller;

import com.vitor.controlePontoAcessobackend.model.JornadaTrabalho;
import com.vitor.controlePontoAcessobackend.service.JornadaTrabalhoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
@AllArgsConstructor
public class JornadaTrabalhoController {

    private JornadaTrabalhoService service;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return service.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return service.findAll();

    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return  ResponseEntity.ok(service.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return service.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity<String> deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            service.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok().body("Jornada de trabalho excluída com sucesso!");
    }
}
