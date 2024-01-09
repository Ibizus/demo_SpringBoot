package org.iesvdm.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //La anotación @Data de lombok proporcionará el código de:
		// getters/setters, toString, equals y hashCode
		// propio de los objetos POJOS o tipo Beans
@AllArgsConstructor //Para generar un constructor con lombok con todos los args
public class Comercial {

	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private float comision;
	
}
