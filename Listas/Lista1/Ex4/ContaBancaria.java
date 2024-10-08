package Ex4;
public class ContaBancaria{
    private String numero;
    private double saldo;
    public ContaBancaria(String numero,double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        if (valor>this.saldo){
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }
    public void exibirSaldo(){
        System.out.println("Saldo: "+this.saldo);
    }
}