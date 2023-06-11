import java.util.ArrayList;
import java.util.List;

public class ConjuntoProdutos {
    private List<Produto> produtos;

    public ConjuntoProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void inserirProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getCodigo() == produto.getCodigo()) {
                System.out.println("Erro: Produto com código " + produto.getCodigo() + " já existe no conjunto.");
                return;
            }
        }
        produtos.add(produto);
        System.out.println("Produto inserido com sucesso.");
    }

    public void removerProduto(int codigo) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == codigo) {
                produtos.remove(i);
                System.out.println("Produto removido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Produto com código " + codigo + " não encontrado no conjunto.");
    }

    public void atualizarProduto(Produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == produto.getCodigo()) {
                produtos.set(i, produto);
                System.out.println("Produto atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Produto com código " + produto.getCodigo() + " não encontrado no conjunto.");
    }

    public void mostrarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }

    public void atualizarPrecoPorcentagem(int codigo, float percentual) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produto.atualizarPreco(percentual);
                System.out.println("Preço do produto atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Produto com código " + codigo + " não encontrado no conjunto.");
    }
}
