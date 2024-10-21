import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Administrador {

    private String id;
    private String nome;
    private List<Hotel> hoteis;
    private List<Cliente> clientes;

    
    public Administrador(String nome) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.hoteis=new ArrayList<>();
        this.clientes=new ArrayList<>();
    }

    public Hotel procuraPeloNomeDoHotel(String nomeHotel){
        var hoteis = this.listarHoteis();
        for (Hotel hotel : hoteis) {
            if (hotel.getNome().equals(nomeHotel)) {
                return hotel;
            }
        }
        return null;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void adicionarHotel(Hotel hotel){
        hoteis.add(hotel);
    }

    public List<Hotel> listarHoteis(){
       return hoteis;
    }

    public void adicionarCliente(Cliente cliente) {
        var clienteExiste=procurarCliente(cliente.getEmail());
        if (clienteExiste != null) {
            System.out.println("Cliente já cadastrado. utilize outro email.");
            return;
        }
        this.clientes.add(cliente);
    }

    public Cliente procurarCliente(String email) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getEmail().equals(email)) {
                return cliente;
            }
        }
        return null;
    }

    public Reserva procurarReserva(String idReserva) {
        for (Cliente cliente : this.clientes) {
            var r=cliente.getReservaPorId(idReserva);
            if(r!=null){
                return r;
            }
        }
        return null;
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }

   
}
