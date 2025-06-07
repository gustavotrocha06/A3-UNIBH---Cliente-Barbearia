import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String telefone;
    private int idade;
    private String email;
    private String cpf;
    private LocalDate dataNascimento;
    private int id;

    public Cliente() {
        this.nome = "";
        this.telefone = "";
        this.idade = 0;
        this.email = "";
        this.cpf = "";
        this.dataNascimento = LocalDate.of(2000, 1, 1);
    }

    public Cliente(int id, String nome, String telefone, int idade, String email, String cpf, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public int getID() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + telefone + ";" + idade + ";" + email + ";" + cpf + ";" + dataNascimento;
    }
}
