
import java.util.Scanner;

public class Q1_MatheusDePaula {
  public static void main(String[] args) {
    Scanner somador = new Scanner(System.in);
    System.out.println("Quais valores deseja somar?");
    int val = somador.nextInt();
    int val2 = somador.nextInt();
    System.out.println(val + val2);
    }
}