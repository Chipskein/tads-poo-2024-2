package Ex7;
public class Pedido{
    private String numeroPedido;
    private int quantidade;
    private double valorUnitario;

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return quantidade * valorUnitario;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
    
    public void setValorUnitario(double valorUnitario) {
        if (valorUnitario < 0) {
            throw new IllegalArgumentException("Valor unitário não pode ser negativo");
        }
        this.valorUnitario = valorUnitario;
    }

};