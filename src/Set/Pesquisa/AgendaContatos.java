package Set.Pesquisa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public List<Contato> pesquisarPorNome(String nome){
        List<Contato> contatosPorNome = new ArrayList<>();
        for (Contato contato : contatoSet){
            if (contato.getNome().startsWith(nome)){
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato pesquisarPorNumero(int numero){
        Contato contato = null;

        for(Contato c : contatoSet){
            if (c.getNumero() == numero){
                contato = c;
                break;
            }
        }
        return contato;
    }

    public Contato atualizaNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
