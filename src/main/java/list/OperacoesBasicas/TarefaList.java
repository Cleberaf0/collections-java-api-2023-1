package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
public class TarefaList {
    //atributo
    private List<Tarefa> tarefaList;

    public TarefaList() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>( );
        for(Tarefa t : tarefaList ){
           if (t.getDescricao().equalsIgnoreCase(descricao)){
               tarefasParaRemover.add(t);
           }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        TarefaList tarefaList = new TarefaList();

        System.out.println("o numero total de elementos na tarefa é " + tarefaList.obterNumeroTotalTarefas());

        tarefaList.adicionarTarefa( "Tarefa 1");
        tarefaList.adicionarTarefa( "Tarefa 1");
        tarefaList.adicionarTarefa( "Tarefa 2");
        System.out.println("o numero total de elementos na tarefa é " + tarefaList.obterNumeroTotalTarefas());

        tarefaList.removerTarefa("Tarefa 1");
        System.out.println("o numero total de elementos na tarefa é " + tarefaList.obterNumeroTotalTarefas());

        tarefaList.obterDescricoesTarefas();

    }

}
