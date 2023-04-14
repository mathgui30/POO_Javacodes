public class Q4_MatheusDePaula {
    public static void main(String[] args) {
        String text = "Essa string será feita de teste, sendo jogada em um array onde cada token será um valor do array, e depois, com a função for ele vai ser percorrido e armazenará em outra variável apenas os valores que começam com s.";
        String[] palavras = text.split(" ");
        for (String s : palavras) {
            if (s.length() > 0 && (s.charAt(0) == 's' || s.charAt(0) == 'S')) {
                System.out.println(s);
            }
        }
    }
}
