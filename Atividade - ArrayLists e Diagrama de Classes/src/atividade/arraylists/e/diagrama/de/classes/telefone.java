
package atividade.arraylists.e.diagrama.de.classes;


public class telefone {
    private String numero;
    
    // Construtor da classe
    public telefone(String numero) {
        this.numero = numero;
    }
    
    // Método para acessar o número do telefone
    public String getNumero() {
        return numero;
    }
    
    // Método para definir o número do telefone
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    // Método para exibir o número do telefone
    public void exibirNumero() {
        System.out.println("Número de telefone: " + numero);
    }
    
}
