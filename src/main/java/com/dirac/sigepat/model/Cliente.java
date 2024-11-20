/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dirac.sigepat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 *
 * @author mitch
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_cliente;
    private String nombres;
    private String apellido_paterno;
    private String apellido_materno;
    private Date fecha_nac;
    private String sexo;
    private String email;
    private String numcelular;
    private String password_cliente;
    
}
