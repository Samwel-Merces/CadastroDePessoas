package br.com.samuel.CadastroDePessoas.Tarefas;

import br.com.samuel.CadastroDePessoas.Usuario.UsuarioModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_tarefas")
public class TarefaModel {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nomeTarefa;

    @ManyToOne //muitas tarefas pertencem a 1 usuario
    private UsuarioModel pessoas;
    private boolean ativa;
    private boolean concluida;

}
