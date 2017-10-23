
public class Teoria {

	public static void main(String[] args) {
		
		int[] numeros; // se define el array
		numeros = new int [8]; // se crea el array
		
		numeros [0] = 3;
		numeros [1] = 34;
		numeros [5] = 9;
		numeros [7] = (int)(Math.random()*10); //numero aleatorio entre 
		numeros [6] = 22;
		
		System.out.println(numeros[7]);
		System.out.println(numeros[6]);
		
		int numero_de_alumnos = 20;
		
		int[] notas = new int [numero_de_alumnos];
		
		//rellenar el array notas con 0-s
		for(int i=0; i < notas.length; i++){
			notas[i] = 6;
		}
		
		int suma_de_notas;
		suma_de_notas = notas[0] + notas [1] + notas [3];
		
		System.out.println("la suma de notas es:" + suma_de_notas);
		
		//Se declara se crea y se inicializa
		String [] semana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
				
				System.out.println(semana.length);
				
				
		//sacar por pantalla todos los dias de la semana
		for(int i = 0; i < semana.length; i ++){
			System.out.println(semana[i]);
		}
		
		}
		
	

}
