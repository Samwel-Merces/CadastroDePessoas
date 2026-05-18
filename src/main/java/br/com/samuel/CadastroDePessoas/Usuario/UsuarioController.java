package br.com.samuel.CadastroDePessoas.Usuario;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService service;


    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    public ResponseEntity<> buscar(){

    } 
    
    
}
