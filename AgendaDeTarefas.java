import java.util.ArrayList;

public class AgendaDeTarefas {
    private ArrayList<tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1;

    public void adicionarTarefa(String descricao) {
        tarefas.add(new tarefa(proximoId++, descricao));
        System.out.println("Tarefa adicionada!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (tarefa t : tarefas) {
                System.out.println(t);
            }
        }
    }

    public void atualizarTarefa(int id, String novaDescricao) {
        for (tarefa t : tarefas) {
            if (t.getId() == id) {
                t.setDescricao(novaDescricao);
                System.out.println("Tarefa atualizada!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    public void concluirTarefa(int id) {
        for (tarefa t : tarefas) {
            if (t.getId() == id) {
                t.setConcluida(true);
                System.out.println("Tarefa concluída!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    public void removerTarefa(int id) {
        for (tarefa t : tarefas) {
            if (t.getId() == id) {
                tarefas.remove(t);
                System.out.println("Tarefa removida!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }
}
