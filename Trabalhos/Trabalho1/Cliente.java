
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
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

    public void fazerReserva(Quarto quarto, Date dataInicio, Date dataFim) {
        Reserva reserva = new Reserva(this,quarto,dataInicio,dataFim);
        reservas.add(reserva);
    }
    

    public void cancelarReserva(String reservaId){
        var reserva=this.getReservaPorId(reservaId);
        if (reserva == null) {
            System.out.println("Reserva não encontrada.");
            return;
        }
        if (reserva.getCancelada()) {
            System.out.println("Reserva já cancelada.");
            return;
        }
        reserva.cancelarReserva();
    }

}
