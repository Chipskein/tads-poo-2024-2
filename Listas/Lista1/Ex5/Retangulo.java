package Ex5;
public class Retangulo{
    private double base;
    private double altura;
    public Retangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return this.base * this.altura;
    }
    public void compararArea(Retangulo outro){
        double area1 = this.calcularArea();
        double area2 = outro.calcularArea();
        if (area1>area2){
            System.out.println("O retângulo 1 tem a maior área");
        } else if (area1<area2){
            System.out.println("O retângulo 2 tem a maior área");
        } else{
            System.out.println("Os retângulos têm a mesma área");
        }
    }
}