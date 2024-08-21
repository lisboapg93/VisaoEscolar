package com.educacao.visaoescolar.repository;

import com.educacao.visaoescolar.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
}
