import java.util.Arrays;

/**
 * Marcos Diaz (221102) y Daniel Machic (22118)
 * HT3 07/02/2023
 * La clase de Radix sort ordena los elementos de un array usando esta forma de ordenamiento
 */

/**
 * NOTA: Este codigo fue tomado de un ejemplo en internet
 * Nombre del sitio web: Geeks for geeks
 * Sitio del codigo original: https://www.geeksforgeeks.org/radix-sort/
 */

public class RadixSort{

    // Funcion que busca el mayor numero en el arreglo
    static int getMax(int num[], int n)
    {
        int max = num[0];
        for (int i = 1; i < n; i++){
            if (num[i] > max)
                max = num[i];
        }
        return max;
    }
 
    /* Metodo que ordena los numeros del arreglo por medio de un counting sort */
    static void countSort(int num[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        for (i = 0; i < n; i++){
            count[(num[i] / exp) % 10]++;
        }
        // Change count[i] so that count[i] now contains actual position of this digit in output[]
        for (i = 1; i < 10; i++){
            count[i] += count[i - 1];
 
        }
        /* Genera el arreglo que devolvera  */
        for (i = n - 1; i >= 0; i--){
            output[count[(num[i] / exp) % 10] - 1] = num[i];
            count[(num[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++){
            num[i] = output[i];
        }    
    }
 
    /* Esta funcion ordena los datos por medio de la forma radix */ 
    static void radixSort(int num[], int n)
    {
        /* Encuentra el numero mas grande del array */
        int m = getMax(num, n);
 
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(num, n, exp);
    }
 
    /* Se ejecuta el codigo donde los elementos se ordenan con el metodo radix sort */
    public static void main(String[] args)
    {
        int num[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = num.length;
 
        radixSort(num, n);
        
        System.out.print(" ..:: Arreglo Ordenado ::.. ");
        int x = num.length;
        for (int i = 0; i <  x; ++i)
            System.out.print("\n" + num[i]);
        System.out.println();
    }

}