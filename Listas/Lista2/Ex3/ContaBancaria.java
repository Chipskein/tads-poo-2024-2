package Ex3;
public class ContaBancaria{
    private String titular;
    private double saldo;
    public ContaBancaria(String titular){
        this.titular=titular;
        this.saldo=0.0;
    }
    public void sacar(double valor){
        if (valor<=0){
            System.out.println("Valor inválido");
            return;
        }
        if (valor>saldo){
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo-=valor;
    }
    public void depositar(double valor){
        if (valor<=0){
            System.out.println("Valor inválido");
            return;
        }
        saldo+=valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double consultarSaldo() {
        return saldo;
    }
    
}