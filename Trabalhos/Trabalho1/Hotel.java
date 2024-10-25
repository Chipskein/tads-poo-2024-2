import java.util.ArrayList;
import java.util.List;
public class Hotel {

    private String nome;
    
    private String endereco;
    
    private List<Quarto>quartos;

    
    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<>();
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void adicionarQuarto(Quarto quarto) {
        var quartoExiste=procurarQuarto(quarto.getNumero());
        if (quartoExiste != null) {
            System.out.println("Quarto já cadastrado. utilize outro número.");
            return;
        }
        this.quartos.add(quarto);
    }

    public Quarto procurarQuarto(String numero) {
        for (Quarto quarto : this.quartos) {
            if (quarto.getNumero().equals(numero)) {
                return quarto;
            }
        }
        return null;
    }

    

    public List<Quarto> listarQuartosDisponiveis() {
        List<Quarto> quartosDisponiveis = new ArrayList<>();
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
