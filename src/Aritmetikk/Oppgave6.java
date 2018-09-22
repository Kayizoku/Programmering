package Aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave6 {
    public static void main(String[] args) {

        String innValuta = showInputDialog("Skriv inn antall US-dollar (USD): ");
        int valuta = Integer.parseInt(innValuta);
        double norskeKroner = valuta * 8.36;
        System.out.println(valuta+" USD tilsvarer "+norskeKroner+" NOK");

    }
}
