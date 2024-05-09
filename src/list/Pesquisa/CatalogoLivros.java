package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public List<Livro> pesquisaPorAutor(String autor){
        List<Livro> livrosDoAutor = new ArrayList<>();
        if (!livros.isEmpty()){
            for (Livro livro : livros){
                if (livro.getAutor().equalsIgnoreCase(autor))
                    livrosDoAutor.add(livro);
            }
        }
        return livrosDoAutor;
    }

    public List<Livro> pesquisaPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livros.isEmpty()){
            for (Livro livro : livros){
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal)
                    livrosPorIntervaloAnos.add(livro);
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livros.isEmpty()){
            for (Livro livro : livros){
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
