package transferencia;

public class Conta {
    //agencia, nomeConta, saldo, proprietario

    private String agencia;
    private String numeroConta;
    private double saldo;
    private Cliente proprietario;

    public Conta(String agencia, String numeroConta, double saldo, Cliente proprietario) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    public String getAgencia() {

        return agencia;
    }

    public String getNomeConta() {

        return numeroConta;
    }

    public double getSaldo() {

        return saldo;
    }

    public Cliente getProprietario() {

        return proprietario;
    }

    public void realizarDeposito(double valor){
        saldo += valor;
    }

    public boolean realizarSaque(double valor){
        if (valor > saldo){
            return false;
        }
            saldo -= valor;
            return true;

    }
    public boolean realizarTransferencia(double valor, Conta destino){
        if(realizarSaque(valor)){
         destino.realizarDeposito(valor);
         return true;
        }
        return false;
    }
}
