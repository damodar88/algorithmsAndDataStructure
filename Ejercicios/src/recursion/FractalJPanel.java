package recursion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FractalJPanel extends JPanel  {
	
	private Color color; //
	private int nivel; //
	
	private final int ANCHURA = 400;
	private final int ALTURA = 400;
	
	// establece el nivel inicial del fractal al valor especifico
	// y establece las especificaciones del JPanel
	public FractalJPanel( int nivelActual ) {
		color = Color.BLUE;
		nivel = nivelActual;
		setBackground( Color.WHITE );
		setPreferredSize( new Dimension( ANCHURA, ALTURA ) );
	} // fin del constructor
	
	// dibuja el fractal en forma recursiva
	public void dibujarFractal( int nivel, int xA, int yA, int xB, int yB, Graphics g ) {
		// caso base : dibuja una linea que conecta dos puntos
		if ( nivel == 0 ) {
			g.drawLine( xA , yA, xB, yB);
		}else {
			// calcula punto medio entre (xA, yA) y (xB yB)
			int xC = ( xA + xB ) / 2;
			int yC = ( yA + yB ) / 2;
			
			//calcula el cuarto punto (xD, yD) que forma un
			//triangulo recto isoceles entre (xA, yA) y (xC, yC)
			// en onde el angulo recto esta en (xD, yD )
			int xD = xA + ( xC - xA ) / 2 - ( yC - yA ) / 2;
			int yD = yA + ( yC - yA ) / 2 + ( xC - xA ) / 2;
			
			// dibuja el fractal en forma recursiva
			dibujarFractal(nivel - 1, xD, yD, xA, yA, g);
			dibujarFractal(nivel - 1, xD, yD, xC, yC, g);
			dibujarFractal(nivel - 1, xD, yD, xB, yB, g);
		} // fin else
	} // fin del metodo dibujar
	
	// inicia el dibujo del fractal
	public void paintComponent( Graphics g ) {
		super.paintComponent( g );
		
		// dibuja el patron del fractal
		g.setColor( color );
		dibujarFractal( nivel, 100, 90, 290, 200, g );
	} // fin del metoo paintComponent
	
	// establece el color de dibujo
	public void establecerColor( Color c ) {
		color = c;
	}
	
	// establece el nuevo nivel de recursividad
	public void establecerNivel( int nivelActual ) {
		nivel = nivelActual;
	}
	
	// devuelve el nivel de recursividad
	public int obtenerNivel() {
		return nivel;
	}
}
