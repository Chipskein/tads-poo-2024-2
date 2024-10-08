package Ex8;
public class Funcionario{
    private String nome;
    private String departamento;
    private double salario;

   public Funcionario(String nome, String departamento, double salario){
       this.nome = nome;
       this.departamento = departamento;
       this.salario = salario;
   }

   public String getNome(){
       return nome;
   }

   public void aumentarSalario(double percentual){
         if (percentual < 0) {
              throw new IllegalArgumentException("Percentual não pode ser negativo");
         }
         salario += salario * percentual / 100;
   }

    public void transferir(String novoDepartamento){
        if(departamento.isEmpty()){
            throw new IllegalArgumentException("Departamento não pode ser vazio");
        }
        departamento = novoDepartamento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Funcionario{");
        sb.append("nome=").append(nome);
        sb.append(", departamento=").append(departamento);
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }
}