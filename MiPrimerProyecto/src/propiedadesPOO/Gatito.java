package propiedadesPOO;

public class Gatito extends Animal{  
	private String nombre;  
 
	public String getName(){  
		return nombre;  
	}  

	public void setName(String name){  
		this.nombre=name;  
	}

	public void sonido(){
		System.out.println("Miau");
	}  
	
	public void jugar(){
		System.out.println("Tirar cosas de la mesa.");
	}

}

