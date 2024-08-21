package com.educacao.visaoescolar.controller;

import com.educacao.visaoescolar.dto.EstudanteDTO;
import com.educacao.visaoescolar.model.Estudante;
import com.educacao.visaoescolar.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudante")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @GetMapping
    public ResponseEntity<List<EstudanteDTO>> getAllEstudante(){
        return ResponseEntity.ok(estudanteService.getAllEstudantes());
    }

    @GetMapping("/{id}")
    public Estudante getEstudanteById(@PathVariable Long id){
        return estudanteService.getEstudanteById(id);
    }

    @PostMapping
    public ResponseEntity<EstudanteDTO> createEstudante(@RequestBody EstudanteDTO estudanteDTO){
        return ResponseEntity.ok(estudanteService.saveEstudante(estudanteDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstudanteDTO> updateEstudante(@PathVariable Long id, @RequestBody EstudanteDTO estudanteDTO){
        estudanteDTO.setId(id);
        return ResponseEntity.ok(estudanteService.saveEstudante(estudanteDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteEstudante(@PathVariable Long id){
        estudanteService.deleteEstudante(id);
    }

}
