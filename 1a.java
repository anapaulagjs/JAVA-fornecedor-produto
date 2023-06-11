public class Fornecedor {
    private String cnpj;
    private String telefone;
    private String nome;

    // Construtor da classe Fornecedor
    public Fornecedor(String cnpj, String telefone, String nome) {
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.nome = nome;
    }

    // Getters e setters para os atributos
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
