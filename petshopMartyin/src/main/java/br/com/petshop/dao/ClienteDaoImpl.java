/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.petshop.dao;

import br.com.petshop.entidade.Gato;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author silvio.junior
 */
public class ClienteDaoImpl extends BaseDaoImpl<Gato, Long> 
                                implements ClienteDao, Serializable{

    @Override
    public Gato pesquisarPorId(Long id, Session sessao) 
                                           throws HibernateException {
        return sessao.find(Gato.class, id);
    }

    @Override
    public List<Gato> pesquisarPorNome(String nome,
                           Session session) throws HibernateException {
        Query<Gato> consulta = session
                .createQuery("from Cliente c join fetch c.enderecos "
                                        + "where c.nome like :nome");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.getResultList();
    }
    
}
