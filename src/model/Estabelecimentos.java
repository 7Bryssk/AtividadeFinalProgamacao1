/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL)
    private List<Funcionario> funcionarios;

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

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
}
