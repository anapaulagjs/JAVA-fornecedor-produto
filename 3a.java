import java.util.ArrayList;
import java.util.List;

class Fornecedor {
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

    @Override
    public String toString() {
        return "Fornecedor: " + nome + " | CNPJ: " + cnpj + " | Telefone: " + telefone;
    }
}

class Produto {
    private int codigo;
    private String nome;
    private float valor;
    private Fornecedor fornecedor;

    public Produto(int codigo, String nome, float valor, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    public void atualizarPreco(float percentual) {
        float aumento = valor * (percentual / 100);
        valor += aumento;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Nome: " + nome + " | Valor: R$" + valor + " | " + fornecedor.toString();
    }
}

public class TesteProduto {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("123456789", "123456789", "Fornecedor A");
        Fornecedor fornecedor2 = new Fornecedor("987654321", "987654321", "Fornecedor B");

        Produto produto1 = new Produto(1, "Produto 1", 10.0f, fornecedor1);
        Produto produto2 = new Produto(2, "Produto 2", 20.0f, fornecedor1);
        Produto produto3 = new Produto(3, "Produto 3", 30.0f, fornecedor2);

        System.out.println(produto1.toString());
        System.out.println(produto2.toString());
        System.out.println(produto3.toString());
    }
}

class ConjuntoProdutos {
    private List<Produto> produtos;

    public ConjuntoProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void inserirProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getCodigo() == produto.getCodigo()) {
                System.out.println("Erro: Produto com código " + produto.getCodigo() + "
