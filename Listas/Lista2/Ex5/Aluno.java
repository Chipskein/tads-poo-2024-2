package Ex5;
public class Aluno{
    public String nome;
    protected String matricula;
    private double notaFinal;
    public Aluno(String nome, String matricula){
        this.nome=nome;
        this.matricula=matricula;
    }
    public void setNotaFinal(double notaFinal){
        if (notaFinal<0 || notaFinal>10){
            System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
            return;
        }
        this.notaFinal=notaFinal;
    }
    public double getNotaFinal(){
        return this.notaFinal;
    }
    public void exibirDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Matrícula: "+this.matricula);
        System.out.println("Nota Final: "+this.getNotaFinal());
    }
}