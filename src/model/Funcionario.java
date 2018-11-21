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
import javax.persistence.OneToOne;

/**
 *
 * @author Bruno
 */
@Entity
public class Funcionario implements Bean{
    @Id
    @GeneratedValue
    private Long id;
    private String dataCadastro;
    @ManyToOne
    private Estabelecimentos estabelecimento;
    @OneToOne
    private Usuarios usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Estabelecimentos getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimentos estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
