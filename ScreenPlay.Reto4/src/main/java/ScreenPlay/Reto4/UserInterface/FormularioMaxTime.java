package ScreenPlay.Reto4.UserInterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioMaxTime extends PageObject {
	
	public static final Target REPORTE_TIEMPO = Target.the("SELECCIONA EL SUBMENU REPORTE DE TIEMPO")
			.located(By.xpath("//*[@id=\"Vertical_NC_NB_I0i0_\"]"));
		
	public static final Target SELECCIONAR_FILTRO = Target.the("INGRESA AL FILTRO DE BUSQUEDA ")
			.located(By.xpath("//*[@id=\"Vertical_v1_LE_v2_col1\"]/table/tbody/tr/td[2]/img"));
	
	public static final Target ELEGIR_ANALISTA = Target.the("SELECCIONA AL ANALISTA")
			.located(By.xpath("//*[@id=\"Vertical_v1_LE_v2_DXHFP_PWC-1\"]/table"));
	
	public static final Target SELECCIONA_FECHA = Target.the("EL PRIMER REGISTRO QUE APARECE ")
			.located(By.xpath("//*[@id=\"Vertical_v1_LE_v2_tccell0_0\"]"));
	
	public static final Target VERIFICAR_DIA_LABORAL = Target.the("VERIFICA SI EL CHECK LIST ESTA ACTIVADO")
			.located(By.xpath("//*[@id=\"Vertical_v5_MainLayoutView_xaf_l59_xaf_dviLaboral_View_S_D\"]"));
	
	public static final Target NUEVO_REGISTRO = Target.the("SELECCIONA NUEVO PARA GENERAR REPORTE ")
			.located(By.xpath("//*[@id=\"Vertical_v3_MainLayoutView_xaf_l103_xaf_dviReporteDetallado_ToolBar_Menu_DXI0_T\"]/a"));
	
	public static final Target SELECCIONAR_LISTA_PROYECTO = Target.the("CLICK PARA QUE DESPRENDA LA PESTAÑA ")
			.located(By.xpath("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l128_xaf_dviProyecto_Edit_Find_BImg\"]"));
	
	public static final Target INGRESAR_BUSQUEDA_PROYECYO = Target.the("INGRESA CAMPO DE BUSQUEDA PROYECTO ")
			.located(By.xpath("//*[@id=\"Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I\"]"));

	public static final Target BOTON_BUSCAR_PROYECTO = Target.the("CLICK EN BOTON DE BUSQUEDA")
			.located(By.xpath("//*[@id=\"Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_B_CD\"]"));
	
	public static final Target CHECK_LIST_PROYECYO = Target.the("SELECCIONA EL PROYECTO BUSCADO")
			.located(By.xpath("//*[@id=\"Dialog_v9_LE_v10\"]"));
	
	public static final Target BOTON_ACEPTAR_PROYECTO = Target.the("ACEPTA EL CAMPO SELECCIONADO DE LA BUSQUEDA ")
			.located(By.xpath("//*[@id=\"Dialog_actionContainerHolder_Menu_DXI0_T\"]"));
	
	public static final Target SELECCIONAR_BOTON_HORA = Target.the("SELECCIONA BOTON DE HORA ")
			.located(By.xpath("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_B-1\"]/table"));
	
	public static final Target TIPO_HORA = Target.the("SELECCIONA EL TIPO DE HORA")
			.located(By.xpath("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l148_xaf_dviTipoHora_Edit_DD_DDD_L\"]"));
	
	public static final Target SELECCIONAR_LISTA_SERVICIO = Target.the("CLICK PARA QUE DESPRENDA LA PESTAÑA ")
			.located(By.xpath("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l153_xaf_dviServicio_Edit_Find_CD\"]"));
	
	public static final Target INGRESAR_BUSQUEDA_SERVICIO = Target.the("INGRESA CAMPO DE BUSQUEDA SERVICIO ")
			.located(By.xpath("//*[@id=\"Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I\"]"));
	
	public static final Target BOTON_BUSCAR_SERVICIO = Target.the("CLICK EN BOTON DE BUSCAR SERVICIO")
			.located(By.xpath("//*[@id=\"Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_B_CD\"]"));
	
	public static final Target CHECK_LIST_SERVICIO = Target.the("SELECCIONA EL SERVICIO")
			.located(By.xpath("//*[@id=\"Dialog_v14_LE_v15\"]"));
	
	public static final Target BOTON_ACEPTAR_SERVICIO= Target.the("ACEPTA EL CAMPO SELECCIONADO DE SERVICIO ")
			.located(By.xpath("//*[@id=\"Dialog_actionContainerHolder_Menu_DXI0_T\"]"));
	
	public static final Target SELECCIONAR_ACTIVIDAD = Target.the("SELECCIONA LA ACTIVIDAD ")
			.located(By.xpath("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_B-1\"]"));
	
	public static final Target BUSCAR_ACTIVIDAD = Target.the("SELECCIONA LA ACTIVIDAD ")
			.located(By.xpath("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l158_xaf_dviActividad_Edit_DD_DDD_L_D\"]"));
	
	public static final Target ESPACIO_VACIO_ACTIVIDAD = Target.the("SELECCIONA UN CAMPO VACIO PARA PODER INGRESAR HORAS ")
			.located(By.xpath("//*[@id=\"CP\"]/table/tbody/tr[2]/td"));
		
	public static final Target HORAS_EJECUTADAS = Target.the("INGRESA LAS HORAS EJECUTADAS ")
			.located(By.xpath("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l182_xaf_dviHoras_Edit_I\"]"));
	
	public static final Target COMENTARIO = Target.the("COMENTARIO ")
			.located(By.xpath("//*[@id=\"Vertical_v6_MainLayoutEdit_xaf_l207_xaf_dviComentario_Edit_I\"]"));
	
	public static final Target GUARDAR_Y_CERRAR = Target.the("GUARDA Y CIERRA ")
			.located(By.xpath("//*[@id=\"Vertical_EditModeActions2_Menu_DXI1_T\"]/a"));
	
	public static final Target VERIFICAR_HORAS = Target.the("VERIFICA LAS 8 HORAS DEL DIA ")
			.located(By.xpath("//*[@id=\"Vertical_v5_MainLayoutView_xaf_l98_xaf_dviTotalHorasReportadas_View\"]"));
	
	public static final Target CERRAR_SESION = Target.the("CERRAR SESION")
			.located(By.xpath("//*[@id=\"Vertical_SAC_Menu_DXI0_T\"]/a"));
	
	public static final Target VALIDAR_MENSAJE = Target.the("VALIDA QUE CERRO SESION")
			.located(By.xpath("//*[@id=\"Logon_viewCaptionControl_VSL\"]"));
}