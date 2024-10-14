import java.util.List;
import java.util.ArrayList;
public class Hotel {

    private String nome;
    
    private String endereco;
    
    private List<Quarto>quartos;
    
    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<Quarto>();
    }
    
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void adicionarQuarto(Quarto quarto) {
        this.quartos.add(quarto);
    }

    public List<Quarto> listarQuartosDisponiveis() {
        List<Quarto> quartosDisponiveis = new ArrayList<Quarto>();
        for (Quarto quarto : this.quartos) {
            if (quarto.getEstaDisponivel()) {
                quartosDisponiveis.add(quarto);
            }
        }
        return quartosDisponiveis;
    }

    public void removerQuarto(Quarto quarto) {
        this.quartos.remove(quarto);
    }

}
