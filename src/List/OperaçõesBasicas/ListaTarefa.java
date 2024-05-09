package List.OperaçõesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionaTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefas(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public void removeUmaTarefa(String descricao){
        for (Tarefa tarefa : tarefaList){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaList.remove(tarefa);
                break;
            }
        }
    }

    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    public void obterDescicoesTarefas(){
        System.out.println(tarefaList);

    }

}
