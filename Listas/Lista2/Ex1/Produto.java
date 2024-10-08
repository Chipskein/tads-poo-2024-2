package Ex1;
public class Produto{
    private String nome;
    private double preco;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco<=0){
            System.out.println("Preço inválido");
            return;
        }
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if (estoque<0){
            System.out.println("Estoque inválido");
            return;
        }
        this.estoque = estoque;
    }
    


}