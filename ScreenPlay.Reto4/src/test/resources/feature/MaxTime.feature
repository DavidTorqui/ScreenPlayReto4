#language:es
#Author: your.email@your.domain.com

@tag
Característica: Registrar mis actividades en el sistema de registro
  		Como analista de pruebas	
  		Quiero realizar el reporte de mis actividades en MaxTime
  		Para cumplir con la tarea que debo llevar a cabo diariamente

  @tag1
  Escenario: Registar el registro tiempo en MaxTime
    Dado que david necesita ingresar a la pagina con usuario y contraseña a MaxTime
    | usuario 	 | contraseña 			| 
		| jarcilan   | !QAZxsw2#EDCvfr4 | 
    Cuando el realiza el registro del mismo en el aplicativo MaxTime
    | usuario  | codigoBusqueda |  tipoHora    | servicio 								  | actividad 													| horasEjecutadas | Comentario     |
		| jarcilan | GBCO25         |  H. Choucair | P. generales CVDS clásicos | CAPACITACIÓN METODOLOGÍA DE PRUEBAS |				4					| DAVID EL MEJOR |
		| jarcilan | GBCO25         |  H. Choucair | P. generales CVDS clásicos | CAPACITACIÓN METODOLOGÍA DE PRUEBAS |				4					| DAVID EL SUPER MEJOR MEJOR |
		Entonces el verifica que se muestre Conectarse en la pantalla.
    
 