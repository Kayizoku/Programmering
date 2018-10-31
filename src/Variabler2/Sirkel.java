package Variabler2;

public class Sirkel {


    public double omkrets;
    public double diameter;
    public double areal;
    public double radius = omkrets / 2 * Math.PI;

    public Sirkel(double radius, double omkrets, double areal, double diameter) {

        this.omkrets = omkrets;
        this.diameter = diameter;
        this.areal = areal;

        if(radius < 0) {
            this.radius = 0;
        } else
            this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0) {
            this.radius = 0;
        } else
            this.radius = radius;
    }

    public double getOmkrets() {
        return omkrets;
    }

    public void setOmkrets(double omkrets) {
        this.omkrets = omkrets;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getAreal() {
        return areal;
    }

    public void setAreal(double areal) {
        this.areal = areal;
    }

    public static double finnDiameter(double omkrets) {

        double diameter = omkrets / Math.PI;
        return diameter;
    }

    public static double finnOmkrets(double diameter) {

        double omkrets = Math.PI * diameter;
        return omkrets;
    }

    public static double finnAreal(double radius) {

        double areal = Math.PI * radius * radius;
        return areal;

    }

    public void skrivUt() {

        String ut = "Radius: "+radius+" \nDiameter: "+diameter+" \nmkrets: "+omkrets+" \nAreal: "+areal;
        System.out.println(ut);
    }



    public static void main(String[] args) {

        Sirkel sirkel = new Sirkel(20, 20, 20 ,20);
        sirkel.skrivUt();





    }
}