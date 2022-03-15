package exercicio03;

public class Main {
   public static void main(String[] args)
   {
       ContaCorrente ContaCorrente = new ContaCorrente(1000);
       ContaPoupanca ContaPoupanca = new ContaPoupanca(500);

       System.out.println("Rendimento Conta Corrente: " + ContaCorrente.rendimento());
       System.out.println("Rendimento Conta Poupança: " + ContaPoupanca.rendimento());
   }
}
