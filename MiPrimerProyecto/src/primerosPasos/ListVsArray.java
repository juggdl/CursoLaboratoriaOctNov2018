package primerosPasos;
import java.util.*; 

public class ListVsArray {
	
	static void imprimeLista(List<Integer> lista) {
		System.out.println(lista);
	}
	
	static void imprimeArray(int[]array) {
		for(int i=0; i<10; i++){
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		 List<Integer> lista = new ArrayList<Integer>(); 
		int[] array = new int[10];
		
		/******** CREA LISTA *****************/
		lista.add(1);
		lista.add(2);
		lista.add(3);		
		//imprimeLista(lista);
		
		/********* REMUEVE EL SEGUNDO ELEMENTO ***********/
		lista.remove(1);		
		//imprimeLista(lista);
		
		/********* AGREGA 10 ELEMENTOS A LA LISTA *******/		
		for(int i=0; i<10 ;i++) {
			lista.add(i);
		}		
		//imprimeLista(lista);
		
		/******** ORDENA LISTA**************************/		
		Collections.sort(lista);
		//imprimeLista(lista);	
		
		
		
		
		/********* CREA ARRAY *************************/
		array[0]=1;
		array[1]=2;
		array[2]=3;		
		//imprimeArray(array);
		
		/********* AGREGA 10 ELEMENTOS MÁS A LA LISTA *******/		
		for(int i=3; i<13 ;i++) {
			array[i] = i;
		}
		imprimeArray(array);
		
	}
		
}
