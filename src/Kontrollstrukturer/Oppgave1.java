package Kontrollstrukturer;

import static javax.swing.JOptionPane.*;

public class Oppgave1 {

    public static void main(String[] args) {
        String innAlder = showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);
            if(alder >= 18 && alder <= 20) {
                showMessageDialog(null, "Du er mydning, men kan ikke kjøpe alkohol med mer enn 22% på polet");
            }else {
                showMessageDialog(null, "Du er enten umynding eller så kan du kjøpe hva du vil på polet");
            }
         }
    }

