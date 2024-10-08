package Ex7;
public class Produto{
    private String nome;
    private double preco;
    
    public Produto(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public void setPreco(double preco){
        if (preco<=0){
            System.out.println("Preço inválido: negativo");
            return;
        }
        this.preco = preco;
    }
    public void exibirInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Preço: "+this.preco);
    }
    
}