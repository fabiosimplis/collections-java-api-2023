package Set.Ordenacao;

public class Main {

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.addProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.addProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.addProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.addProduto(4L, "Produto 4", 1d, 2);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
