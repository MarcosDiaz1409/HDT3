import java.util.Arrays;

/**
 * Marcos Diaz (221102) y Daniel Machic (22118)
 * HT3 07/02/2023
 * La clase de Gnome sort ordena los elementos de un array usando esta forma de ordenamiento
 */

/**
 * NOTA: Este codigo fue tomado de un ejemplo en internet
 * Autor: Mohit Gupta_OMG
 * Sitio del codigo original: https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
 */

public class GnomeSort{

    /* Metodo que ordena numeros por medio de la forma gnome */
    static void gnomeSort(int num[], int n)
    {
        int ind = 0;
        /* En este ciclo el programa va comparando dos numeros a la vez hasta que acomoda todos, del mas pequeño al mas grande */
        while (ind < n) {
            if (ind == 0)
                ind++;
            if (num[ind] >= num[ind - 1])
                ind++;
            else {
                int temp = 0;
                temp = num[ind];
                num[ind] = num[ind - 1];
                num[ind - 1] = temp;
                ind--;
            }
        }
        return;
    }
  
    /* En esta parte se ejecuta el codigo donde se ingresa un arreglo desordenado y se ordena por medio de gnome sort */
    public static void main(String[] args)
    {
        int num[] = { 34, 2, 10, -9, 90, 75, 11 };
  
        gnomeSort(num, num.length);
  
        System.out.print(" ..:: Arreglo Ordenado ::.. ");
        int a = num.length;
        for (int i = 0; i <  a; ++i)
            System.out.print("\n" + num[i]);
        System.out.println();

    }
    
}