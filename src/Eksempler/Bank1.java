package Eksempler;

public class Bank1 {
    public static void main(String[] args) {

        Konto spareKonto = new Konto("12345678901","Per Hansen", 1000);
        Konto lonnsKonto = new Konto("1234567801", "Per Hansen", 0);

        spareKonto.setSaldo(2000);
        lonnsKonto.setSaldo(1000);

        System.out.println("Sparekontoen tilhører "+spareKonto.getNavn());
        System.out.println("Saldoen til denne er nå "+spareKonto.getSaldo()+" kr");
        System.out.println("Saldoen till lænnskontoen er "+lonnsKonto.getSaldo()+" kr");
    }
}
