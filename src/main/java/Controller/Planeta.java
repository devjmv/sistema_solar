package Controller;

public class Planeta {

    

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

}
