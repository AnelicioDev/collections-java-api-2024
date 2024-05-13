package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionaTarefas(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removeterafa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int totalTarefas(){
        return tarefaList.size();
    }

    public void descricaoTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("número de tarefas é: " + listaTarefa.totalTarefas());
        listaTarefa.adicionaTarefas("tarefa 1");
        listaTarefa.adicionaTarefas("tarefa 1");
        listaTarefa.adicionaTarefas("tarefa 2");
        System.out.println("número de tarefas é: " + listaTarefa.totalTarefas());
        listaTarefa.removeterafa("tarefa 1");
        System.out.println("número de tarefas é: " + listaTarefa.totalTarefas());
        listaTarefa.descricaoTarefa();
    }
}
