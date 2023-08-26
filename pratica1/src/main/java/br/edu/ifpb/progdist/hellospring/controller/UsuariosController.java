package br.edu.ifpb.progdist.hellospring.controller;

import br.edu.ifpb.progdist.hellospring.model.Usuario;
import br.edu.ifpb.progdist.hellospring.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    UsuariosService usuariosService;

    @GetMapping("")
    public List<Usuario> getUsuario(){
        return usuariosService.getUsuarios();
    }

    @GetMapping("/{codigo}")
    public Usuario getUsuarioPorCodigo(@PathVariable int codigo){
        return this.usuariosService.getUsuarioPorCodigo(codigo);
    }

    @PostMapping(path = "", consumes = "application/json", produces = "application/json")
    public Integer inserirUsuario(@RequestBody Usuario usuario) {
        this.usuariosService.inserirUsuario(usuario);
        return usuario.getCodigo();
    }

}
