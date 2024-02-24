package com.saviasoft.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "persona")
@Getter
@Setter
@NoArgsConstructor
public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false, length = 60)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String apellidos;

    @Column(nullable = false, length = 60)
    private String email;

    @Column(nullable = false, columnDefinition = "DATE")
    private LocalDate fecha;

    @Column(nullable = false, columnDefinition = "Decimal(20,2)")
    private Double salario;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_pais")
//    private Pais pais;


//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_mascota")
//    private list<Mascota> mascota;

}
