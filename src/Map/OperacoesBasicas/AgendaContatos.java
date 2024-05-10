package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void addContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){

        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer buscaPorNome(String nome){
        Integer numeroDoContato = null;
        if (!agendaContatoMap.isEmpty())
            numeroDoContato = agendaContatoMap.get(nome);
        return numeroDoContato;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.addContato("Camila", 123456);
        agendaContatos.addContato("Camila", 5665);
        agendaContatos.addContato("Camila Cavalcante", 1111111);
        agendaContatos.addContato("Camila DIO", 654987);
        agendaContatos.addContato("Maria Silva", 111111);
        agendaContatos.addContato("Camila", 444444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O numero é:" + agendaContatos.buscaPorNome("Camila DIO"));
    }
}
