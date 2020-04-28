package bibliotecahibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import mipaquete.Libro;

public class AccesoDatos {
	static StandardServiceRegistry s=null;
	static SessionFactory sf=null;
	public static void abrirConexion()
	{
	s=new StandardServiceRegistryBuilder().configure().build();
	sf=new MetadataSources(s).buildMetadata().buildSessionFactory();
	}
	public static void grabarLibro(Libro l)
	{
		Session sesion=sf.openSession();
		Transaction t=sesion.beginTransaction();
		
		sesion.save(l);
		t.commit();
		sesion.close();
		
	}
	public static List recuperarLibros()
	{
		Session sesion=sf.openSession();
		Query q=sesion.createQuery("FROM Libro");//SQL: Select... from TABLA
												//JPQL: form Entidad
		List libros=q.getResultList();
		sesion.close();
		return libros;
		
	}
}
