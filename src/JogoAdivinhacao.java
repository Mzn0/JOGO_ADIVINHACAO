import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) throws InterruptedException {
        String advinhacao = "Advinhe um número de 0 a 10: ";
        String acerto = "Parabéns, você acertou! Fim de jogo.";
        String erro = "Que pena, você errou! Tente novamente.";

        int numero = (int)(Math.random() * 11);
        Scanner sc = new Scanner(System.in);
        int chute = -1;

        while (chute != numero) {
        System.out.println(advinhacao);

        chute = sc.nextInt();
            Thread.sleep(500);


            if (chute == numero) {
                System.out.println(acerto);
                Thread.sleep(1000);
            } else {
            System.out.println(erro);
                Thread.sleep(500);
        }


        }
    }
}