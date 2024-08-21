package com.educacao.visaoescolar.service;

import com.educacao.visaoescolar.dto.FuncionarioDTO;
import com.educacao.visaoescolar.mappers.EstudanteMapper;
import com.educacao.visaoescolar.mappers.FuncionariopMapper;
import com.educacao.visaoescolar.model.Funcionario;
import com.educacao.visaoescolar.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private FuncionariopMapper funcionariopMapper;

    public List<FuncionarioDTO> getAllFuncionarios(){
        return funcionarioRepository.findAll().stream()
                .map(funcionariopMapper::toDTO)
                .collect(Collectors.toList());
    }

    public Funcionario getFuncionarioById(Long id){
        return funcionarioRepository.findById(id).orElse(null);
    }

    public FuncionarioDTO saveFuncionario(FuncionarioDTO funcionarioDTO){
        Funcionario funcionario = funcionariopMapper.toEntity(funcionarioDTO);
        funcionario = funcionarioRepository.save(funcionario);
        return funcionariopMapper.toDTO(funcionario);
    }

    public void deleteFuncionario(Long id){
        funcionarioRepository.deleteById(id);
    }
}
