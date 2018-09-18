package Variabler;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4 {

    public static void main(String[] args) {
        String fornavn = showInputDialog("Skriv inn fornavn:");
        String etternavn = showInputDialog("Skriv inn etternavn:");
        String alder = showInputDialog("Skriv inn alderen:");
        String adresse = showInputDialog("Skriv inn adressen:");
        String postnr = showInputDialog("Skriv inn postnr:");
        String poststed = showInputDialog("Skriv inn poststed:");
        String ut = "Navn : "+fornavn + " "+etternavn+"\n"+
                "Adresse : "+adresse+"\n"+
                "Postnnummer : "+postnr+"\n"+
                "Poststed: "+poststed+"\n"+
                "Alder : "+alder+" år";
        showMessageDialog(null, ut);
    }
}
