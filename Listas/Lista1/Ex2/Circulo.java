package  Ex2;
import java.lang.Math;
public class Circulo{
    public double raio;
    public Circulo(double raio){
        this.raio = raio;
    }
    public double calcularArea(){
        return Math.PI * Math.pow(this.raio,2);
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * this.raio;
    }   
}