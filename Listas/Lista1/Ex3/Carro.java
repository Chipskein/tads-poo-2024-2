package Ex3;
public class Carro{
    private String modelo;
    private String cor;
    private int ano;
    public Carro(String modelo,String cor,int ano){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    public void exibirDetalhes(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ano: "+this.ano);
    }
}