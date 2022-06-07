// Fig. 19.21: PruebaPropiedades.java
// Demuestra la clave del paquete java.util
package colection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PruebaProperties 
{
	private Properties tabla;
	
	// establece la GUI para probar la tabla Properties
	public PruebaProperties() 
	{
		tabla = new Properties();
		
		// establece las propiedades
		tabla.setProperty( "color" , "azul" );
		tabla.setProperty( "anchura" , "200" );
		
		System.out.println( "Despues de establecer propiedades" );
		listarPropiedades(); // muestra los valores de las propiedades
		
		// reemplaza el valor de una propiedad
		tabla.setProperty( "color" , "rojo" );
		
		System.out.println( "Despues de reemplazar propiedades" );
		listarPropiedades(); // muestra los valores de las propiedades
		
		guardarPropiedades(); // guarda las propiedades
		
		tabla.clear(); // vacia la tabla
		
		System.out.println( "Despues de borrar propiedades" );
		listarPropiedades(); // muestra los valores de las propiedades
		
		cargarPropiedades(); // carga las propiedades
		
		// obtiene el valor de la propiedad color
		Object valor = tabla.getProperty( "color" );
		
		// comprueba si el valor esta en la tabla
		if ( valor != null )
		{
			System.out.printf("El valor de la propiedad color es %s\n", valor );
		}
		else
		{
			System.out.println( "La propiedad color no esta en la tabla" );
		}
	} // fin del constructor
	
	// guardar las propiedades en un archivo
	public void guardarPropiedades() 
	{
		//guarda las propiedades de la tabla
		try 
		{
			FileOutputStream salida = new FileOutputStream( "props.dat" );
			tabla.store( salida, "Propiedades de ejemplo" ); // guarda las propiedades
			salida.close();
			System.out.println( "Despues de guardar las propiedades" ); 
			listarPropiedades(); // muestra los valores de las propiedades 
		}
		catch ( IOException ioException )
		{
			ioException.printStackTrace();
		} // fin del catch
	} // fin del metodo guardarPropiedades
	
	// carga las propiedades
	public void cargarPropiedades() 
	{
		try
		{
			// carga el contenido de la tabla
			FileInputStream entrada = new FileInputStream( "props.dat" );
			tabla.load( entrada );
			entrada.close();
			System.out.println( "Despues de cargar las propiedades" );
			listarPropiedades(); // muestra los valores de las propiedades
		} // fin try
		catch ( IOException ioException )
		{
			ioException.printStackTrace();
		} // fin catch
	} // fin del metodo cargarPropiedades

	// imprime los valores de las propiedades
	public void listarPropiedades() 
	{
		Set< Object > claves = tabla.keySet(); // obtiene los nombres de las propiedades
		
		// imprime los pares nombre/valor
		for ( Object clave : claves )
		{
			System.out.printf(
					"%s\t%s\n", clave, tabla.getProperty( ( String ) clave) );
		} // fin de for
		
		System.out.println();
	} // fin del metodo listarPropiedades
	
	public static void main( String[] args ) 
	{
		new PruebaProperties();
	}
}
















