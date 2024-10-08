package Ex1;

public class ContaBancaria{
    public String titular;
    private double saldo;
    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }
    public void depositar(double valor){
        if(valor<0){
            throw new IllegalArgumentException("Valor inválido");
        }
        this.saldo+=valor;
    }

    public void sacar(double valor){
        if(valor<0){
            throw new IllegalArgumentException("Valor inválido");
        }
        if(valor>this.saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo-=valor;
    }

    public void  mostrarSaldo(){
        System.out.println("Saldo: "+this.saldo);
    }


}