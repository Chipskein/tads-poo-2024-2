package Ex8;
import java.util.ArrayList;
import java.util.List;
public class Menu{
    private List<Funcionario> funcionarios;
    public Menu(){
        funcionarios=new ArrayList<>();
    }
    public void adicionarFuncionario(String nome, String departamento, double salario){
        Funcionario f=new Funcionario(nome, departamento, salario);
        funcionarios.add(f);
    }
    private int pesquisarIndexFuncionario(String nome){
        for(int i=0;i<funcionarios.size();i++){
            Funcionario f=funcionarios.get(i);
            if(f.getNome().equals(nome)){
                return i;
            }
        }
        return -1;
    }
    public void aumentarSalario(String nome, double percentual){
        int index=pesquisarIndexFuncionario(nome);
        if(index!=-1){
            Funcionario f=funcionarios.get(index);
            f.aumentarSalario(percentual);
            return;
        }
        System.out.println("Funcionário não encontrado");
    }
    public void transferir(String nome, String novoDepartamento){
        int index=pesquisarIndexFuncionario(nome);
        if(index!=-1){
            Funcionario f=funcionarios.get(index);
            f.transferir(novoDepartamento);
            return;
        }
        System.out.println("Funcionário não encontrado");
    }
    public void listarFuncionarios(){
        for(Funcionario f:funcionarios){
            System.out.println(f);
        }
    }
}