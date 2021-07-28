package com.vitor.controlePontoAcessobackend.repository;

import com.vitor.controlePontoAcessobackend.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long> {
}
