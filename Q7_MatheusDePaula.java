import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q7_MatheusDePaula{
	public static int somador (String path) {
		int soma = 0;
		String linha;
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			while((linha = br.readLine()) != null) {
				String[] valores = linha.split("\\s+");
				for(String numero : valores) {
					soma += Integer.parseInt(numero);
				}
			}
			
		} catch (IOException e) {
			System.out.println("Erro ao ler");
		}
		return soma;
	}
	public static void main(String [] args) {
		String path = "C:\\Users\\Matheus\\Documents\\POO_Q7.txt";
		int soma = somador(path);
		System.out.println("A soma dos números no arquivo é: " + soma);
	}
}