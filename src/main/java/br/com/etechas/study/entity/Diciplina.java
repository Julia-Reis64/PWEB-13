package br.com.etechas.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity //Significa que essa classe vai ser representada no banco de dados
@Table(name = "tbl_disciplina")

public class Diciplina {
    @Column(name ="id_disciplina") //configurando o nome do campo no banco de dados
    @Id //Define a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //define o id como auto-incrementado (anterior + 1)
    //Fazer antes do ID
    private Long id;

    @Column(name ="tx_nome")

    private String nome;

}
