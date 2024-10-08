package Ex2;
public class Carro{
    public String marca;
    protected String modelo;
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano<=1885){
            System.out.println("Ano inválido");
            return;
        }
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getModelo() {
        return modelo;
    }

}