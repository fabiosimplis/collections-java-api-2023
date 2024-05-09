package List.Pesquisa;

public class Main {

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro(new Livro("Livro 1", "Autor 1", 2020));
        catalogoLivros.adicionarLivro(new Livro("Livro 2", "Autor 2", 2021));
        catalogoLivros.adicionarLivro(new Livro("Livro 3", "Autor 2", 2022));
        catalogoLivros.adicionarLivro(new Livro("Livro 4", "Autor 3", 2023));
        catalogoLivros.adicionarLivro(new Livro("Livro 5", "Autor 4", 2024));

        System.out.println(catalogoLivros.pesquisaPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloDeAnos(2021, 2023));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 2"));
    }
}
