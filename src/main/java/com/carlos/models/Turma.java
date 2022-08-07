package com.carlos.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_turma")
public class Turma implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column
    private String descricao;

    @ManyToOne
    private ProfessorModel professorModel;


    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ProfessorModel getProfessorModel() {
        return professorModel;
    }
    public void setProfessorModel(ProfessorModel professorModel) {
        this.professorModel = professorModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return codigo.equals(turma.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
