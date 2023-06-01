
package atividade.arraylists.e.diagrama.de.classes;

  import java.util.ArrayList;
  import java.util.List;

   
public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private List<String> listaTelefonica;
    private Endereco endereco;
    
    // Construtor da classe
    public Pessoa(String nome, String cpf, String email, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.listaTelefonica = new ArrayList<>();
        this.endereco = endereco;
    }
    
    // Métodos para acessar e modificar os atributos da classe
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<String> getListaTelefonica() {
        return listaTelefonica;
    }
    
    public void adicionarTelefone(String numero) {
        listaTelefonica.add(numero);
    }
    
    public void removerTelefone(String numero) {
        listaTelefonica.remove(numero);
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    // Método para exibir as informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Endereço: " + endereco.toString());
        System.out.println("Lista telefônica:");
        for (String numero : listaTelefonica) {
            System.out.println(numero);
        }
    }
    
    // Classe interna para representar o endereço
    public static class Endereco {
        private String rua;
        private String cidade;
        private String estado;
        private String cep;
        
        // Construtor do endereço
        public Endereco(String rua, String cidade, String estado, String cep) {
            this.rua = rua;
            this.cidade = cidade;
            this.estado = estado;
            this.cep = cep;
        }
        
        // Métodos para acessar e modificar os atributos do endereço
        public String getRua() {
            return rua;
        }
        
        public void setRua(String rua) {
            this.rua = rua;
        }
        
        public String getCidade() {
            return cidade;
        }
        
        public void setCidade(String cidade) {
            this.cidade = cidade;
        }
        
        public String getEstado() {
            return estado;
        }
        
        public void setEstado(String estado) {
            this.estado = estado;
        }
        
        public String getCep() {
            return cep;
        }
        
        public void setCep(String cep) {
            this.cep = cep;
        }
        
        // Método toString para exibir o endereço
        @Override
        public String toString() {
            return rua + ", " + cidade + ", " + estado + " - " + cep;
        }
    
    }}
