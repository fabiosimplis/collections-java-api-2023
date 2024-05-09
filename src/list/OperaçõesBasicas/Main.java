package list.OperaçõesBasicas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ListaTarefa tarefas = new ListaTarefa();
        tarefas.adicionaTarefa("Limpar");
        tarefas.adicionaTarefa("Arrumar");
        tarefas.adicionaTarefa("Limpar");

        tarefas.obterDescicoesTarefas();
        tarefas.removeTarefas("Limpar");
        System.out.println("Apos");
        tarefas.obterDescicoesTarefas();
    }
}