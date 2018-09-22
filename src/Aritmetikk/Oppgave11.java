package Aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave11 {
    public static void main(String[] args) {

        String innTall = showInputDialog("Skriv et tall for å finne tversummen (mellom 0 og 1000)");

        int tall = Integer.parseInt(innTall);
        int utTall = tall;
        int sum = 0;
        int enkeltTall;

        enkeltTall = tall%10;
        sum += enkeltTall;
        tall = tall / 10;
        enkeltTall = tall%10;
        sum += enkeltTall;
        tall = tall / 10;
        enkeltTall = tall%10;
        sum += enkeltTall;

        System.out.println("Tversummen av tallet "+utTall+" er "+sum);

    }


}
