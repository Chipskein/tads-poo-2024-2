package Ex3;
import java.util.ArrayList;
import java.util.List;
public class Escola{
    private String nome;
    private String endereco;
    private List<Professor> professores;
    public Escola(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.professores = new ArrayList<>();
    }
    public Escola(String nome, String endereco, List<Professor> professores){
        this.nome = nome;
        this.endereco = endereco;
        this.professores = professores;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void mostrarProfessores(){
        for(Professor professor : this.professores){
            System.out.println(professor.getNome());
        }
    }
    public void addProfessor(Professor p){
        professores.add(p);
    }

}