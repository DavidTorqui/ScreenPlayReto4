package ScreenPlay.Reto4.StepInteractions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import ScreenPlay.Reto4.Model.DatosDiligenciar;
import ScreenPlay.Reto4.Model.DatosIngreso;
import ScreenPlay.Reto4.Questions.LaRespuesta;
import ScreenPlay.Reto4.Tasks.Abrir;
import ScreenPlay.Reto4.Tasks.DiligenciarMaxTime;
import ScreenPlay.Reto4.Tasks.IngresarPagina;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ReporteMaxTime {
	
	@Managed (driver="chrome")
	private WebDriver hisBrowser;
	private Actor david = Actor.named("David");
	
	@Before
	public void configuracionInicial() {
		david.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Dado("^que david necesita ingresar a la pagina con usuario y contraseña a MaxTime$")
	public void queDavidNecesitaIngresarALaPaginaConUsuarioYContraseñaAMaxTime(List<DatosIngreso> ingresa) {
		david.wasAbleTo(Abrir.lapaginaweb());
		david.attemptsTo(IngresarPagina.datosusuario(ingresa));
	}

	@Cuando("^el realiza el registro del mismo en el aplicativo MaxTime$")
	public void elRealizaElRegistroDelMismoEnElAplicativoMaxTime(List<DatosDiligenciar> completaregistro) {
		david.attemptsTo(DiligenciarMaxTime.ingresavalores(completaregistro));
	}

	@Entonces("^el verifica que se muestre (.*) en la pantalla\\.$")
	public void elVerificaQueSeMuestreEnLaPantalla(String registroexitoso)  {
		david.should(seeThat(LaRespuesta.es(),equalTo(registroexitoso)));
	}
}