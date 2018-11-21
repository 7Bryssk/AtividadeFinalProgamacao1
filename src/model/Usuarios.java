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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Bruno
 */
@Entity
@DiscriminatorValue("Usuario")
public class Usuarios extends DadosGerais{
    private String nome;
    private String login;
    private String senha;
    private String cpf;
    @OneToMany(mappedBy = "usuarioDono", cascade = CascadeType.ALL)
    private List<Estabelecimentos> estabelecimentos;
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Funcionario funcionario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Estabelecimentos> getEstabelecimentos() {
        return estabelecimentos;
    }

    public void setEstabelecimentos(List<Estabelecimentos> estabelecimentos) {
        this.estabelecimentos = estabelecimentos;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
