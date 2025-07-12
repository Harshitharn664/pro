package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Produc {
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String description;
private String imageLink;
private String price;
private String category;

}
