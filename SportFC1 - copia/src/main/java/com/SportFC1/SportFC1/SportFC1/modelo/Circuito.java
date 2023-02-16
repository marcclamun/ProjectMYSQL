/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SportFC1.SportFC1.SportFC1.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author marcclamun
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor 
public class Circuito {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String circuitname;
    private String countryname;
}
