import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Q8_MatheusDePaula extends JFrame implements ActionListener {
    private JLabel label;
    private JButton[] botoes;
    private JTextField textPalpite;
    private JButton bAdivinhar;

    private int numeroRandom;
    private int numTentativas;

    public Q8_MatheusDePaula () {
        super("Adivinhar um numero de 0 a 20");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        label = new JLabel("Tente adivinhar o número entre 1 e 20");
        add(label, BorderLayout.NORTH);

        JPanel digitosPanel = new JPanel(new GridLayout(4, 5));
        botoes = new JButton[20];

        for (int i = 0; i < 20; i++) {
            botoes[i] = new JButton(" " + (i+1));
            botoes[i].addActionListener(this);
            digitosPanel.add(botoes[i]);
        }
        add(digitosPanel, BorderLayout.CENTER);

        numeroRandom = (int) (Math.random() * 20) + 1;
        System.out.println(numeroRandom);
        numTentativas = 5;


        setSize(400, 300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent event) {
        if (numTentativas == 0) {
            return;
        }

        numTentativas--;

        JButton botao = (JButton) event.getSource();
        int numero = Integer.parseInt(botao.getText());

        if (numero == numeroRandom) {
            label.setText("Parabens voce acertou!! É o numero " + numeroRandom);
            for (int i = 0; i < 20; i++) {
                botoes[i].setEnabled(false);
            }
        } else if (numTentativas == 0) {
            label.setText("Voce errou todas as tentativas :( O numero era: " + numeroRandom);
            for (int i = 0; i < 20; i++) {
                botoes[i].setEnabled(false);
            }
        } else {

            if (numero != numeroRandom) {
                label.setText("Voce errou!! Mas tem ainda " + numTentativas + " tentativas");
            }
            botao.setEnabled(false);
        }

    }


    public static void main (String [] args) {

        new Q8_MatheusDePaula();


    }

}