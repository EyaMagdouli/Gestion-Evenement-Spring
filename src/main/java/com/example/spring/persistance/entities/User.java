package com.example.spring.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table(name="User")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user")
    private Long idUser;
    @Column(name="email_user")
    private String email;
    @Column(name="name_user")
    private String name;
    @Column(name="pswd_user")
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;


    //Relation event
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Evenement> Evenements;

    //Relation Logistique
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Logistique> Logistiques;

    //Relation Formation
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Formation> Formations;
}
