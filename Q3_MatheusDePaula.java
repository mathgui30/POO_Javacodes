import java.util.Scanner;

public class Q3_MatheusDePaula {
  public static void main(String[] args) {
    Scanner screen = new Scanner(System.in);
    System.out.println("Digite quantos numeros voce deseja somar");
    int qtd = screen.nextInt();
    
    
    int soma = 0;
    int[] valores = new int[qtd];
    
    for(int i = 1; i <= qtd; i++) {

      System.out.println("Digite " + i + "° valor:");
            int valor = screen.nextInt();
            soma += valor;
            

    }
    System.out.println("resultado: " + soma);

    
  }
}
