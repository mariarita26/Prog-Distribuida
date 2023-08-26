package br.edu.ifpb.progdist.hellospring.service;

import br.edu.ifpb.progdist.hellospring.dao.UsuariosDAO;
import br.edu.ifpb.progdist.hellospring.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UsuariosService {
    private UsuariosDAO usuariosDAO = new UsuariosDAO();

    public List<Usuario> getUsuarios() {
        return usuariosDAO.getUsuarios();
    }

    public Usuario getUsuarioPorCodigo(int codigo){
        //{implemente este código, usando streams de Java}
        return getUsuarios()
                .stream()
                .filter(usuario -> Objects.equals(usuario.getCodigo(), codigo))
                .findFirst()
                .orElse(null);

    }

    public void inserirUsuario(Usuario usuario){
        this.usuariosDAO.inserirUsuario(usuario);
    }

}
