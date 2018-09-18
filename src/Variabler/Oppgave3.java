package Variabler;

import static javax.swing.JOptionPane.*;

public class Oppgave3{

    public static void main(String[] args) {

        String fornavn = showInputDialog("Ole");
        String etternavn = showInputDialog("Hansen");
        String navn = fornavn + ""+etternavn;
        String alder = showInputDialog("22");
        String adresse = showInputDialog("Vestlisvingen 22");
        String poststed = "Oslo";
        String postnr = "0969";
        String ut = navn+ "bor i " +adresse+" som har postnummeret " +postnr+ "I " +poststed+" .Han er omtrent "+alder+" år gammel";
        showConfirmDialog(null, ut);








    }

}
