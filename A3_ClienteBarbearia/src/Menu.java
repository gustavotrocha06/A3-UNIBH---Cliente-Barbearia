import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);

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
    
    System.out.println("-----------------------------------------");
    System.out.println("");
    if(escolhaMenu < 1 || escolhaMenu > 6){
        System.out.println("OPÇÃO INVÁLIDA! Tente novamente: ");
    }
    }while(escolhaMenu < 1 || escolhaMenu > 6);
        
    if(escolhaMenu == 1 ){
        System.out.println("Opção 1!");
    }else if(escolhaMenu == 2 ){
        System.out.println("Opção 2!");
    }else if(escolhaMenu == 3 ){
        System.out.println("Opção 3!");
    }else if(escolhaMenu == 4 ){
        System.out.println("Opção 4!");
    }else if(escolhaMenu == 5 ){
        System.out.println("Opção 5!");
    }else if(escolhaMenu == 6 ){
        System.out.println("Aguarde um momento.... saindo..... Sessão encerrada!");
    }else{
        System.out.println("------ Comando inexistente ------");
    }

//ignor























    entrada.close();
    }
}
