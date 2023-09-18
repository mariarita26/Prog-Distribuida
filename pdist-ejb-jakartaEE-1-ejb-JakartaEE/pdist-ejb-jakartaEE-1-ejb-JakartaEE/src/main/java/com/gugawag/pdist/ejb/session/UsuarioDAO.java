package com.gugawag.pdist.ejb.session;

import com.gugawag.pdist.modelo.Usuario;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class UsuarioDAO {

    @PersistenceContext(unitName = "default")
    private EntityManager em;

    public void inserir(Usuario novoUsuario) {
        em.persist(novoUsuario);
    }

    public List<Usuario> listar() {
        return em.createQuery("SELECT u FROM tb_usuario_pdist u").getResultList();
    }

}
