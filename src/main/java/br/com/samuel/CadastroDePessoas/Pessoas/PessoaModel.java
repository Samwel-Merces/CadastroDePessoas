package br.com.samuel.CadastroDePessoas.Pessoas;

import br.com.samuel.CadastroDePessoas.Tarefas.TarefaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity   //esta anotação transforma uma Classe em uma entidade de Banco de Dados
@Table(name = "tb cadastro_de_pessoas") //cria tabela junto com o nome dela
public class PessoaModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //ID gerado automaticamente
    private long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne //Cada usuário só pode ter uma tarefa por vez
    private TarefaModel tarefa;

    public PessoaModel() {}

    public PessoaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
