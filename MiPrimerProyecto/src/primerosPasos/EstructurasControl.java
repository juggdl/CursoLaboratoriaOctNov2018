package primerosPasos;

public class EstructurasControl {


/***************** USO DE IF **************************************/
	
	public static void ifTest(boolean contento) {		
		boolean gato = contento;
		
		if(gato == true) {
			System.out.println("Purrr");
		}
		else {
			System.out.println("Miau");
		}		
	}

	
/***************** USO DE FOR **************************************/
	
	public static void forTest(int cantidad){
		
		for(int i=0; i<=cantidad; i++) {
			System.out.println("Vamos a contar " + i + " gatitos");
		}
	}


/***************** USO DE SWITCH ***********************************/
	
	public static void switchTest(int mes){
		
		switch(mes) {
		
			case 1:
				System.out.println("Enero");
				break;
			
			case 2:
				System.out.println("Febrero");
				break;
				
			case 3: 
				System.out.println("Marzo");
				break;
			
			default:
				System.out.println("Cualquier otro mes");
				break;
		}
		
	}
	
	
/***************** USO DE WHILE ***********************************/
	public static void whileTest(int i){
		
		while(i>1) {
			System.out.println(i);
			i--;
		}
	}
	

/***************** USO DE DO WHILE *********************************/
	public static void doWhileTest(int i){
		
		int suma = 0;
		
		do{
			suma = suma + i;
			System.out.println(suma);
			i--;
		}
		
		while(i>1);
	}
	
	
	
/***************** MAIN *****************************************/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifTest(false);
		//forTest(6);
		//switchTest(2);
		//whileTest(10);
		doWhileTest(5);
	}
}
