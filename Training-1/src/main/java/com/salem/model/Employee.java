package com.salem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data 	//une annotation Lombok. Nul besoin d’ajouter les getters et les setters.
		//La librairie Lombok s’en charge pour nous. Très utile pour alléger le code.
@Entity //une annotation qui indique que la classe correspond à une table de la base de données.
@Table(name = "employees") // indique le nom de la table associée.
public class Employee {

    @Id //clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incrémenté
    private Long id;

    @Column(name="first_name") //  pour faire le lien avec le nom du champ de la table.
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String mail;

    private String password;
    //Je n’ai pas eu besoin de mettre cette annotation pour mail et password, 
    //car le nom du champ de la table est identique.

}