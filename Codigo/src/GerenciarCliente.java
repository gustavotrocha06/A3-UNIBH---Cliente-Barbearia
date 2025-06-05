// import java.util.ArrayList;
// import java.io.*;
// import java.time.LocalDate;

// public class GerenciarCliente {
//     private final String arquivo = "clientes.txt";

//     public ArrayList<Cliente> lerCliente() {
//         ArrayList<Cliente> clientes = new ArrayList<>();

//         try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
//             String linha;
//             while ((linha = leitor.readLine()) != null) {
//                 String[] parte = linha.split(";");
//                 int id = Integer.parseInt(parte[0]);
//                 String nome = parte[1];
//                 String telefone = parte[2];
//                 int idade = Integer.parseInt(parte[3]);
//                 String email = parte[4];
//                 String cpf = parte[5];
//                 LocalDate dataNascimento = LocalDate.parse(parte[6]);

//                 clientes.add(new Cliente(id, nome, telefone, idade, email, cpf, dataNascimento));
//             }
//         } catch (IOException | NumberFormatException e) {
//             System.out.println("Erro ao ler o arquivo: " + e.getMessage());
//         }

//         return clientes;
//     }

//     public int geradorID(ArrayList<Cliente> clientes) {
//         int maiorID = 0;
//         for (Cliente i : clientes) {
//             if (i.getID() > maiorID) {
//                 maiorID = i.getID();
//             }
//         }
//         return maiorID + 1;
//     }
// }
