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
public class Enderecos {
    @Id
    @GeneratedValue
    private Long id;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String complemento;
    private short inativo;
    @ManyToOne
    private DadosGerais dadoGeral;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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
