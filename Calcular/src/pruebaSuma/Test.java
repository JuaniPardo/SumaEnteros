package pruebaSuma;

import operaciones.Sumatoria;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Sumatoria suma = new Sumatoria();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero");
        System.out.printf("El resultado de la suma es %d",(suma.sumatoria((sc.nextInt()))));
    }
}
