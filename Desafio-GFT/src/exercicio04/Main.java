package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Seu nome: ");
        String nome = Scan.next();
        System.out.println("Sua altura: ");
        Float altura = Scan.nextFloat();
        System.out.println("Seu peso: ");
        Float peso = Scan.nextFloat();


        double IMC = imc(altura, peso);
        fichaPessoal(nome, altura, peso, IMC);
    }

    static public void fichaPessoal(String nome, Float altura, Float peso, double IMC) {
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        int imcInt = (int) IMC;
        if (imcInt < 18.5) {
            System.out.println("Pessoa abaixo do peso");
        } else if (imcInt > 18.5 && imcInt < 24.9) {
            System.out.println("Pessoa com peso normal");
        } else if (imcInt > 25.0 && imcInt < 29.9 ) {
            System.out.println("Pessoa com sobrepeso");
        } else if (imcInt > 30.0 && imcInt < 34.9) {
            System.out.println("Pessoa com Obesidade Grau I");
        } else if (imcInt > 35.0 && imcInt < 39.9) {
            System.out.println("Pessoa com Obesidade Grau II");
        } else {
            System.out.println("Pessoa com Obesidade Grau III");
        }
    }
    static public double imc (Float altura, Float peso) {
        double IMC = peso / Math.pow(altura, 2);
        return (IMC);
    }
}
