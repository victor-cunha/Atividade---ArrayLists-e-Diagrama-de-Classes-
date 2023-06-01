
package atividade.arraylists.e.diagrama.de.classes;


public class curso {
     private String nome;
    private String descricao;
    private int duracao;
    
    // Construtor da classe
       public curso(String nome, String descricao, int duracao) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
    }
    
    // Métodos para acessar e modificar os atributos da classe
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getDuracao() {
        return duracao;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    // Método para exibir as informações do curso
    public void exibirCurso() {
        System.out.println("Nome do curso: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Duração: " + duracao + " horas");
    }
}
