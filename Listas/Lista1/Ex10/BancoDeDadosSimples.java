package Ex10;
import Ex1.Pessoa;
import java.util.List;
import java.util.ArrayList;
public class BancoDeDadosSimples{
    private List<Pessoa> pessoas;
    public BancoDeDadosSimples(){
        this.pessoas = new ArrayList<Pessoa>();
    }
    public void adicionarPessoa(Pessoa p){
        this.pessoas.add(p);
    }
    public void removerPessoa(String nome){
        for (var p : this.pessoas){
            if (p.nome.equals(nome)){
                this.pessoas.remove(p);
                return;
            }
        }
        System.out.println("Pessoa não encontrada");
    }
    public void exibirPessoas(){
        for (var p : this.pessoas){
            p.exibirInformacoes();
            System.out.println("----------");
        }
    }
}