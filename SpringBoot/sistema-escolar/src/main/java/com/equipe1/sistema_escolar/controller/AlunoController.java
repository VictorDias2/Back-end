package com.equipe1.sistema_escolar.controller;

import com.equipe1.sistema_escolar.model.Aluno;
import com.equipe1.sistema_escolar.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunorepository;
    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> getalunos(){

        return alunorepository.findAll();
    }

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno){
        return alunorepository.save(aluno);
    }

    @PutMapping("/{id}")
    public Aluno atualizarAluno(@PathVariable Long id, @RequestBody Aluno aluno){
        Aluno alunoExistente = alunoRepository.findById(id).orElse(null);
        if(alunoExistente != null && aluno.getNome() != null){
            alunoExistente.setNome(aluno.getNome());
            return alunorepository.save(alunoExistente);
        }
        return null;
    }

    @DeleteMapping("/{id")
    public ResponseEntity<String> deletarAluno(@PathVariable Long id){
        if (alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
            return ResponseEntity.ok("Aluno deletado com sucesso!");
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aluno não encontrado");
        }
    }
}
