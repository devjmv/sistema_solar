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
            true
        );
        assertThat(planet1.getClass().getDeclaredFields().length, is(8));
        assertThat(planet1.getname(), is(equalTo("Tierra")));
        assertThat(planet1.getquantitySatelites(), is(equalTo(1)));
        assertThat(planet1.getmass(), is(equalTo(5.9736E24)));
        assertThat(planet1.getvolume(), is(equalTo(1.08321E12)));
        assertThat(planet1.getdiameter(), is(equalTo(12742)));
        assertThat(planet1.getdistanceSun(), is(equalTo(150000000)));
        assertThat(planet1.getbyType(), is(equalTo(TipoPlaneta.TERRESTRE)));
        assertThat(planet1.isObservable(), is(equalTo(true)));
    }
}
