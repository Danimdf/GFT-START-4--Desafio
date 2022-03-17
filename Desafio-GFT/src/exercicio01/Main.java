package exercicio01;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random numRandom = new Random(5);
        int grau = numRandom.nextInt(5);
        Gerente gerente = new Gerente(3000, grau);
        Vendedor vendedor = new Vendedor(2000, grau);
        Supervisor supervisor = new Supervisor(2500, grau);


        System.out.println("O gerente vai  receber " + gerente.bonificacao());
        System.out.println("O supervisor vai  receber " + supervisor.bonificacao());
        System.out.println("O vendedor vai  receber " + vendedor.bonificacao());
    }
}
