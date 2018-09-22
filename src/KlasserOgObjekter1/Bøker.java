package KlasserOgObjekter1;

public class Bøker {

    String tittel;
    double pris;
    String forfatter;
    int ISBNnr;

    public void skrivUt() {
        String ut = "Tittelen til boka er " +tittel+ " og prisen til den ligger på "+pris+" NOK "+". Forfatteren bak dennne flotte boka er " +forfatter+ " og ISBN_nummeret er som følgende "+ISBNnr;
        System.out.println(ut);
    }


    public static void main(String[] args) {

        Bøker bok1 = new Bøker();

        bok1.tittel = "Percy Jackson and The Lightning Thief";
        bok1.forfatter = "MTK";
        bok1.pris = 480;
        bok1.ISBNnr = 123456734;
        bok1.skrivUt();



    }
}
