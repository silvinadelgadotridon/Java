
import java.util.Random;

public class Parcial_12062019{
	public static int MAXFILA=4;
	public static int MAXCOLUMNA=10;
	public static int MINVALOR=1;
	public static int MAXVALOR=10;
	public static double prob_int = 0.4;
	
	public static void main(String[] args){
		int fila=0;
		int [] [] matint= new int[MAXFILA] [MAXCOLUMNA];
		cargar_matriz_aleatorio_secuencias_int(matint);
		imprimir_matriz(matint);
		while(fila<MAXFILA){
				eliminar_secuencia_central(matint[fila]);
				fila++;	
		}
		imprimir_matriz(matint);
		
		
	}
	
	public static void cargar_matriz_aleatorio_secuencias_int(int [][] mat){
			for (int fila = 0; fila < MAXFILA; fila++){
				cargar_arreglo_sec_int(mat[fila]);
			}
				System.out.println("");
	}
			
	public static void cargar_arreglo_sec_int(int [] arrenteros){
		Random r= new Random();
		arrenteros[0] = 0;
		arrenteros[MAXVALOR-1] = 0;
		for(int i=1; i<MAXVALOR-1; i++){
			if(r.nextDouble()>prob_int){
				arrenteros[i] = (int)(r.nextInt(MAXVALOR-MINVALOR+1)+MINVALOR); 
			}
			else{
				arrenteros[i]=0;
			}
		}
	}
	
	public static void imprimir_matriz( int[][] mat){
		for(int fila =0; fila<MAXFILA; fila ++){
			System.out.print(" | ");
			for(int columna= 0; columna<MAXCOLUMNA; columna++){
				System.out.print(mat[fila][columna]+" | ");
			}
			System.out.println();
		}
	}
	
	public static void eliminar_secuencia_central(int [] arr){
		int inicio=0;
		int fin=-1;
		int cont=0;
		while(inicio<MAXCOLUMNA){
			inicio= obtener_inicio_sec(arr, fin+1);
			if((inicio<MAXCOLUMNA)&&(cont<(numero_secuencias(arr))/2)){
				fin= obtener_fin_sec(arr, inicio);
				cont++;		
			}
			else if(cont==(numero_secuencias(arr))/2){
				eliminar(arr, inicio, fin);
			}
			fin = inicio;				
		
		}
	}
	
	public static int numero_secuencias(int[]arr){
		int inicio=0;
		int fin=-1;
		int cont=0;
		while(inicio<MAXCOLUMNA){
			inicio= obtener_inicio_sec(arr, fin+1);
			if(inicio<MAXCOLUMNA){
				fin= obtener_fin_sec(arr, inicio);
				cont++;
			}
			fin = inicio;
		}
		return cont;
	}
	
	public static void eliminar(int[]arr, int inicio, int fin){
		int cont=0;
		while(cont<(fin-inicio+1)){
			corr_izq(arr, inicio);
			cont++;
		}
	}
	
	public static void corr_izq(int[]arr, int pos){
		while(pos<MAXCOLUMNA-1){
			arr[pos]=arr[pos+1];
			pos++;
		}
	}
	
	public static int obtener_inicio_sec(int [] arr, int pos){
		while((pos<MAXCOLUMNA)&&(arr[pos]==0)){
			pos++;
		}
		return pos;
	}
	
	public static int obtener_fin_sec(int [] arr, int pos){
		while((pos<MAXCOLUMNA-1)&&(arr[pos]!=0)){
			pos++;
		}
		return pos-1;
	}
}