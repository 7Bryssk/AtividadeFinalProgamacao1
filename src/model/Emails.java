/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Bruno
 */
@Entity
public class Emails {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private short inativo;
    @ManyToOne
    private DadosGerais dadoGeral;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getInativo() {
        return inativo;
    }

    public void setInativo(short inativo) {
        this.inativo = inativo;
    }

    public DadosGerais getDadoGeral() {
        return dadoGeral;
    }

    public void setDadoGeral(DadosGerais dadoGeral) {
        this.dadoGeral = dadoGeral;
    }
    
}
