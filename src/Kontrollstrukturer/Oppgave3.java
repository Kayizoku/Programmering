package Kontrollstrukturer;

import static javax.swing.JOptionPane.*;

public class Oppgave3 {
    public static void main(String[] args) {

        String innAlder = showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);

        if (alder < 18) {
            showMessageDialog(null, "Du er for ung til å ta førekortet for bil");
        } else {
            showMessageDialog(null, "Du kan ta førekortet for bil da du er gammel nok");
        }
    }
}



