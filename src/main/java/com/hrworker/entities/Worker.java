package com.hrworker.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "WORKERS")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "WORKER_NAME")
    private String nome;
    @Column(name = "SALARIO_DIA")
    private Double dailyIncome;
}
