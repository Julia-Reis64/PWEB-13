package br.com.etechas.study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "TBL_CONEXAO")

public class Conexao {
    @Column(name ="ID_CONEXAO")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DT_CRIACAO")
    private LocalDateTime dtCriacao;

    @ManyToOne
    @JoinColumn(name = "ID_MONITOR")
    private Monitor monitor;
}
