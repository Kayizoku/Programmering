package Aritmetikk;

import static javax.swing.JOptionPane.*;

public class Oppgave7 {
    public static void main(String[] args) {

        String innAntallPizza = showInputDialog("skriv in antall pizza;");
        String innAntallPersoner = showInputDialog("Skrv inn antall personer:");
        String innAntallSlices = showInputDialog("Skrv inn antall slices pr. pizza");

        int antallPizza = Integer.parseInt(innAntallPizza);
        int antallPersoner = Integer.parseInt(innAntallPersoner);
        int antallSlices = Integer.parseInt(innAntallSlices);

        double antallSlicesPerPerson = (antallPizza * antallSlices) / antallPersoner;
        int rest = (antallPizza * antallSlices) % antallPersoner;

        System.out.print("Dersom man er "+antallPersoner+" personer og har "+antallPizza);
        System.out.print(" pizzaer med "+antallSlices+" slices pr pizza får hver person "+antallSlicesPerPerson);
        System.out.println(" og "+rest+" blir til overs");



    }
}
