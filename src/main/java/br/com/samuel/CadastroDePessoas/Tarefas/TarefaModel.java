package br.com.samuel.CadastroDePessoas.Tarefas;

import java.util.List;

import br.com.samuel.CadastroDePessoas.Pessoas.PessoaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_tarefas")
public class TarefaModel {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nomeTarefa;

    @OneToMany //Uma tarefa pode ter varias Pessoas
    private List<PessoaModel> pessoas;
    private boolean ativa;
    private boolean concluida;

}
