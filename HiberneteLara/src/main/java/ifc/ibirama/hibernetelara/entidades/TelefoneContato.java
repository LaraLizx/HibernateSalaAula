/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernetelara.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name="Telefone_Contato")
public class TelefoneContato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="tec_id")
    private Integer id;
    @Column(name="tec_numero", length = 11, unique = true, nullable = false)
    private String numero;
    @Column(name="tec_tipo", length = 5, unique = true, nullable = false)
    private String tipo;
    @ManyToOne
    @JoinColumn (name = "bom_id", unique = true)
    private Bombeiro bombeiro;
    
    
    public TelefoneContato(){
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TelefoneContato ) {
            TelefoneContato aux = (TelefoneContato) obj;

            if ((aux.getId().equals(this.id)) && (aux.getNumero().equals(this.numero))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
