import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class C8_Ej13{
	public static int MAXFILA=4;
	public static int MAXCOLUMNA=10;
	public static int MINVALOR=1;
	public static int MAXVALOR=10;
	public static double prob_int = 0.4;
	
	public static void main(String[] args){
		int numero;
		int fila=0;
		int [] [] matint= new int[MAXFILA] [MAXCOLUMNA];
		cargar_matriz_aleatorio_secuencias_int(matint);
		imprimir_matriz(matint);
		BufferedReader entrada= new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("ingrese un numero entero: ");
			numero= Integer.valueOf(entrada.readLine());
			while(fila<MAXFILA){
				eliminar_secuencias_tamano_igual_num(matint[fila], numero);
				fila++;	
			}
			imprimir_matriz(matint);
		}
		
		catch( Exception exc){
			System.out.println(exc);
		}
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
	
	public static void eliminar_secuencias_tamano_igual_num(int [] arr, int numero){
		int inicio=0;
		int fin=-1;
		while(inicio<MAXCOLUMNA){
			inicio= obtener_inicio_sec(arr, fin+1);
			if(inicio<MAXCOLUMNA){
				fin= obtener_fin_sec(arr, inicio);
				if(numero==(fin-inicio+1)){
					eliminar(arr, inicio, fin);
					fin = inicio;
				}
			}
		}
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
