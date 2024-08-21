package com.educacao.visaoescolar.controller;

import com.educacao.visaoescolar.dto.EstudanteDTO;
import com.educacao.visaoescolar.dto.FuncionarioDTO;
import com.educacao.visaoescolar.model.Funcionario;
import com.educacao.visaoescolar.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public ResponseEntity<List<FuncionarioDTO>> getAllFuncionario(){
        return ResponseEntity.ok(funcionarioService.getAllFuncionarios());
    }

    @GetMapping("/{id}")
    public Funcionario getFuncionarioById(@PathVariable Long id){
        return funcionarioService.getFuncionarioById(id);
    }

    @PostMapping
    public ResponseEntity<FuncionarioDTO> createFuncionario(@RequestBody FuncionarioDTO funcionarioDTO){
        return ResponseEntity.ok(funcionarioService.saveFuncionario(funcionarioDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioDTO> updateFuncionario(@PathVariable Long id, @RequestBody FuncionarioDTO funcionarioDTO){
        funcionarioDTO.setId(id);
        return ResponseEntity.ok(funcionarioService.saveFuncionario(funcionarioDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteFuncionario(@PathVariable Long id){
        funcionarioService.deleteFuncionario(id);
    }
}
