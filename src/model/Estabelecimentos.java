/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Bruno
 */
@Entity
@DiscriminatorValue("Estabelecimento")
public class Estabelecimentos extends DadosGerais {
    private String razaoSocial;
    private String nomeFantasia;
    private String cnjp;
    @ManyToOne
    private Usuarios usuarioDono;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnjp() {
        return cnjp;
    }

    public void setCnjp(String cnjp) {
        this.cnjp = cnjp;
    }

    public Usuarios getUsuarioDono() {
        return usuarioDono;
    }

    public void setUsuarioDono(Usuarios usuarioDono) {
        this.usuarioDono = usuarioDono;
    }
    
}
