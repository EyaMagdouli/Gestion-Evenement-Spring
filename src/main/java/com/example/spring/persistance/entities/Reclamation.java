package com.example.spring.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


@Table(name="Reclamation")

public class Reclamation implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_rec")
    private Long idRec;
    @Column(name="desc_rec")
    private String description;
    @Column(name="date_rec")
    private Date dateRec;
    @Column(name="type_rec")
    private String typeRec;

    //Relation user
    @ManyToOne(cascade = CascadeType.ALL)
    User user;
}
