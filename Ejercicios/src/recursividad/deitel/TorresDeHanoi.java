package recursividad.deitel;

public class TorresDeHanoi {
	
	private int numDisc;
	
	public TorresDeHanoi( int discos ) {
		numDisc = discos;
	}
	
	public void resolverTorres( int discos, int agujaOrigen, int agujaDestino, int agujaTem ) {
		if ( discos == 1 ) {
			System.out.printf( "\n%d --> %d", agujaOrigen, agujaDestino );
		}else {
			//paso recursivo
			//mueve ( discos - 1 ) discos de agijaorigen a gujaTam usando agijaDestino
			resolverTorres(discos - 1, agujaOrigen, agujaTem , agujaDestino);
			//mueve el ultimo disco a agujaorijen a agujadestino
			System.out.printf( "\n%d --> %d", agujaOrigen, agujaDestino );
			//mueve ( discos -1 ) discos de agujaTem a agujaDestino
			resolverTorres(discos - 1, agujaTem, agujaDestino, agujaOrigen );
		}
	}
	
}
