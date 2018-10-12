package ScreenPlay.Reto4.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.choucairtesting.com:18000/MaxTimeCHC/Login.aspx")
public class RegistroSesion extends PageObject{
	
	public static final Target INGRESAR_LOGIN = Target.the("INGRESA EL USUARIO ")
			.located(By.xpath("//*[@id=\"Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I\"]"));
	
	public static final Target INGRESAR_CONTRASEÑA = Target.the("INGRESA LA CONTRASEÑA")
			.located(By.xpath("//*[@id=\"Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I\"]"));
	
	public static final Target BOTOR_INGRESAR = Target.the("CLICK EN INGRESAR")
			.located(By.xpath("//*[@id=\"Logon_PopupActions_Menu_DXI0_T\"]"));
}
