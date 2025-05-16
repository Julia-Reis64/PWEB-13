package br.com.etechas.study.testeRelacionamento;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Telefone {
    @Id
    private int id;
    private String numero;
    private String ddd;

    @OneToOne
    @JoinColumn(name = "id_proprietario")
    private Proprietario proprietario;
}
