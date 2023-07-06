package com.example.spring.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table(name= "Feedback")
public class Feedback implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Feed")
    private Long idFeed;
    @Column(name="Desc_Feed")
    private String description;
    @Column(name="Date_Feed")
    private Date dateFeed;


    //Relation user
    @ManyToOne(cascade = CascadeType.ALL)
    User user;    
    
}
