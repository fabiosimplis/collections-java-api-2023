package Set.Ordenacao;

import Entities.Produto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void addProduto(long cod, String nome, double preco, int qtd) {
        produtoSet.add(new Produto(cod, nome, preco, qtd));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorProdutosPorPrecos());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
}
