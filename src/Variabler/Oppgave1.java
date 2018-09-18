package Variabler;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {

    public static void main(String[] args) {

        String fornavn = showInputDialog("Ole");
        String etternavn = showInputDialog("Hansen");

        String navn = fornavn + ""+etternavn;

        // Begge metodene kan blir brukt på nesten samme måte
        showMessageDialog(null, "Navnet er " +navn);
        showMessageDialog(null, "Navnet er " +fornavn+""+etternavn);



    }

}
