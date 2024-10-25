import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Arrays;

public class Administrador {

    private String id;
    private String nome;
    /*
        Agregação 1 para n entre Administrador e Hotel
            Um administrador pode gerenciar vários hoteis  mas um hotel pode existir sem um administrador, não há dependência
    */
    private List<Hotel> hoteis;
    /*
        Agregação 1 para n entre Administrador e Cliente
            Um administrador pode gerenciar vários clientes  mas um cliente pode existir sem um administrador, não há dependência
    */
    private List<Cliente> clientes;

    
    public Administrador(String nome) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.hoteis=new ArrayList<>(
            Arrays.asList(
                new Hotel("Hotel 1","Rua 1"),
                new Hotel("Hotel 2","Rua 2"),
                new Hotel("Hotel 3","Rua 3")
            )
        );
        this.hoteis.get(0).adicionarQuarto(new Quarto("101",TipoQuarto.SIMPLES,100));
        this.hoteis.get(1).adicionarQuarto(new Quarto("101",TipoQuarto.FAMILIAR,120));
        this.hoteis.get(2).adicionarQuarto(new Quarto("101",TipoQuarto.CASAL,150));
        this.hoteis.get(0).adicionarQuarto(new Quarto("102",TipoQuarto.FAMILIAR,100));
        this.hoteis.get(1).adicionarQuarto(new Quarto("102",TipoQuarto.CASAL,120));
        this.hoteis.get(2).adicionarQuarto(new Quarto("102",TipoQuarto.EXECUTIVO,1500));
        this.clientes=new ArrayList<>(
            Arrays.asList(
                new Cliente("Cliente 1","c1@gmail.com","123456789"),
                new Cliente("Cliente 2","c2@gmail.com","123456789"),
                new Cliente("Cliente 3","c3@gmail.com","123456789")
            )
        );
        
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
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void adicionarHotel(Hotel hotel){
        this.hoteis.add(hotel);
    }

    public List<Hotel> listarHoteis(){
       return this.hoteis;
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

    
    
    public List<Cliente> getClientes() {
        return this.clientes;
    }

   
}
