package com.saviasoft.persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "moscota")

public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(length = 100)
    private  String nombre;

    @Column(length = 1)
    private  String estado;

//    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "pais", cascade = CascadeType.ALL)
//    private List<PersonaEntity> personaList;



}
