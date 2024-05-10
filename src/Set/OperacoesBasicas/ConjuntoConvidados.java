package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite){
        Convidado convidado = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidado = c;
                break;
            }
        }
        convidadoSet.remove(convidado);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }
}