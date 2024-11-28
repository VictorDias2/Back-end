package com.equipe1.sistema_escolar.model;
import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@Table(name = "tb_presenca")
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

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
}
