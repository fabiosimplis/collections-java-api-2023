package Set.OperacoesBasicas;

public class Main {

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1236);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1237);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
        conjuntoConvidados.removerConvidadoPorConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
        conjuntoConvidados.exibirConvidados();
    }
}
