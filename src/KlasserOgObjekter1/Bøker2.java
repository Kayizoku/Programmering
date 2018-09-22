package KlasserOgObjekter1;

import static javax.swing.JOptionPane.*;

class Bøker2 {

    String tittel;
    double pris;
    String forfatter;
    int ISBNnr;

    public void skrivUt() {

        String ut = "Tittelen :"+tittel+" Prisen er"+pris+" kr "+" Forfatteren er : "+forfatter+" ISBN-nummeret er :"+ISBNnr;
        showMessageDialog(null, ut);
    }


    public static void main(String[] args) {

        String innTittel = showInputDialog("Tittel");
        String innForfatter = showInputDialog("Forfatternavn");
        String innPris = showInputDialog("Pris");
        double pris = Double.parseDouble(innPris);
        String innISBN = showInputDialog("ISBN.nr");
        int ISBN = Integer.parseInt(innISBN);

        Bøker bok1 = new Bøker();
        bok1.tittel = innTittel;
        bok1.forfatter = innForfatter;
        bok1.pris = pris;
        bok1.ISBNnr = ISBN;
        bok1.skrivUt();





    }


}
