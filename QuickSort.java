/**
 * Marcos Diaz (221102) y Daniel Machic (22118)
 * HT3 07/02/2023
 * La clase de Quick sort ordena los elementos de un array usando esta forma de ordenamiento
 */

/**
 * NOTA: Este codigo fue tomado de un ejemplo en internet
 * Autor: Techie Delight
 * Sitio del codigo original: https://www.techiedelight.com/es/quicksort/
 */


public class QuickSort{

    public static void inter(int[] num, int i, int j)
    {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
 
    // Partición usando el esquema de partición de Lomuto
    public static int division(int[] a, int inicio, int fin)
    {
        // Elija el elemento más a la derecha como un pivote en el arreglo
        int pivot = a[fin];
 
        /* Los elementos se empujaran dependiendo si son menores, mayores o iguales al pivote */
        int pIndex = inicio;
 
        /* Si el elemento es menor o igual al pivote, pIndex se incrementa*/
        for (int i = inicio; i < fin; i++)
        {
            if (a[i] <= pivot)
            {
                inter(a, i, pIndex);
                pIndex++;
            }
        }
 
        /* Intercambia el indice por el pivote actual */
        inter(a, fin, pIndex);
 
        return pIndex;
    }
 
    // Metodo donde se comienza a clasificar y ordenar el arreglo
    public static void quicksort(int[] a, int inicio, int fin)
    {
    
        if (inicio >= fin) {
            return;
        }
 
        /* Reorganiza los elementos por medio del pivote */
        int pivot = division(a, inicio, fin);
 
        /* Convierte los datos a un subarray que contiene elementos menores que el pivote */
        quicksort(a, inicio, pivot - 1);
 
        /* Se repite en el subarray que contiene más elementos que el pivote */
        quicksort(a, pivot + 1, fin);
    }
 
    /* Se ejecuta el codigo donde los elementos se ordenan con el metodo quicksort */
    public static void main(String[] args)
    {
        int[] a = { 0, -100, 90, 247, 12, -1, -33, 1000};
 
        quicksort(a, 0, a.length - 1);

        System.out.print(" ..:: Arreglo Ordenado ::.. ");
        int x = a.length;
        for (int i = 0; i <  x; ++i)
            System.out.print("\n" + a[i]);
        System.out.println();

    }    

}