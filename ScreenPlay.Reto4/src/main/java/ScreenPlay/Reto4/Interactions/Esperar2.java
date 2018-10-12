package ScreenPlay.Reto4.Interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.awaitility.Awaitility;
import static ScreenPlay.Reto4.Util.UtilidadTiempo.condicionExitosa;

public class Esperar2 implements Interaction {

                @Override
                public <T extends Actor> void performAs(T actor) {
                               try {
                                               Awaitility.await().forever().pollInterval(2000, TimeUnit.MILLISECONDS).until(condicionExitosa());
                               } catch (Exception e) {
                                               e.getMessage();
                               }
                }

                public static Esperar2 aMoment() {
                return instrumented(Esperar2.class);
                }
}
