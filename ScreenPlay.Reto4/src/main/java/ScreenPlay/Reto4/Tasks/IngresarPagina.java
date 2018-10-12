package ScreenPlay.Reto4.Tasks;

import java.util.List;

import ScreenPlay.Reto4.Model.DatosIngreso;
import ScreenPlay.Reto4.UserInterface.RegistroSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class IngresarPagina implements Task{
	
	private List<DatosIngreso> datosingreso;
		
	public IngresarPagina (List<DatosIngreso> registroingreso) {
        super();
        this.datosingreso = registroingreso;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(datosingreso.get(0).getUsuario()).into(RegistroSesion.INGRESAR_LOGIN));
		actor.attemptsTo(Enter.theValue(datosingreso.get(0).getContraseña()).into(RegistroSesion.INGRESAR_CONTRASEÑA));
		actor.attemptsTo(Click.on(RegistroSesion.BOTOR_INGRESAR));
	}

	public static IngresarPagina datosusuario(List<DatosIngreso> loguear) {
		return Tasks.instrumented(IngresarPagina.class, loguear);
	}
}