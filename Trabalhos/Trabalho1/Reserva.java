import java.sql.Date;

public class Reserva {
    private String id;
    private Cliente cliente;
    private Quarto quarto;
    private Date dataInicio;
    private Date dataFim;
    private boolean cancelada;

    public Reserva(Cliente cliente, Quarto quarto, Date dataInicio, Date dataFim) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.id = java.util.UUID.randomUUID().toString();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public String getId() {
        return id;
    }
    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }
    public boolean getCancelada() {
        return cancelada;
    }

    public void cancelarReserva() {
        this.setCancelada(true);
        this.quarto.liberar();
    }

    public void confirmarReserva() {
        this.setCancelada(false);
        this.quarto.reservar();
    }

}
