package Aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave4 {
    public static void main(String[] args) {

       String innRadius = showInputDialog("Skriv inn radius");
       double radius = Double.parseDouble(innRadius);
       double omkretsen = 2 * 3.14 * radius;
       String omkretsenMedToDesimaler = String.format("%.2f", omkretsen);
       System.out.println("Omkretsen til en sirkel med "+radius+" cm som radius blir "+omkretsenMedToDesimaler+" cm");




    }
}
