package Ex1;
public class Pessoa{
    public String nome;
    public int idade;
    public double altura;
    public Pessoa(String nome,int idade,double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Altura: "+this.altura);
    }
    public void alterarIdade(int idade){
        this.idade = idade;
    }
}