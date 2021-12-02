package transferencia;

public class Cliente {
    //nome, cpf e rg (**OBJETOS**)

    private String nome;
    private String cpf;
    private String rg;

    public Cliente(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        //CONSTRUTOR

    }
        //ABAIXO OS METODOS
    public String getNome() {

        return nome;
    }

    public String getCpf() {

        return cpf;
    }

    public String getRg() {

        return rg;
    }
}
