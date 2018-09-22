package KlasserOgObjekter2;

public class BensinKjøp {

    private String sted;
    private String type;
    private double liter;
    private double pris;
    private String tidspunkt;

    public BensinKjøp(String sted, String type, double liter, double pris, String tidspunkt) {

        this.sted = sted;
        this.type = type;
        this.liter = liter;
        this.pris = pris;
        this.tidspunkt = tidspunkt;

    }

    public double finnTotalPrisen() {

        double sum = liter * pris;
        return  sum;
    }

    public String getSted() {
        return  sted;
    }

    public void setSted(String sted) {
        this.sted = sted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public static void main(String[] args) {

        BensinKjøp b1 = new BensinKjøp("Oslo", "Diesel", 6.5, 45, "12:25");

        //String prisMedToDesimaler = String.format("%.2f", b1.getPris());

        System.out.println("Bensinstasjonens sted er: " +
                ""+b1.getSted()+" \nType bensin er: "+b1.getType()+" \nAntall liter fylt er: "+b1.getLiter()+" \nPrisen pr. liter er: " +b1.getPris()+
                ""+b1.getLiter()+ "\nTidspunkt fylt er: "+b1.getTidspunkt()+" \nTotal prisen er: "+b1.finnTotalPrisen());
    }
}