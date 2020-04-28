package bibliotecahibernate;

import java.util.List;
import java.util.logging.Level;

import mipaquete.Libro;

public class ClasePrincipal {

	public static void main(String[] args) {
		//java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		Libro l=new Libro("Marco Polo ", " de la Mancha", "Marco Polo");
		AccesoDatos.abrirConexion();
		AccesoDatos.grabarLibro(l);
		List<Libro> libros=AccesoDatos.recuperarLibros();
		for (Libro libro : libros) {
			System.out.println(libro);
		}
		
	}

}
