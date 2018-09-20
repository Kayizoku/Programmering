package Aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[] args) {

        String navn = showInputDialog("Skriv inn navnet:");
        String alderString = showInputDialog("Skriv inn alderen:");
        int alder = Integer.parseInt(alderString);
        int fødselsÅr = 2018-alder;
        int pensjonsÅr = 67+fødselsÅr;
        System.out.println(navn+" er i dag "+alder+ " .Han er født i "+fødselsÅr);
        System.out.println(" I året "+pensjonsÅr+ " vil han være pensjonist");


    }

}
