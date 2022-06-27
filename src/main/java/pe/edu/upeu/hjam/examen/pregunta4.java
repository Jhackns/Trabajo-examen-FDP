package main.java.pe.edu.upeu.hjam.examen;
import java.util.Scanner;
public class pregunta4 {
    public static void main (String[] args) {
        int divisor, numero, suma = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un n\243mero: ");
        numero = in.nextInt();
        System.out.print("1");
        for (divisor=2; divisor<numero; divisor++)
            if (numero%divisor==0)
            {
                System.out.print(" + " + divisor);
                suma += divisor;
            }
        System.out.println(" = " + suma);
        if (suma==numero)
            System.out.println("\nEl n\243mero " + numero + " s\241 es perfecto.\n");
        else
            System.out.println("\nEl n\243mero " + numero + " no es perfecto.\n");
    }

}

