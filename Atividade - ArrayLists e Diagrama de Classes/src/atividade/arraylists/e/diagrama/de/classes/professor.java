/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.arraylists.e.diagrama.de.classes;

/**
 *
 * @author victo
 */
public class professor {
       private String nome;
    private String disciplina;
    private int idade;
    
    // Construtor da classe
    public professor(String nome, String disciplina, int idade) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.idade = idade;
    }
    
    // Métodos para acessar e modificar os atributos da classe
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDisciplina() {
        return disciplina;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // Método para exibir as informações do professor
    public void exibirProfessor() {
        System.out.println("Nome: " + nome);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Idade: " + idade);
    }
    public class Professor {
    private String nome;
    private String disciplina;
    private int idade;
    
    public Professor(String nome, String disciplina, int idade) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.idade = idade;
    }
    
    // getters e setters
    
    //...

    public static void main(String[] args) {
        Professor[] professores = new Professor[3];
        professores[0] = new professor("João", "Matemática", 35);
        professores[1] = new professor("Maria", "História", 40);
        professores[2] = new professor("Carlos", "Física", 32);
        
        // Exemplo de iteração sobre o array de professores
        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Disciplina: " + professor.getDisciplina());
            System.out.println("Idade: " + professor.getIdade());
            System.out.println("-------------------");
        }
    }
}
    
}
