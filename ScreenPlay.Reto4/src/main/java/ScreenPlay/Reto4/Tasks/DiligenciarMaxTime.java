package ScreenPlay.Reto4.Tasks;

import java.util.List;

import org.openqa.selenium.WebDriver;

import ScreenPlay.Reto4.Interactions.Esperar2;
import ScreenPlay.Reto4.Interactions.Esperar5;
import ScreenPlay.Reto4.Interactions.SeleccionarLista;
import ScreenPlay.Reto4.Model.DatosDiligenciar;
import ScreenPlay.Reto4.UserInterface.FormularioMaxTime;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenciarMaxTime implements Task{
	
	public String HorasTrabajadas, HorasReportadas;
	public int HorasTrabajadasInt,HorasReportadasInt;
	public int i = 0;
	
	private List<DatosDiligenciar> datosdiligenciar;
	
	private static WebDriver driver = Serenity.getWebdriverManager().getCurrentDriver();
	
	public DiligenciarMaxTime(List<DatosDiligenciar> registroformulario) {
        super();
        this.datosdiligenciar = registroformulario;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Esperar5.aMoment());   
		actor.attemptsTo(Click.on(FormularioMaxTime.SELECCIONAR_FILTRO));	
		actor.attemptsTo(Esperar5.aMoment()); 
		actor.attemptsTo(SeleccionarLista.Desde(FormularioMaxTime.ELEGIR_ANALISTA, datosdiligenciar.get(0).getUsuario().trim()));
		actor.attemptsTo(Esperar5.aMoment()); 
		actor.attemptsTo(Click.on(FormularioMaxTime.SELECCIONA_FECHA));
		actor.attemptsTo(Esperar5.aMoment()); 
		HorasTrabajadas = driver.findElement(By.xpath("//*[@id=\"Vertical_v3_MainLayoutView_xaf_l64_xaf_dviHorasLaborales_View\"]")).getText();
        HorasReportadas = driver.findElement(By.xpath("//*[@id=\"Vertical_v3_MainLayoutView_xaf_l98_xaf_dviTotalHorasReportadas_View\"]")).getText();
        HorasTrabajadasInt = Integer.valueOf(HorasTrabajadas);
        HorasReportadasInt = Integer.valueOf(HorasReportadas);
        if
        (driver.findElement(By.xpath("//table[contains(@id,'_dviLaboral_View')]/tbody/tr/td//span/input[contains(@id,'xaf_dviLaboral_View_S')]")).getAttribute("value").equals("C")) {
        	while(HorasTrabajadasInt>HorasReportadasInt) {
        			actor.attemptsTo(Click.on(FormularioMaxTime.NUEVO_REGISTRO));
        			actor.attemptsTo(Esperar5.aMoment()); 
        			actor.attemptsTo(Click.on(FormularioMaxTime.SELECCIONAR_LISTA_PROYECTO));
        			actor.attemptsTo(Esperar5.aMoment()); 
        				driver.switchTo().frame(0);
        						actor.attemptsTo(Enter.theValue(datosdiligenciar.get(i).getCodigoBusqueda()).into(FormularioMaxTime.INGRESAR_BUSQUEDA_PROYECYO));
        						actor.attemptsTo(Click.on(FormularioMaxTime.BOTON_BUSCAR_PROYECTO));
        						actor.attemptsTo(Esperar5.aMoment()); 
        						actor.attemptsTo(SeleccionarLista.Desde(FormularioMaxTime.CHECK_LIST_PROYECYO,datosdiligenciar.get(i).getCodigoBusqueda().trim()));
        						actor.attemptsTo(Esperar5.aMoment());  
        				driver.switchTo().defaultContent();
		actor.attemptsTo(Click.on(FormularioMaxTime.SELECCIONAR_BOTON_HORA));
		actor.attemptsTo(SeleccionarLista.Desde(FormularioMaxTime.TIPO_HORA,datosdiligenciar.get(i).getTipoHora().trim()));
		actor.attemptsTo(Click.on(FormularioMaxTime.SELECCIONAR_LISTA_SERVICIO));
		actor.attemptsTo(Esperar5.aMoment()); 
						driver.switchTo().frame(0);
								actor.attemptsTo(Enter.theValue(datosdiligenciar.get(i).getServicio()).into(FormularioMaxTime.INGRESAR_BUSQUEDA_SERVICIO));
								actor.attemptsTo(Click.on(FormularioMaxTime.BOTON_BUSCAR_SERVICIO));
								actor.attemptsTo(Esperar2.aMoment());  
								actor.attemptsTo(SeleccionarLista.Desde(FormularioMaxTime.CHECK_LIST_SERVICIO,datosdiligenciar.get(i).getServicio().trim()));
								actor.attemptsTo(Esperar2.aMoment()); 
								actor.attemptsTo(Esperar5.aMoment()); 
						driver.switchTo().defaultContent();
		actor.attemptsTo(Click.on(FormularioMaxTime.SELECCIONAR_ACTIVIDAD));
		actor.attemptsTo(SeleccionarLista.Desde(FormularioMaxTime.BUSCAR_ACTIVIDAD,datosdiligenciar.get(i).getActividad().trim()));
		actor.attemptsTo(Esperar2.aMoment()); 
		actor.attemptsTo(Click.on(FormularioMaxTime.ESPACIO_VACIO_ACTIVIDAD));
		actor.attemptsTo(Esperar2.aMoment()); 
		actor.attemptsTo(Click.on(FormularioMaxTime.HORAS_EJECUTADAS));
		actor.attemptsTo(Enter.theValue(datosdiligenciar.get(i).getHorasEjecutadas()).into(FormularioMaxTime.HORAS_EJECUTADAS));
		actor.attemptsTo(Click.on(FormularioMaxTime.ESPACIO_VACIO_ACTIVIDAD));
		actor.attemptsTo(Esperar2.aMoment()); 
		actor.attemptsTo(Click.on(FormularioMaxTime.COMENTARIO));
		actor.attemptsTo(Enter.theValue(datosdiligenciar.get(i).getComentario()).into(FormularioMaxTime.COMENTARIO));
		actor.attemptsTo(Click.on(FormularioMaxTime.ESPACIO_VACIO_ACTIVIDAD));
		actor.attemptsTo(Esperar2.aMoment()); 
		actor.attemptsTo(Click.on(FormularioMaxTime.GUARDAR_Y_CERRAR));
		actor.attemptsTo(Esperar2.aMoment()); 
		HorasReportadas = driver.findElement(By.xpath("//*[@id=\"Vertical_v3_MainLayoutView_xaf_l98_xaf_dviTotalHorasReportadas_View\"]")).getText();
		HorasReportadasInt = Integer.valueOf(HorasReportadas);
		i = i + 1;
		       	}
		}
		actor.attemptsTo(Click.on(FormularioMaxTime.CERRAR_SESION));
	}
	
	public static DiligenciarMaxTime ingresavalores(List<DatosDiligenciar> llenar) {
		return Tasks.instrumented(DiligenciarMaxTime.class, llenar);
	}
}