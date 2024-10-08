package Ex4;
public class Funcionario{
    private String nome;
    private double salario;
    private static final double SALARIO_MINIMO=1045.0;
    public Funcionario(String nome, double salario){
        this.setNome(nome);
        this.setSalario(salario);
    }
    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setSalario(double salario){
        if(salario<SALARIO_MINIMO){
            System.out.println("Salário inválido. O salário mínimo é de R$"+SALARIO_MINIMO);
            return;
        }
        this.salario=salario;
    }
    
    public void exibirInformacoes(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Salário: R$"+this.getSalario());
    }

}