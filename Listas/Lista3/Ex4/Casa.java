package Ex4;
import java.util.ArrayList;
import java.util.List;

public class Casa{
    private String endereco;
    private List<Comodo> comodos;
    public Casa(String endereco,String[] comodos){
        this.endereco = endereco;
        this.comodos = new ArrayList<>();
        for (String comodo : comodos) {
            this.comodos.add(new Comodo(comodo, this));
        }
    }
    public List<Comodo> getComodos(){
        return this.comodos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa{");
        sb.append("endereco=").append(endereco);
        sb.append('}');
        return sb.toString();
    }
}