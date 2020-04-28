package mipaquete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tabla_libros")
public class Libro {

	
	private String nombre;
	
	private String titulo, autor;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	public Libro() {
		
	}
	
	public Libro(String nombre, String titulo, String autor) {
		super();
		this.nombre = nombre;
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", titulo=" + titulo + ", autor=" + autor + ", id=" + id + "]";
	}
	
	
	
}
