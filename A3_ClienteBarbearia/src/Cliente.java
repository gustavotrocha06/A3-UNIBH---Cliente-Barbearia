import java.time.LocalDate;
import java.io.*;
import java.util.ArrayList;

public class Cliente {

//Atributos
private String nome;
private String telefone;
private int idade;
private String email;
private String cpf;
private LocalDate dataNascimento;

//Construtor
public Cliente(){
    this.nome = "";
    this.telefone = "";
    this.idade = 0;
    this.email = "";
    this.cpf = "";
    this.dataNascimento = LocalDate.of(2000, 1, 1);
}

public Cliente(String nome, String telefone, int idade, String email, String cpf, LocalDate dataNascimento){
    this. nome = nome;
    this.telefone = telefone;
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

public void setTelefone(String telefone){
    this.telefone = telefone;
}

public String getTelefone(){
    return telefone;
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

public void setDataNascimento(LocalDate dataNascimento){
    this.dataNascimento = dataNascimento;
}

public LocalDate getDataNascimento(){
    return dataNascimento;
}

//Método
public String conversor(){
    return nome + ";" + idade;
}

public static Cliente leitorConversor(String linha){
    String[] parte = linha.split(";");
    String nome = parte[0];
    String telefone = parte[1];
    int idade = Integer.parseInt(parte[2]);
    String email = parte[3];
    String cpf = parte[4];
    LocalDate dataNascimento =LocalDate.parse(parte[5]);
    return new Cliente();

}











}
