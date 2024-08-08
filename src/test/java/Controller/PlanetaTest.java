package Controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.Collections;

import org.junit.jupiter.api.Test;

public class PlanetaTest {

    @Test
    public void All_Planets_when_created_have() {
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
            365
        );
        assertThat(planet1.getClass().getDeclaredFields().length, is(11));
        assertThat(planet1.getname(), is(equalTo("Tierra")));
        assertThat(planet1.getquantitySatelites(), is(equalTo(1)));
        assertThat(planet1.getmass(), is(equalTo(5.9736E24)));
        assertThat(planet1.getvolume(), is(equalTo(1.08321E12)));
        assertThat(planet1.getdiameter(), is(equalTo(12742)));
        assertThat(planet1.getdistanceSun(), is(equalTo(150000000)));
        assertThat(planet1.getbyType(), is(equalTo(TipoPlaneta.TERRESTRE)));
        assertThat(planet1.isObservable(), is(equalTo(true)));
        assertThat(planet1.getOrbitals(), is(equalTo(1.0)));
        assertThat(planet1.getRotation(), is(equalTo(365.0)));
    }

    @Test
    public void Calcular_Densidad_del_planeta() {
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
            365
        );
        assertThat(planet1.calcularDensidad(), is(equalTo(5.514720137369484E12)));
    }

    @Test
    public void Determinar_si_un_planeta_del_sistema_solar() {
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
            365
        );
        assertThat(planet1.isOuterPlanet(), is(equalTo(false)));
    }
}
