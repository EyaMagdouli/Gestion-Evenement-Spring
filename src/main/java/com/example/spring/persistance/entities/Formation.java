package com.example.spring.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table(name="Formation")
public class Formation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_form")
    private Long idForm;
    @Column(name="nom_form")
    private String nom;
    @Column(name="date_form")
    private Date dateForm;
    @Column(name="type_form")
    private String typeForm;

    //Relation User
    @ManyToMany(mappedBy="Formations", cascade = CascadeType.ALL)
    private Set<User> users;
}
