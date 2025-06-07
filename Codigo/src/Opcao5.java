import java.util.Scanner;
import java.util.ArrayList;

public class Opcao5 {
    public void executar(Scanner entrada, ArrayList<Cliente> listaClientes) {
        System.out.println("--- Excluir Registro ---");

        if (listaClientes.isEmpty()) {
            System.out.println("Nenhum registro para excluir.");
            return;
        }

        System.out.print("Digite o ID do cliente a ser excluído: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        if (id >= 0 && id < listaClientes.size()) {
            Cliente clienteRemovido = listaClientes.remove(id);
            BancoDeDados.salvarClientes(listaClientes);
            System.out.println("Registro de " + clienteRemovido.getNome() + " excluído com sucesso!");
        } else {
            System.out.println("ID inválido.");
        }
    }
}
