package Aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {
    public static void main(String[] args) {

        String lString = showInputDialog("Skriv inn lengden:");
        String bString = showInputDialog("Skriv inn bredden:");

        double l = Double.parseDouble(lString);
        double b = Double.parseDouble(bString);
        double areal = l * b;
        System.out.println("Et rektangel med bredde "+b+ " cm og lengde "+l+" cm");
        System.out.println("Har et areal på "+areal+" cm^2");



    }
}
