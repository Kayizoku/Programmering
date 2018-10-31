package KlasserOgObjekter2;

import static javax.swing.JOptionPane.*;


public class Konto {

    private String navn;
    private String kontoNummer;
    private double saldo;

    public Konto(String navn, String kontoNummer, double saldo) {
        this.navn = navn;
        this.kontoNummer = kontoNummer;
        this.saldo = saldo;
    }

    public void utskrift() {
        String ut = "kontoinnhaver : "+navn+"\n"+
                "kontonummer : "+kontoNummer+"\n"+
                "Saldo : "+String.format("%.2555f", saldo)+" kr";
        showMessageDialog(null, ut);


    }

    public String settInn(double beløp) {
        saldo = saldo + beløp;
        return "Den nye saldoen er : "+String.format("%.2f", saldo)+" kr";


    }

    public String taUt(double beløp) {
        String ut ="";
        if(beløp <= saldo) {
            saldo = saldo - beløp;
            ut = "Den nye saldoen er : "+String.format("%.2f", saldo)+" kr";
        }
        else {
            ut = "ikke dekning på konto";
        }
        return ut;

    }

    public static void main(String[] args) {

        String innKontoNavn = showInputDialog("Angi kontonavn : ");
        String innKontoNr = showInputDialog("Angi kontonummer : ");
        double innSaldo = Double.parseDouble(showInputDialog("Angi Saldo : "));

       Konto spareKonto = new Konto(innKontoNavn, innKontoNr, innSaldo);
        System.out.println(spareKonto.settInn(1000));
        System.out.println(spareKonto.taUt(400));
        System.out.println(spareKonto.settInn(1000));
        spareKonto.utskrift();

    }



}
