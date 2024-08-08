package com.sistema.solar;

import com.sistema.solar.Controller.Planeta;
import com.sistema.solar.Controller.TipoPlaneta;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Planeta planet1 = new Planeta(
                "Tierra",
                1,
                5.9736E24,
                1.08321E12,
                12742,
                150000000,
                TipoPlaneta.TERRESTRE,
                true,
                1,
                365);
        planet1.printData();
        System.out.println("Densidad del planeta = " + planet1.calcularDensidad());
        System.out.println("Es planeta exterior = " + planet1.isOuterPlanet());

        Planeta planet2 = new Planeta(
                "Júpiter",
                79,
                1.899E27,
                1.4313E15,
                139820,
                750000000,
                TipoPlaneta.GASEOSO,
                true,
                11.84,
                4328.9);
        planet2.printData();
        System.out.println("Densidad del planeta = " + planet2.calcularDensidad());
        System.out.println("Es planeta exterior = " + planet2.isOuterPlanet());
    }
}
