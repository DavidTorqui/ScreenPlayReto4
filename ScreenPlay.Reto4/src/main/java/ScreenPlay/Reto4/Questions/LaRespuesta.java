package ScreenPlay.Reto4.Questions;

import ScreenPlay.Reto4.UserInterface.FormularioMaxTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta  implements Question<String> {

	public static LaRespuesta es() {
		return new LaRespuesta();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(FormularioMaxTime.VALIDAR_MENSAJE).viewedBy(actor).asString();
	}
}

