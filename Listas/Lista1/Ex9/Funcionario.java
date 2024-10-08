package Ex9;
public class Funcionario{
    private String nome;
    private double salario;
    
    public Funcionario(String nome,double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public void aumentarSalario(double percentual){
        this.salario += this.salario * percentual/100;
    }

    public void exibirInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Salário: "+this.salario);
    }
}
