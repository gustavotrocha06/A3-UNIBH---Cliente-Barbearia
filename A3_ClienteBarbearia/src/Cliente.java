import java.time.LocalDateTime;

public class Cliente {

//Atributos
private String nome;
private int idade;
private String email;
private String cpf;
private LocalDateTime dataNascimento;

//Construtor
public Cliente(String nome, int idade, String email, String cpf, LocalDateTime dataNascimento){
    this. nome = nome;
    this.idade = idade;
    this.email = email;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
}

//Setters e Getters
public void setNome(String nome){
    this.nome = nome;
}

public String getNome(){
    return nome;
}

public void setIdade(int idade){
    this.idade = idade;
}

public int getIdade(){
    return idade;
}

public void setEmail(String email){
    this.email = email;
}

public String getEmail(){
    return email;
}

public void setCpf(String cpf){
    this.cpf = cpf;
}

public String getCpf(){
    return cpf;
}

public void setDataNascimento(LocalDateTime dataNascimento){
    this.dataNascimento = dataNascimento;
}

public LocalDateTime getDataNascimento(){
    return dataNascimento;
}


}
