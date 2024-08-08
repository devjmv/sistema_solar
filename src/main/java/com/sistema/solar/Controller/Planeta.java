package com.sistema.solar.Controller;

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
    private double orbitals;
    private double rotation;

    public Planeta(String name, int quantitySatelites, double mass, double volume, int diameter,
            int distanceSun, TipoPlaneta byType, boolean isObservable, double orbitals, double rotation) {
        this.name = name;
        this.quantitySatelites = quantitySatelites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
        this.byType = byType;
        this.isObservable = isObservable;
        this.orbitals = orbitals;
        this.rotation = rotation;
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

    public double getOrbitals() {
        return orbitals;
    }

    public double getRotation() {
        return rotation;
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
        System.out.println("La Orbita en años = " + getOrbitals());
        System.out.println("La rotacion en días = " + getRotation());
    }

    public double calcularDensidad() {
        return mass / volume;
    }

    public boolean isOuterPlanet() {
        if (distanceSun > LIMITE)
            return true;
        else
            return false;
    }
}
