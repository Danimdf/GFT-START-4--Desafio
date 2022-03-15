package exercicio01;

public class Main {
    public static void main(String[] args){
        Gerente gerente = new Gerente(3000, 1);
        Vendedor vendedor = new Vendedor(2000, 2);
        Supervisor supervisor = new Supervisor(2500, 3);

        gerente.bonificacao();
        System.out.println("O gerente vai  receber " + gerente.bonificacao());
        System.out.println("O supervisor vai  receber " + supervisor.bonificacao());
        System.out.println("O vendedor vai  receber " + vendedor.bonificacao());
    }
}
