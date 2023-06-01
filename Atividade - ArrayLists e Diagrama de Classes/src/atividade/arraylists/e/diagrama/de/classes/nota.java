/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.arraylists.e.diagrama.de.classes;

/**
 *
 * @author victo
 */
public class nota {
     private String titulo;
    private String conteudo;
    private int prioridade;
    
    // Construtor da classe
    public nota(String titulo, String conteudo, int prioridade) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.prioridade = prioridade;
    }
    
    // Métodos para acessar e modificar os atributos da classe
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getConteudo() {
        return conteudo;
    }
    
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    
    public int getPrioridade() {
        return prioridade;
    }
    
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    
    // Método para exibir as informações da nota
    public void exibirNota() {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Prioridade: " + prioridade);
    }
}
