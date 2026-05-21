package br.com.samuel.CadastroDePessoas.Usuario;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;


    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // @PostMapping
    // public ResponseEntity<Usuario> cadastrar(@RequestBody @Valid UsuarioDTO dto){

    // }
    @GetMapping
    public ResponseEntity<List<UsuarioModel>> listar(){
        return ResponseEntity.ok(usuarioService.listar());
    }
    
    
}
