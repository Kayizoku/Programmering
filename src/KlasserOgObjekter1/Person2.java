package KlasserOgObjekter1;

import static javax.swing.JOptionPane.*;

public class Person2 {

    public String navn;
    public String adresse;
    public int postNr;
    public int telefonNr;
    public int fødselsÅr;

    public int alder() {

        int alder = 2018 - fødselsÅr;

        return alder;
    }

    public void skrivUt(int alder) {

        String ut = "Navn: "+navn+"\nAdresse: "+adresse+" \nPostNr: "+postNr+"\nTelefonnummer: "+telefonNr+"\nAlder "+alder+" år";
        showMessageDialog(null,ut);

    }

    public static void main(String[] args) {

        String innNavn = showInputDialog("Skriv inn navn");
        String innAdresse = showInputDialog("Skriv inn adressen");
        String innPostNr = showInputDialog("Skrv inn postNr");
        int postNr = Integer.parseInt(innPostNr);
        String innTelefonNr = showInputDialog("Skriv inn telefonNr");
        int telefonNr = Integer.parseInt(innTelefonNr);
        String innfødselsÅr = showInputDialog("Skrv inn fødselsÅr");
        int fødselsÅr = Integer.parseInt(innfødselsÅr);

        Person2 p2 = new Person2();
        p2.navn = innNavn;
        p2.adresse = innAdresse;
        p2.postNr = postNr;
        p2.telefonNr = telefonNr;
        p2.fødselsÅr = fødselsÅr;

        int alder = p2.alder();

        p2.skrivUt(alder);




    }
}

