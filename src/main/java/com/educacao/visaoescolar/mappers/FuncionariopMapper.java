package com.educacao.visaoescolar.mappers;


import com.educacao.visaoescolar.dto.FuncionarioDTO;
import com.educacao.visaoescolar.model.Funcionario;
import org.springframework.stereotype.Component;


@Component
public class FuncionariopMapper {

    public FuncionarioDTO toDTO(Funcionario funcionario){
        FuncionarioDTO dto = new FuncionarioDTO();
        dto.setId(funcionario.getId());
        dto.setMatricula(funcionario.getMatricula());
        dto.setNome(funcionario.getNome());
        dto.setSobrenome(funcionario.getSobrenome());
        dto.setEmail(funcionario.getEmail());
        dto.setRg(funcionario.getRg());
        dto.setCpf(funcionario.getCpf());
        dto.setEndereco(funcionario.getEndereco());
        dto.setTelefone(funcionario.getTelefone());
        dto.setPis_pasep(funcionario.getPis_pasep());
        dto.setNome_De_Parente(funcionario.getNome_De_Parente());
        dto.setTelefone_parente(funcionario.getTelefone_parente());
        dto.setDataDeNascimento(funcionario.getDataDeNascimento());
        return dto;
    }

    public Funcionario toEntity(FuncionarioDTO dto){
        Funcionario funcionario = new Funcionario();
        funcionario.setId(dto.getId());
        funcionario.setMatricula(dto.getMatricula());
        funcionario.setNome(dto.getNome());
        funcionario.setSobrenome(dto.getSobrenome());
        funcionario.setEmail(dto.getEmail());
        funcionario.setRg(dto.getRg());
        funcionario.setCpf(dto.getCpf());
        funcionario.setEndereco(dto.getEndereco());
        funcionario.setTelefone(dto.getTelefone());
        funcionario.setPis_pasep(dto.getPis_pasep());
        funcionario.setNome_De_Parente(dto.getNome_De_Parente());
        funcionario.setTelefone_parente(dto.getTelefone_parente());
        funcionario.setDataDeNascimento(dto.getDataDeNascimento());
        return funcionario;
    }
}
