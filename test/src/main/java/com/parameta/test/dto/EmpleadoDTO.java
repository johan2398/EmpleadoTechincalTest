package com.parameta.test.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO que representa el Empleado
 * 
 * @author JohanCasagua
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpleadoDTO {

	/** Employee name */
	private String nombre;
	
	/** Employee last name */
	private String pellido;
	
	/** Document type */
	private String tipoDocumento;
	
	/** Document number */
	private String numeroDocumento;
	
	/** Birth date*/
	private Date fechaNacimiento;
	
	/** Date of joining the company*/
	private Date vinculacionCompania;
	
	/** Position */
	private String cargo;
	
	/** Salary */
	private Double salario;
	
}
