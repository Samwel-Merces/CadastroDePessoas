package br.com.samuel.CadastroDePessoas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasVindas") //iRá pegar anotações
    public String boasVindas(){
        return "Boas Vindas";
    }
    
}
