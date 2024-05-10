package Set.Pesquisa;

public class Main {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 123457);
        agendaContatos.adicionarContato("Camila Cavalcante", 123457);
        agendaContatos.adicionarContato("Camila Dio", 678901);
        agendaContatos.adicionarContato("Maria Silva", 123456);
        agendaContatos.adicionarContato("Maria Silva", 11112222);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        System.out.println(agendaContatos.pesquisarPorNumero(123456));
        System.out.println(agendaContatos.atualizaNumeroContato("Maria Silva", 222333));


        agendaContatos.exibirContatos();
    }
}
