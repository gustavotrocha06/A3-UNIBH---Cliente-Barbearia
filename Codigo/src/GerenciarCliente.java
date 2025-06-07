import java.util.ArrayList;

 public class GerenciarCliente {
     private final String arquivo = "clientes.txt";

     public static int gerarNovoID(ArrayList<Cliente> clientes) {
        int maiorID = -1;
        for (Cliente c : clientes) {
            if (c.getID() > maiorID) {
                maiorID = c.getID();
            }
        }
        return maiorID + 1;
    }
}

 
