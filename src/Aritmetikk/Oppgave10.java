package Aritmetikk;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave10 {
    public static void main(String[] args) {

        String innAlder = showInputDialog("Skriv inn alderen din:");
        int alder = Integer.parseInt(innAlder);

        if(alder >= 18) {
            System.out.println("Du kan ta førekortet for bil da du er gammel nok");
        } else if (alder < 18) {
            System.out.println("Du er for ung til å ta førekort for bil");
        }



    }






}
