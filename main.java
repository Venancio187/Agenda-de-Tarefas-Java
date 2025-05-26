import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        AgendaDeTarefas agenda = new AgendaDeTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== AGENDA DE TAREFAS ===");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Atualizar tarefa");
            System.out.println("4. Concluir tarefa");
            System.out.println("5. Remover tarefa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String desc = scanner.nextLine();
                    agenda.adicionarTarefa(desc);
                    break;
                case 2:
                    agenda.listarTarefas();
                    break;
                case 3:
                    System.out.print("ID da tarefa: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nova descrição: ");
                    String novaDesc = scanner.nextLine();
                    agenda.atualizarTarefa(idAtualizar, novaDesc);
                    break;
                case 4:
                    System.out.print("ID da tarefa: ");
                    int idConcluir = scanner.nextInt();
                    agenda.concluirTarefa(idConcluir);
                    break;
                case 5:
                    System.out.print("ID da tarefa: ");
                    int idRemover = scanner.nextInt();
                    agenda.removerTarefa(idRemover);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
