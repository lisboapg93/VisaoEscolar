package com.educacao.visaoescolar.service;

import com.educacao.visaoescolar.dto.EstudanteDTO;
import com.educacao.visaoescolar.mappers.EstudanteMapper;
import com.educacao.visaoescolar.model.Estudante;
import com.educacao.visaoescolar.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    @Autowired
    private EstudanteMapper estudanteMapper;

    public List<EstudanteDTO> getAllEstudantes(){
        return estudanteRepository.findAll().stream()
            .map(estudanteMapper::toDTO)
                    .collect(Collectors.toList());

    }

    public Estudante getEstudanteById(Long id){
        return estudanteRepository.findById(id).orElse(null);
    }

    public EstudanteDTO saveEstudante(EstudanteDTO estudanteDTO) {
        Estudante estudante = estudanteMapper.toEntity(estudanteDTO);
        estudante = estudanteRepository.save(estudante);
        return estudanteMapper.toDTO(estudante);
    }

    public void deleteEstudante(Long id){
        estudanteRepository.deleteById(id);
    }
}
