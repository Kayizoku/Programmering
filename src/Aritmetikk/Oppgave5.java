package Aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {
    public static void main(String[] args) {

        String innFarenheit = showInputDialog("Skriv inn farenheit");
        Double farenheit = Double.parseDouble(innFarenheit);
        double celsius = (farenheit-32)/1.8;
        String celsiusMedToDesimaler = String.format("%.2f",celsius);
        System.out.println(farenheit+" F er lik "+celsiusMedToDesimaler+" C");



    }
}
