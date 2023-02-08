/**
 * Marcos Diaz (221102) y Daniel Machic (22118)
 * HT3 07/02/2023
 * La clase de Merge sort ordena los elementos de un array usando esta forma de ordenamiento
 */

/**
 * NOTA: Este codigo fue tomado de un ejemplo en internet
 * Autor: Rajat Mishra
 * Sitio del codigo original: https://www.geeksforgeeks.org/merge-sort/
 */

public class MergeSort{

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int numeros[], int l, int m, int r)
    {
        // Aqui se encuentra el tamaño de los dos sub arrays que se obtienen del array de numeros principal
        int n1 = m - l + 1;
        int n2 = r - m;
 
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i){
            L[i] = numeros[l + i];
        }

        for (int j = 0; j < n2; ++j){
            R[j] = numeros[m + 1 + j];
        }
        
        /* Comienza el proceso de juntar nuevamente ambos arrays */
 
        int i = 0; 
        int j = 0;
 
        // Indice inical del nuevo array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                numeros[k] = L[i];
                i++;
            }
            else {
                numeros[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Se copian los elementos restantes de ambos sub arrays */
        while (i < n1) {
            numeros[k] = L[i];
            i++;
            k++;
        }
 
        while (j < n2) {
            numeros[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Esta funcion de sort es la que ordena todos los datos del array
    void sort(int numeros[], int l, int r)
    {
        if (l < r) {

            // Encuentra la "mitad" del arreglo
            int m = l + (r - l) / 2;
 
            // Ordena las dos partes del array despues de dividirlo 
            sort(numeros, l, m);
            sort(numeros, m + 1, r);
 
            // Une nuevamente ambos arrays
            merge(numeros, l, m, r);
        }
    }
 
    // Codigo donde se ejecuta el merge sort
    public static void main(String args[])
    {
        int numeros[] = { 12, 11, 13, 5, 6, 7 };

        MergeSort ob = new MergeSort();
        ob.sort(numeros, 0, numeros.length - 1);
 
        System.out.println(" Arreglo Ordenado");
        int n = numeros.length;
        for (int i = 0; i < n; ++i)
            System.out.print(numeros[i] + " ");
        System.out.println();
    }
    
}
