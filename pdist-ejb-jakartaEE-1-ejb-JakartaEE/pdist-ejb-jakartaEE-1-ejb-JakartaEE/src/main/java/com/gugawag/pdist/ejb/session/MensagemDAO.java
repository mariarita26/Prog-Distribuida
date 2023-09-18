package com.gugawag.pdist.ejb.session;

import com.gugawag.pdist.modelo.Mensagem;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class MensagemDAO {

    @PersistenceContext(unitName = "default")
    private EntityManager em;

    public void inserir(Mensagem novaMensagem) {
        em.persist(novaMensagem);
    }

    public List<Mensagem> listar() {
        return em.createQuery("SELECT m FROM tb_mensagem m").getResultList();
    }

    public Mensagem pesquisarPorId(Long id) {
        return (Mensagem) em.createQuery("SELECT m FROM tb_mensagem m where m.id = " + id).getResultList().get(0);
    }
}
