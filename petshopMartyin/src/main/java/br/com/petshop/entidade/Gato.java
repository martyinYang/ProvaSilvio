/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.entidade;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author mart
 */
@Entity
@Table(name = "gato")
@PrimaryKeyJoinColumn(name = "id_animal")
public class Gato extends Animal{
    
    @Column(nullable = false)
    private boolean fiv;
    
    @Column(nullable = false)
    private boolean felv;
    

    public Gato() {
    }

    public Gato(Long id, boolean fiv, boolean felv, List<Comportamento> pedidos, String nome, Date nascimento, Double peso, String sexo, String observacao) {
        super(id, nome, nascimento, peso, sexo, observacao);
        this.fiv = fiv;
        this.felv = felv;
    }

    public boolean isFiv() {
        return fiv;
    }

    public void setFiv(boolean fiv) {
        this.fiv = fiv;
    }

    public boolean isFelv() {
        return felv;
    }

    public void setFelv(boolean felv) {
        this.felv = felv;
    }
    
}
