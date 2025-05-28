import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
    ArrayList <Menu> listaClientes = new ArrayList<>();

    //Objeto
    Cliente ClientePadrão = new Cliente();

    int escolhaMenu;
    
    System.out.println("Bem vindo ao menu do nosso site da barbearia, por favor, digite o número equivalente ao serviço desejado: ");
    System.out.println("");
    do{
    System.out.println("1- Criar novo registro");
    System.out.println("2- Listar todos os registros");
    System.out.println("3- Buscar registros");
    System.out.println("4- Editar registro");
    System.out.println("5- Excluir registro");
    System.out.println("6- Sair");
    System.out.print("Sua escolha: ");
    escolhaMenu = entrada.nextInt();
    entrada.nextLine();
    
    System.out.println("-----------------------------------------");
    System.out.println("");
    if(escolhaMenu < 1 || escolhaMenu > 6){
        System.out.println("OPÇÃO INVÁLIDA! Tente novamente: ");
    }
    }while(escolhaMenu < 1 || escolhaMenu > 6);
        
    switch(escolhaMenu){
        case 1:
            System.out.println("Opção 1");
            break;

        case 2:
            System.out.println("Opção 2");
            break;

        case 3: 
            System.out.println("Opção 3");
            break;

        case 4:
            System.out.println("Opção 4");
            break;

        case 5:
            System.out.println("Opção 5");
            break;
        case 6:
            System.out.print("Encerrando... ");
            
            try{
                Thread.sleep(2500);
            } catch (InterruptedException e){
                e.printStackTrace();
                System.out.println("OPS! Processo interrompido!");
            }
            
            System.out.print("Aguarde... ");

            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println("Algo deu errado!");
                e.printStackTrace();
            }
            
            System.out.println("Tudo pronto! Sessão Encerrada!");
            break;

        }

























    entrada.close();
    }
}
