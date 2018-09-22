package Eksempler;

public class Konto {

    private String PersonNummer;
    private String navn;
    private  double saldo;

    public Konto(String personNummer, String navn, double saldo) {

        PersonNummer = personNummer;
        this.navn = navn;
        this.saldo = saldo;
    }

    public String getPersonNummer() {
        return PersonNummer;
    }

    public void setPersonNummer(String personNummer) {
        PersonNummer = personNummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
