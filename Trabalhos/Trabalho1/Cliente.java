
import java.util.List;
import java.util.ArrayList;
public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private List<Reserva> reservas;
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.reservas = new ArrayList<Reserva>();
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    
    public List<Reserva> getReservas() {
        return reservas;
    }
    public Reserva getReservaPorId(String reservaId) {
        for (Reserva r : getReservas()) {
            if (r.getId().equals(reservaId)) {
                return r;
            }
        }
        return null;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void fazerReserva(Quarto quarto, String dataInicio, String dataFim) {
        throw new UnsupportedOperationException("Não implementado");
    }

    public void cancelarReserva() {
        throw new UnsupportedOperationException("Não implementado");
    }

}
