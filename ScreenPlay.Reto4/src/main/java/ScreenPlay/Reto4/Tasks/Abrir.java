package ScreenPlay.Reto4.Tasks;

import ScreenPlay.Reto4.UserInterface.RegistroSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
	
	private RegistroSesion registrosesion;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(registrosesion));
	}

	public static Abrir lapaginaweb() {
		return Tasks.instrumented(Abrir.class);
	}
}