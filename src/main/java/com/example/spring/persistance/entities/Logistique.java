package com.example.spring.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


@Table (name= "Logistique")

public class Logistique implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_log")
    private Long idLog;

    @Column(name="nom_log")
    private String nomLog;

    @Column(name="type_log")
    private String typeLog;

    @Column(name = "disponibilite")
    private boolean disponibilite;

    @Column(name = "status_percentage")
    private int statusPercentage;

    //Relation User
    @ManyToMany(mappedBy="Logistiques", cascade = CascadeType.ALL)
    private Set<User> users;

}
