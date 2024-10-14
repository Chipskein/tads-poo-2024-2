import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Administrador {

    private String id;
    private String nome;
    private List<Hotel> hoteis;
    
    public Administrador(String nome) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.hoteis=new ArrayList<Hotel>();
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

    public void gerenciarQuarto(){
        throw new UnsupportedOperationException("Não implementado");
    }
}
