package com.educacao.visaoescolar.repository;

import com.educacao.visaoescolar.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
