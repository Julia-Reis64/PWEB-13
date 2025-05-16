package br.com.etechas.study.testeRelacionamento;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "proprietario")

public class Proprietario

{
    @Id
    private int id;
    private String nome;
}
