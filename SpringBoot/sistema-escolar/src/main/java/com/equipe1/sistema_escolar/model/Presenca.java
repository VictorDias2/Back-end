package com.equipe1.sistema_escolar.model;
import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@Table(name = "tb_presenca")
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_presenca")
    private Long Id;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Sala sala;

    @ManyToOne
    private Professor professor;

    @Column (name = "data_presenca")
    private Date datapresenca;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Date getDatapresenca() {
        return datapresenca;
    }

    public void setDatapresenca(Date datapresenca) {
        this.datapresenca = datapresenca;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
