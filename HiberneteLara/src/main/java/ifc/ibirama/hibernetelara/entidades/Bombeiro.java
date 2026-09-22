/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernetelara.entidades;

import java.time.LocalDate;

/**
 *
 * @author aluno
 */
public class Bombeiro {
    private Integer id;
    private String cpf;
    private LocalDate dataNascimento;
    private String nome;
    private String nomeGuerra;

    public Bombeiro(){
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataNascimento
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nomeGuerra
     */
    public String getNomeGuerra() {
        return nomeGuerra;
    }

    /**
     * @param nomeGuerra the nomeGuerra to set
     */
    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bombeiro) {
            Bombeiro aux = (Bombeiro) obj;

            if ((aux.getId().equals(this.id)) && (aux.getCpf().equals(this.cpf))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
