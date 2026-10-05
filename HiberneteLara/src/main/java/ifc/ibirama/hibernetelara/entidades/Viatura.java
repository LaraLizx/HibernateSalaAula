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
import jakarta.persistence.Table;
import java.util.Date;


@Entity
@Table (name="Viatura")
public class Viatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="via_id")
    private Integer id;
    @Column (name="via_placa", length = 45, unique = true, nullable = false)
    private String placa;
    @Column (name="via_combustivel", length = 45, nullable = false, unique = false)
    private String combustivel;
    @Column (name="via_ultimaRevisao", nullable = false, unique = false)
    private Date ultimaRevisao;
    @Column (name="via_km", nullable = false, unique = false)
    private Integer km;
    
    public Viatura(){
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
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the combustivel
     */
    public String getCombustivel() {
        return combustivel;
    }

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * @return the ultimaRevisao
     */
    public Date getUltimaRevisao() {
        return ultimaRevisao;
    }

    /**
     * @param ultimaRevisao the ultimaRevisao to set
     */
    public void setUltimaRevisao(Date ultimaRevisao) {
        this.ultimaRevisao = ultimaRevisao;
    }

    /**
     * @return the km
     */
    public Integer getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(Integer km) {
        this.km = km;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Viatura) {
            Viatura aux = (Viatura) obj;

            if ((aux.getId().equals(this.id)) && (aux.getPlaca().equals(this.placa))) {
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
