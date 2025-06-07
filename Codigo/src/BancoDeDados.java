import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class BancoDeDados {
    private static final String ARQUIVO_CLIENTES = "clientes.txt";

    public static void salvarClientes(ArrayList<Cliente> listaClientes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO_CLIENTES))) {
            for (Cliente c : listaClientes) {
                writer.write(c.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar clientes: " + e.getMessage());
        }
    }

    public static ArrayList<Cliente> carregarClientes() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO_CLIENTES))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length == 7) {
                    int id = Integer.parseInt(dados[0]);
                    String nome = dados[1];
                    String telefone = dados[2];
                    int idade = Integer.parseInt(dados[3]);
                    String email = dados[4];
                    String cpf = dados[5];
                    LocalDate dataNascimento = LocalDate.parse(dados[6]);

                    Cliente cliente = new Cliente(id, nome, telefone, idade, email, cpf, dataNascimento);
                    listaClientes.add(cliente);
                }
            }
        } catch (FileNotFoundException e) {
            // Primeiro uso, arquivo ainda não existe
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return listaClientes;
    }
}

