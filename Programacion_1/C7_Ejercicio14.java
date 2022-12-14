/*Hacer un programa que dado el arreglo definido y precargado, y un número entero
ingresado por el usuario, copie de forma continua las secuencias de tamaño igual al
número ingresado en otro arreglo de iguales características e inicializado con 0. La
copia en este último arreglo deben comenzar desde el principio del mismo.*/

import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C7_Ejercicio14{
	public static final int MAX=10;
	public static final int MINVALOR=1;
	public static final int MAXVALOR=9;
	public static final double prob_int=0.4;
	
	public static void main(String[] args){
		int[] arr = new int [MAX];
		int[]arr2= {0,0,0,0,0,0,0,0,0,0};
		int numero;
		int inicio = 0;
        int fin = -1;
        int index = 0;
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		try{
			cargar_arreglo_sec_int(arr);
			imprimir_arreglo_int(arr);
			imprimir_arreglo_int(arr2);
			System.out.println("Ingrese un numero para borrar secuencias de igual longitud al valor: ");
			numero= Integer.valueOf(entrada.readLine());
			while(inicio<MAX){
				inicio = obtener_inicio_sec(arr, fin+1);
				if(inicio<MAX){
					fin = obtener_fin_sec(arr, inicio);
					if (numero==(fin-inicio+1)){
						insertar_sec_arr2(arr,arr2, numero, inicio, fin, index);
						
					}
				}
               inicio++;
			}
			imprimir_arreglo_int(arr2);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
		
	}
	
	public static void cargar_arreglo_sec_int(int [] arrenteros){
		Random r= new Random();
		arrenteros[0] = 0;
		arrenteros[MAX-1] = 0;
		for(int i=1; i<MAX-1; i++){
			if(r.nextDouble()>prob_int){
				arrenteros[i] = (int)(r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR); 
			}
			else{
				arrenteros[i]=0;
			}
		}
	}
		
	
	public static void imprimir_arreglo_int(int[]arr){
		System.out.println( "Arreglo de secuencias int \n");
		for(int pos =0 ; pos<MAX; pos++){
			System.out.print( arr[pos] + "!");
		}
		System.out.println( "\n");
	}
	
	public static void insertar_sec_arr2(int[]arr, int[]arr2, int numero, int pos, int fin, int index){
		 System.out.println("Secuencia de ese tamaño encontrada entre las posiciones ["+pos+"] y ["+fin+"].");
		while ((pos < MAX)&&(arr[pos]!=0)) {
				corr_der(arr2, index);
	            arr2[index] = arr[pos];
	            pos++;
	            index++;
	        }
	}
	
	public static int obtener_inicio_sec(int [] arrent, int pos){
		while ((arrent[pos]==0)&&(pos<MAX-1)){
			pos++;
			
		}
		return pos;
	}
	
	public static int obtener_fin_sec(int [] arrent, int pos){
		while ((arrent[pos]!=0)&&(pos<MAX)){
			pos++;
		}
		return pos-1;
	}
	
	public static void corr_der(int[]arr, int pos){
		int indice=MAX-1;
		while(pos<indice){
			arr[indice]=arr[indice-1];
			indice--;
		}
	}
}
