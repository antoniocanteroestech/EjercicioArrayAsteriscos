package es.estech;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Para recoger los valores que se introduzcan por consola creamos una instancia de la clase scanner,
         * esta clase lo que hace es guardar esos valores, y cada vez que llamamos a algún método next ese valor
         * que devuelve se elimina del scanner
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Solicitamos al usuario un número, para establecer el tamaño de nuestro array
         */
        System.out.println("Introduce el tamaño del array");

        /**
         * Si preguntamos al scanner si tiene algo en "memoria" nos dirá que SI (true) ya que aún no hemos guardado
         * el valor en variable
         */
        System.out.println(scanner.hasNext());

        /**
         * Guardamos ese número en memoria, en la variable size
         */
        int size = scanner.nextInt();

        int[] myArray = new int[size];

        /**
         * Imprimimos el array para ver que ya está en memoria, y todas sus posiciones valen 0
         */
        System.out.println("Array recién creado");
        System.out.println(Arrays.toString(myArray));

        /**
         * Solicitamos al usuario que introduzca tantos valores como tamaño tiene el array
         */
        System.out.printf("Introduce los %d valores del array separados por espacios", size);

        /**
         * recorremos el array (de momento con los valores a 0, y por cada posición le asignamos el primer
         * valor que nos devuelve scanner.nextInt(), ese valor sale de scanner
         */
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = scanner.nextInt();
        }

        /**
         * Imprimimos el array para ver que ya está en memoria, y todas sus posiciones valen 0
         */
        System.out.println("Array con los valores del scanner");
        System.out.println(Arrays.toString(myArray));

        /**
         * Declaramos la variable que vamos String que vamos a utilizar para guardar cada línea de asteriscos
         * que se debe pintar como resolución del ejercicio, esa variable la reutilizaremos
         */
        String line;

        /**
         * recorremos nuestro array para, en cada posición crear la línea y pintarla
         */
        for (int n: myArray){
            line = ""; // inicializamos la línea a "vacía", ya que si el valor de la posición fuera 0 no debería aparecer nada
            for (int i = 0; i <= n; i++){ // creamos un bucle que
                if (n > 0 ) // solo añadimos asteriscos si n > 0
                    line += "*";
            }
            System.out.println(line);
        }

        scanner.close();
    }
}
