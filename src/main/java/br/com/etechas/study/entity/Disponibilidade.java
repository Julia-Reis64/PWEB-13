package br.com.etechas.study.entity;

import br.com.etechas.study.enuns.DiaSemanaEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "TBL_DISPONIBILIDADE")

public class Disponibilidade {
    @Column(name = "ID_DISPONIBILIDADE")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DT_DAS")
    private LocalDateTime dtDas;

    @Column(name = "DT_ATE")
    private LocalDateTime dtAte;

    @Column(name = "TX_DIA_SEMANA")
    @Enumerated(EnumType.STRING)
    private DiaSemanaEnum diaSemana;



}
