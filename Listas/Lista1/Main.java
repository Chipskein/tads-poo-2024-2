import Ex1.Pessoa;
import Ex10.BancoDeDadosSimples;
import Ex2.Circulo;
import Ex3.Carro;
import Ex4.ContaBancaria;
import Ex5.Retangulo;
import Ex6.Aluno;
import Ex7.Produto;
import Ex8.Calculadora;
import Ex9.Funcionario;
public class Main{
    public static void main(String[] args){
        System.out.println("Lista 1");
        System.out.println("##Exercício 1: Criando uma Classe Simples##");
        Pessoa pessoa1 = new Pessoa("João", 25, 1.75);
        pessoa1.exibirInformacoes();
        pessoa1.alterarIdade(26);
        System.out.println("#######################################");
        
        System.out.println("##Exercício 2: Métodos com Retorno##");
        Circulo circulo1 = new Circulo(5);
        double area = circulo1.calcularArea();
        double perimetro = circulo1.calcularPerimetro();
        System.out.println("Área: "+area);
        System.out.println("Perímetro: "+perimetro);
        System.out.println("#######################################");
        
        System.out.println("##Exercício 3: Criando Objetos##");
        Carro carro1 = new Carro("Civic", "Prata", 2021);
        Carro carro2 = new Carro("Corolla", "Preto", 2020);
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        System.out.println("#######################################");
        
        System.out.println("##Exercício 4: Métodos que Alteram Atributos##");
        ContaBancaria conta1 = new ContaBancaria("12345-6", 500.00);
        conta1.depositar(150.00);
        conta1.sacar(100.00);
        conta1.exibirSaldo();
        System.out.println("#######################################");

        System.out.println("##Exercício 5: Comparando Objetos##");
        Retangulo ret1 = new Retangulo(4, 5);
        Retangulo ret2 = new Retangulo(3, 7);
        ret1.compararArea(ret2);
        System.out.println("#######################################");

        System.out.println("##Exercício 6: Instâncias Múltiplas##");
        Aluno aluno1 = new Aluno("Ana", 7.5, 8.0);
        Aluno aluno2 = new Aluno("Pedro", 6.0, 5.5);
        Aluno aluno3 = new Aluno("Maria", 9.0, 8.5);
        aluno1.calcularMedia();
        aluno2.calcularMedia();
        aluno3.calcularMedia();
        System.out.println("#######################################");

        System.out.println("##Exercício 7: Métodos e Atributos Privados##");
        Produto produto1 = new Produto("Laptop", 3000.00);
        produto1.setPreco(3200.00);
        produto1.exibirInfo();
        System.out.println("#######################################");
        
        System.out.println("##Exercício 8: Calculadora Simples##");
        Calculadora calc = new Calculadora();
        double soma = calc.somar(10, 5);
        double divisao = calc.dividir(10, 2);
        double multiplicacao = calc.multiplicar(5, 5);
        double subtracao = calc.subtrair(10, 5);
        System.out.println("Soma: "+soma);
        System.out.println("Divisão: "+divisao);
        System.out.println("Multiplicação: "+multiplicacao);
        System.out.println("Subtração: "+subtracao);
        System.out.println("#######################################");

        System.out.println("##Exercício 9: Construtores##");
        Funcionario func1 = new Funcionario("Carlos", 2500.00);
        func1.aumentarSalario(10); // Aumenta 10% no salário
        func1.exibirInfo();
        System.out.println("#######################################");
        
        System.out.println("##Exercício 10: Criando um Banco de Dados Simples##");
        BancoDeDadosSimples bd = new BancoDeDadosSimples();
        bd.adicionarPessoa(new Pessoa("João", 30, 1.80));
        bd.adicionarPessoa(new Pessoa("Maria", 25, 1.65));
        bd.adicionarPessoa(new Pessoa("Klaus", 20, 1.65));
        bd.removerPessoa("Maria");
        bd.exibirPessoas();
        System.out.println("#######################################");

    }
}