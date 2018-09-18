package Variabler;

import static javax.swing.JOptionPane.*;

public class Oppgave2{

    public static void main(String[] args) {

        String fornavn = showInputDialog("Ole");
        String etternavn = showInputDialog("Hansen");
        String alder = showInputDialog("22");

        String navn = fornavn + ""+etternavn;

        // Begge metodene kan blir brukt på nesten samme måte
        showMessageDialog(null, "Alderen til "+navn+" er "+alder+" år");




    }

}
