package ejercicios;


public class ExprecionesRegulares {
	
	 public static void main(String[] args)  {
		 ExprecionesRegulares m = new ExprecionesRegulares();
	        m.validarTelefono("+56989617176");
	            
	        if ( m.equals(m)) {
				System.out.printf("verdedero: ", m);
			}else {
				System.out.println("false:  ");
			}
	    }
	    
	    
	    // valida el teléfono
	   public static boolean validarTelefono(String telefono){
		   return telefono.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
	   } 

}
