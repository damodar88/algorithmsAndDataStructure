package recursion;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fractal extends JFrame {
	
	private final int ANCHURA = 400; // define la anchuera de la GUI
	private final int ALTURA = 480; // define la altura de GUI
	private final int NIVEL_MIN = 0, NIVEL_MAX = 15;
	private Color color = Color.BLUE;
	
	private JButton cambiarColorJButton, aumentarNivelJButton, reducirNivelJButton;
	
	private JLabel nivelJLabel;
	private FractalJPanel espacioDibujo;
	private JPanel principalJPanel, controlJPanel;

	// establece la GUI
	public Fractal() {
		super( "Fractal" );
		
		//establece el panel de control
		controlJPanel = new JPanel();
		controlJPanel.setLayout( new FlowLayout() );
		
		//establece el boton de color y registro de el componente de escucha
		cambiarColorJButton = new JButton( "Color" );
		controlJPanel.add( cambiarColorJButton );
		cambiarColorJButton.addActionListener( 
				new ActionListener() {
					//procesa el evento de cambiarColorJButton
					public void actionPerformed( ActionEvent evento ) {
						color = JColorChooser.showDialog( Fractal.this, "Elija un color", color );
						// establece el color predeterminado, si no se devuelve un color
						if ( color == null ) {
							color = Color.BLUE;
						}//fin del if
						espacioDibujo.establecerColor( color );
					} // fin del metodo actionPerformance
				} // fin de la clase interna anonima
			); // fin de adActionListener
	
		// establece boton para reducir nivel, para agregarlo al panel de control 
		// y registrar el componente de escucha
		reducirNivelJButton = new JButton( "Reducir nivel" );
		controlJPanel.add( reducirNivelJButton );
		reducirNivelJButton.addActionListener( 
				new  ActionListener() {
					public void actionPerformed( ActionEvent evento ) {
						int nivel = espacioDibujo.obtenerNivel();
						nivel--; // reduce el nivel de uno
						
						// modifica el nivel si es posible
						if ( ( nivel >= NIVEL_MIN ) && ( nivel <+ NIVEL_MAX ) ) {
							nivelJLabel.setText( "Nivel: "+ nivel );
							espacioDibujo.establecerNivel( nivel );
							repaint();
						} // fin if
					} // fin del metodo actionPerformance
				} // fin de la clase interna anonima
		); // fin de addActionListener
		
		// establece el boton para aumentar nivel, para agregarlo al panel de control
		// y registra el componente de escucha
		aumentarNivelJButton = new JButton( "Aumentar nivel" );
		controlJPanel.add( aumentarNivelJButton );
		aumentarNivelJButton.addActionListener(
				new ActionListener() { // clase interna anonima
					// procesa el evento de aumentarNivelJButton
					public void actionPerformed( ActionEvent evento ) {
						int nivel = espacioDibujo.obtenerNivel();
						nivel++; // aumenta el nivel de uno
						
						// modifica el nivel si es posible
						if ( ( nivel >= NIVEL_MIN ) && ( nivel <= NIVEL_MAX ) ) {
							nivelJLabel.setText( "Nivel: "+ nivel );
							espacioDibujo.establecerNivel( nivel );
							repaint();
						} // fin de if
					} // fin del metodo actionPerformand
				} // fin de la clase interna anonima
		); // fin de addactionListener
		
		// establece nivelJLabel para agragarlo a controlJPanel
		nivelJLabel = new JLabel( "Nivel: 0" );
		controlJPanel.add( nivelJLabel );
		
		espacioDibujo = new FractalJPanel( 0 );
		
		// crea principalJPanel para que contenga a controlJPanel y espacioDibujo
		principalJPanel = new JPanel();
		principalJPanel.add( controlJPanel );
		principalJPanel.add( espacioDibujo );
		
		add( principalJPanel ); // agrega JPanel a JFrame
		
		setSize( ANCHURA, ALTURA );
		setVisible( true );
		
	}
	
	public static void main(String[] args) {
		Fractal demo = new Fractal();
		demo.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}
