package com.example.demomo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Hashira {
    
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String breathingStyle;
    private String demonSlayerMark;
    private String brightRedNichirinSword;
    private String transparentWorld;
}