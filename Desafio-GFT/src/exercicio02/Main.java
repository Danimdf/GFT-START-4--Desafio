package exercicio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String dig = Integer.toString(num);
        char numArr[] = dig.toCharArray();
        int numOfArr = numArr.length;
        int count_impar = 0;

        if (numOfArr <= 2) {
            System.out.println("Número inválido! Por favor digite um número com 3 ou 4 digitos!!");
            return;
        } else if (num <= 350 || num >= 8750) {
            System.out.println("Número Inválido!");
            return;
        }
        for (int i = 0; i < numOfArr; i++) {

            if (numArr[i] % 2 == 1) {
                count_impar++;
            }
        }
        System.out.println("São " + count_impar + " numeros impares");
    }
}
