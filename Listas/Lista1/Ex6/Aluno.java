package Ex6;
public class Aluno{
    private String nome;
    private double nota1;
    private double nota2;
    
    public Aluno(String nome,double nota1,double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public double calcularMedia(){
        double media=(this.nota1 + this.nota2)/2;
        System.out.println("A média do aluno "+this.nome+" é: "+media);
        return media;
    }

}