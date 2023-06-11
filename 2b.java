public class Fornecedor {
    private String cnpj;
    private String telefone;
    private String nome;

    public Fornecedor(String cnpj, String telefone, String nome) {
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.nome = nome;
    }

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

public class Produto {
    private int codigo;
    private String nome;
    private int valor;
    private Fornecedor fornecedor;

    public Produto(int codigo, String nome, int valor, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void atualizarPreco(float percentual) {
        int aumento = (int) (valor * (percentual / 100));
        valor += aumento;
    }
}

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("123456789", "99999999", "Fornecedor Exemplo");
        Produto produto = new Produto(1, "Produto Exemplo", 100, fornecedor);

        System.out.println("Valor original do produto: " + produto.getValor());

        produto.atualizarPreco(10);

        System.out.println("Valor atualizado do produto: " + produto.getValor());
    }
}
