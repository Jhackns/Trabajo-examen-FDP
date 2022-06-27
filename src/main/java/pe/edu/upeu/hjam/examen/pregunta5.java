package main.java.pe.edu.upeu.hjam.examen;
import java.util.Scanner;
public class pregunta5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long numero, bit;
        System.out.print("Ingrese un n\243mero entero positivo: ");
        numero = in.nextLong();
        System.out.print("\n" + numero + " = ");
        if (numero==0L)
            System.out.print(0);
        for (bit=1; bit<=numero; bit*=2);
        for (bit/=2; bit>0; bit/=2)
            if (numero >= bit)
            {
                System.out.print(1);
                numero -= bit;
            } else {
                System.out.print(0);
            }
        System.out.println("b\n");
    }

}
