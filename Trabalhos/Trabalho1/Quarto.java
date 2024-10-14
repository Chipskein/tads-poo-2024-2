public class Quarto {
    private String numero;
    
    private float preco;
    
    private TipoQuarto tipo;
     
    private boolean estaDisponivel;

    public Quarto(String numero, TipoQuarto tipo, float preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.estaDisponivel = true;
    }

    public String getNumero() {
        return numero;
    }

    public float getPreco() {
        return preco;
    }

    public boolean getEstaDisponivel() {
        return estaDisponivel;
    }

    public TipoQuarto getTipo() {
        return tipo;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setTipo(TipoQuarto tipo) {
        this.tipo = tipo;
    }

    

    public void liberar() {
        this.estaDisponivel = true;
    }

    public void reservar() {
        this.estaDisponivel = false;
    }

}
