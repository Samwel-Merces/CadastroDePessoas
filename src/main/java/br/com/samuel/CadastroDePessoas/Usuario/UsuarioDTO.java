package br.com.samuel.CadastroDePessoas.Usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioDTO(

    @NotBlank
    String nome,

    @Email
    @NotBlank
    String email,

    @Size(min = 8)
    @NotBlank
    String senha

) {}