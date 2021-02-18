package com.examen.mongodb.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "cliente")
public class Cliente {

	@Id
	String id;
	@Indexed(unique = true)
	String nombre_usuario;
	String contraseña;
	String nombre;
	String Apellidos;
	@Indexed(unique = true)
	String correo;
	int edad;
	double estatura;
	double peso;
	double IMC;
	double GEB;
	double ETA;
	Date fecha_creacion;
	Date fecha_actualizacion;
	
	
}
