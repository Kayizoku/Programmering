package Kontrollstrukturer;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {
    public static void main(String[] args) {

        // a) program med if/else
/*
        String måned = showInputDialog("Hvilken måned er det?");

        if (måned.equals("Juni") || måned.equals("Juli") || måned.equals("August")) {
            showMessageDialog(null, "Det er sommer");
        } if (måned.equals("September") || måned.equals("Oktober") || måned.equals("November")) {
            showMessageDialog(null, "Det er høst");
        } if (måned.equals("Desember") || måned.equals("Januar") || måned.equals("Februar")){
            showMessageDialog(null, "Det er vinter");
        } if(måned.equals("Mars") || måned.equals("April") || måned.equals("Mai")) {
             showMessageDialog(null, "Det er vår");
        }
*/
        // b) program med switch

        String måned = showInputDialog("Hvilken måned er det?");
        switch (måned) {
            case "Juni":
            case "Juli":
            case "August":
                showMessageDialog(null, "Det er sommer");
                break;
            case "September":
            case "Oktober":
            case "November":
                showMessageDialog(null, "Det er høst");
                break;
            case "Desember":
            case "Januar":
            case "Februar":
                showMessageDialog(null, "Det er vinter");
                break;
            case "Mars":
            case "April":
            case "Mai":
                showMessageDialog(null, "Det er vår");
                break;
             default:
                 showMessageDialog(null, "Feil input, ikke gyldig månedsnavn!");
                 break;


        }

    }

}
