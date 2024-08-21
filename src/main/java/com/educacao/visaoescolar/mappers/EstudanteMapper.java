package com.educacao.visaoescolar.mappers;

import com.educacao.visaoescolar.dto.EstudanteDTO;
import com.educacao.visaoescolar.model.Estudante;
import org.springframework.stereotype.Component;

@Component
public class EstudanteMapper {

    public EstudanteDTO toDTO(Estudante estudante){
        EstudanteDTO dto = new EstudanteDTO();
        dto.setId(estudante.getId());
        dto.setMatricula(estudante.getMatricula());
        dto.setNome(estudante.getNome());
        dto.setSobrenome(estudante.getSobrenome());
        dto.setEmail(estudante.getEmail());
        dto.setRg(estudante.getRg());
        dto.setCpf(estudante.getCpf());
        dto.setEndereco(estudante.getEndereco());
        dto.setTelefone(estudante.getTelefone());
        dto.setNomeDaMae(estudante.getNomeDaMae());
        dto.setTelefoneDaMae(estudante.getTelefoneDaMae());
        dto.setNomeDoPai(estudante.getNomeDoPai());
        dto.setTelefoneDoPai(estudante.getTelefoneDoPai());
        return dto;
    }

    public Estudante toEntity(EstudanteDTO dto){
        Estudante estudante = new Estudante();
        estudante.setId(dto.getId());
        estudante.setMatricula(dto.getMatricula());
        estudante.setNome(dto.getNome());
        estudante.setSobrenome(dto.getSobrenome());
        estudante.setEmail(dto.getEmail());
        estudante.setRg(dto.getRg());
        estudante.setCpf(dto.getCpf());
        estudante.setEndereco(dto.getEndereco());
        estudante.setTelefone(dto.getTelefone());
        estudante.setNomeDaMae(dto.getNomeDaMae());
        estudante.setTelefoneDaMae(dto.getTelefoneDaMae());
        estudante.setNomeDoPai(dto.getNomeDoPai());
        estudante.setTelefoneDoPai(dto.getTelefoneDoPai());
        estudante.setDataDeNascimento(dto.getDataDeNascimento());
        return estudante;
    }

}
