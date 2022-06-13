/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.dao;

import br.com.petshop.entidade.Gato;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author silvio.junior
 */
public interface ClienteDao extends BaseDao<Gato, Long>{
    
    List<Gato> pesquisarPorNome(String nome, 
                                Session session)throws HibernateException;
}
