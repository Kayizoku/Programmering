package Kontrollstrukturer;

import static javax.swing.JOptionPane.*;

public class Oppgave4 {
    public static void main(String[] args) {

        String innAlder = showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);

        if (alder < 18) {
            showMessageDialog(null, "Du er for ung til å ta førekortet for bil");
        } else if (alder < 70) {
            showMessageDialog(null, "Du kan ta førekortet for bil og du trenger ikke årlige legesjekker");
        } else {
            showMessageDialog(null, "Du er absolutt gammel nok til for å kjøre bil, men må ha årlige legesjekker");
        }
    }
}



