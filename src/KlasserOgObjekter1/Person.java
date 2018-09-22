package KlasserOgObjekter1;

public class Person {

    public String navn;
    public String adresse;
    public int telefonNr;
    public int fødselsÅr;

    public int alder() {

        int alder = 2018 - fødselsÅr;

        return alder;
    }

    public void skrivUt(int alder) {

        String ut = navn+" med adresse "+adresse+" med telefonnummer "+telefonNr+" er "+alder;
        String ut2 = "Navn : "+navn+"\nAdresse : "+adresse+"\nTelefonnummer : "+telefonNr+"\nAlder "+alder+" år";
        System.out.println(ut2);

    }

    public static void main(String[] args) {

        Person p1 = new Person();

        p1.navn = "Per Hansen";
        p1.adresse = "Osloveien 82";
        p1.telefonNr = 22124512;
        p1.fødselsÅr = 1999;
        int alder = p1.alder();
        p1.skrivUt(alder);



    }
}
