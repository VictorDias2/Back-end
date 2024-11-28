package com.equipe1.sistema_escolar.controller;

import com.equipe1.sistema_escolar.model.Aluno;
import com.equipe1.sistema_escolar.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunorepository;

    @GetMapping
    public List<Aluno> getalunos(){
        return alunorepository.findAll();
    }
}
