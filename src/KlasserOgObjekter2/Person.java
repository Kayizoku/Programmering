package KlasserOgObjekter2;

import  static javax.swing.JOptionPane.*;

public class Person {

    private String fornavn;
    private String etternavn;
    private String adresse;
    private int telefonNr;

    public Person(String fornavn, String etternavn, String adresse, int telefonNr) {

        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonNr = telefonNr;
    }

    public void skrivUt() {
        String ut = "Fornavn: "+fornavn+"\nEtternavn: "+etternavn+" \nAdresse: "+adresse+" \nTelefonNr: "+telefonNr;
        showMessageDialog(null, ut);
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getEtternavn() {
        return  etternavn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setTelefonNr(int telefonNr) {
        this.telefonNr = telefonNr;
    }

    public int getTelefonNr() {
        return telefonNr;
    }

    public static void main(String[] args) {

        String innFornavn = showInputDialog("Skriv inn navnet");
        String innEtternavn = showInputDialog("Skriv inn etternavnet");
        String innTelefonNr = showInputDialog("Skriv inn telefonNr");
        String innAdresse = showInputDialog("Skriv inn adressen");


        int telefonNr = Integer.parseInt(innTelefonNr);

        Person p1 = new Person(innFornavn, innEtternavn, innAdresse, telefonNr);
        p1.skrivUt();
    }
}
