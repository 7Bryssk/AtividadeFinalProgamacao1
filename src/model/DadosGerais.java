/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * @author Bruno
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "pertence_a_classe")
public class DadosGerais implements Bean{
    
    @Id
    @GeneratedValue
    private Long id;
    private short cadastroInativo;
    @OneToMany(mappedBy = "dadoGeral", cascade = CascadeType.ALL)
    private List<Telefones> telefones;
    @OneToMany(mappedBy = "dadoGeral", cascade = CascadeType.ALL)
    private List<Emails> emails;
    @OneToMany(mappedBy = "dadoGeral", cascade = CascadeType.ALL)
    private List<Enderecos> enderecos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public short getCadastroInativo() {
        return cadastroInativo;
    }

    public void setCadastroInativo(short cadastroInativo) {
        this.cadastroInativo = cadastroInativo;
    }
}
