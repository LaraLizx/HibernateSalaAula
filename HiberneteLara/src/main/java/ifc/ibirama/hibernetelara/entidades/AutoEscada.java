/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernetelara.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

/**
 *
 * @author aluno
 */@primaryKeyJoinColumn (name="id")
 
public class AutoEscada extends Viatura{
    @Id
    @Column (name="aut_id")
    private Integer id;
    @Column (name="aut_alturaMax", unique = false, nullable = false)
    private Integer alturaMax;
    
    public AutoEscada (){   
    }
}
