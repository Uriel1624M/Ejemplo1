/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author AspireE
 */
public class Arreglos {
//prueba
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float promedio = 0;
        float suma = 0;
        int mayor = 0;
        int menor = 0;
        int dimension;
        System.out.println("Ingresa la dimension del arregloss :");
        dimension = entrada.nextInt();
        int[] Arreglo = new int[dimension];
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.print("Ingrese el número en la posición " + (i + 1) + " :");
            Arreglo[i] = entrada.nextInt();
        }
        // realizar la suma, promedio y el mayor
        for (int i = 0; i < Arreglo.length; i++) {
            suma += Arreglo[i];
            if (mayor < Arreglo[i]) {
                mayor = Arreglo[i];
            }
            System.out.println(String.format("Posición [%d] Elemento: %d", i,
                    Arreglo[i]));
        }
        menor = mayor;
        // buscar el menor
        for (int i = 0; i < Arreglo.length; i++) {
            if (menor > Arreglo[i]) {
                menor = Arreglo[i];
            }
        }
        //promedio
        promedio = suma / Arreglo.length;
        System.out.println("***Salida***");
        // contar las veces que se repite cada número
        int cont;
        for (int i = 0; i < Arreglo.length; i++) {
            cont = 0;
            for (int j = i; j < Arreglo.length; j++) {
                if (Arreglo[i] == Arreglo[j]) {
                    cont++;
                }
            }
            System.out.println(String.format("El número %d se repite %d veces",
                    Arreglo[i], cont));
        }
        System.out
                .println(String
                        .format("La suma es %.2f, el promedio es %.2f, el mayor es %d, el menor es %d",
                                suma, promedio, mayor, menor));

    }

}
