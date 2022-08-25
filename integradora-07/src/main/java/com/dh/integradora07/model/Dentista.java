package com.dh.integradora07.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dentista {
    private int id;
    private String nome;
    private String email;
    private int numeroMatricula;
    private boolean atendeConvenio;
}
