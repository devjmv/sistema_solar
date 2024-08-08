package Controller;

public class Planeta {

    private final float LIMITE = (float) (149597870 * 3.4);

    private String name;
    private int quantitySatelites;
    private double mass;
    private double volume;
    private int diameter;
    private int distanceSun;
    private TipoPlaneta byType;
    private boolean isObservable;

    public Planeta(String name, int quantitySatelites, double mass, double volume, int diameter,
            int distanceSun, TipoPlaneta byType, boolean isObservable) {
        this.name = name;
        this.quantitySatelites = quantitySatelites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
        this.byType = byType;
        this.isObservable = isObservable;
    }

    public String getname() {
        return name;
    }

    public int getquantitySatelites() {
        return quantitySatelites;
    }

    public double getmass() {
        return mass;
    }

    public double getvolume() {
        return volume;
    }

    public int getdiameter() {
        return diameter;
    }

    public int getdistanceSun() {
        return distanceSun;
    }

    public TipoPlaneta getbyType() {
        return byType;
    }

    public boolean isObservable() {
        return isObservable;
    }

    public void printData() {
        System.out.println("Nombre del planeta = " + getname());
        System.out.println("Cantidad de satélites = " + getquantitySatelites());
        System.out.println("Masa del planeta = " + getmass());
        System.out.println("volume del planeta = " + getvolume());
        System.out.println("Diámetro del planeta = " + getdiameter());
        System.out.println("Distancia al sol = " + getdistanceSun());
        System.out.println("byType de planeta = " + getbyType());
        System.out.println("Es observable = " + isObservable());
    }

    double calcularDensidad() {
        return mass / volume;
    }

    boolean isOuterPlanet() {
        if (distanceSun > LIMITE)
            return true;
        else
            return false;
    }
}
