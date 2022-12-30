public class C7_Ejercicio15 {
    public static final int MAX = 20;
    public static final int MAXPAT = 3;
    public static void main(String[] args) {
        int[] arrint = {0, 1, 2, 3, 0, 5, 6, 7, 0, 9, 10, 0, 5, 6, 7, 0, 5, 6, 7, 0};
        int[] patron = {5, 6, 7};
        int ini_sec = 0;
        int fin_sec = -1;
        int ini_pat = 0;
        int fin_pat = MAXPAT-1;
        System.out.println("Arreglo:");
        imprimir_arreglo_int(arrint);
        System.out.println("\n\nPatrón:");
        imprimir_patron_int(patron);

        while (ini_sec < MAX) {
            ini_sec = inicio_secuencia(arrint, fin_sec+1);
            if (ini_sec < MAX){
                fin_sec = fin_secuencia(arrint, ini_sec);
                if (existe_secuencia(arrint, ini_sec, fin_sec, patron, ini_pat, fin_pat)) {
                    eliminar_secuencias(arrint, ini_sec, fin_sec-ini_sec+1);
                    fin_sec = ini_sec;
                }
            }
        }
        System.out.println("\n\nArreglo con la secuencia eliminada:");
        imprimir_arreglo_int(arrint);
    }

    public static boolean existe_secuencia(int [] arr, int ini_sec, int fin_sec, int[] patron, int ini_pat, int fin_pat){
        if (fin_sec - ini_sec == fin_pat - ini_pat){
            while (ini_sec <= fin_sec && arr[ini_sec] == patron[ini_pat]){
                ini_sec ++;
                ini_pat ++;
            }
        }
        return (ini_sec > fin_sec);
    }

    public static void imprimir_arreglo_int(int[] arr){
        for(int pos = 0; pos < 10; pos++){
            System.out.print(" "+arr[pos]+"    ");
        }
        for(int pos = 10; pos < MAX; pos++){
            System.out.print(" "+arr[pos]+"     ");
        }
        System.out.println();
        for(int pos = 0; pos < MAX-1; pos++){
            System.out.print("["+pos+"]---");
        }
        System.out.print("["+(MAX-1)+"]");
    }

    public static void imprimir_patron_int(int[]arr){
        for (int pos = 0; pos < MAXPAT; pos++){
            System.out.print(" "+arr[pos]+"  ");
        }
    }

    public static int inicio_secuencia(int [] arr, int pos){
        while (pos < MAX && arr[pos]==0)
            pos++;
        return pos;
    }

    public static int fin_secuencia(int [] arr, int pos){
        while (pos < MAX && arr[pos]!=0)
            pos++;
        return pos-1;
    }

    public static void eliminar_secuencias(int [] arrint, int ini_sec, int tamanio) {
        int i=0;
        	while(i<tamanio){
            corrimiento_izq(arrint, ini_sec);
            i++;
        }
    }//cierre eliminar secuencias

    public static void corrimiento_izq(int[] arrint, int pos){
        while(pos<MAX-1) {
            arrint[pos] = arrint[pos + 1];
            pos++;
        }
        //arrint [MAX-1] = 0;
    }//cierre corrimiento izq


}//cierre clase
