/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.entidade;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author mart
 */
@Entity
@Table(name = "comportamento")
public class Comportamento implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String tipo;
    
    @Column(nullable = false)
    private String descricao;
    
    @Column(nullable = false)
    private boolean ativo;
    

    public Comportamento() {
    }

    public Comportamento(Long id, String tipo, String descricao, boolean ativo, Animal animal) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
        this.ativo = ativo;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

//    public Animal getAnimal() {
//        return animal;
//    }
//
//    public void setAnimal(Animal animal) {
//        this.animal = animal;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comportamento)) {
            return false;
        }
        Comportamento other = (Comportamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.petshop.entidade.Comportamento[ id=" + id + " ]";
    }
    
}
