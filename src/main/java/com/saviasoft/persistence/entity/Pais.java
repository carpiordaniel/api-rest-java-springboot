package com.saviasoft.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "pais")
@Getter
@Setter
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(length = 100)
    private  String nombre;

    @Column(length = 1)
    private  String estado;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pais", cascade = CascadeType.ALL)
//    private List<PersonaEntity> personaList;

}
