package com.saviasoft.persistence.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "people")
@Getter
@Setter
@NoArgsConstructor
public class PeopleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    @Column(length = 50)
    private String nombre;
    @Column(length = 50)
    private String apellido;

}
