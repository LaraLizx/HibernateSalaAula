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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
@Entity
@Table(name="Patente")
public class Patente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="pat_id")
    private Integer id;
    @Column(name="pat_sigla", length = 10, unique = true, nullable = false)
    private String sigla;
    @Column(name="pat_descricao", length = 45, unique = true, nullable = false)
    private String descricao;
    @ManyToMany(mappedBy = "Patente")
    private Set<Bombeiro> bobeiro = new HashSet <Bombeiro>();
    
    public Patente(){
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
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Bombeiro> getBobeiro() {
        return bobeiro;
    }
    
     @Override
    public boolean equals(Object obj) {
        if (obj instanceof Patente) {
            Patente aux = (Patente) obj;

            if ((aux.getId().equals(this.id)) && (aux.getSigla().equals(this.sigla))) {
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
