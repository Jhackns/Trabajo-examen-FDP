package ExamenFDP;

import java.util.Scanner;

/**
 * 1Ejercicio
 */
public class 1Ejercicio {

    static Scanner leerTeclado=new Scanner(System.in);

    public static void Pregunta1() {
            double n1, n2, n3, promedio;
            String estado;
            System.out.println("Ingrese Nota 1:");
            n1=leerTeclado.nextDouble();
            System.out.println("Ingrese Nota 2:");
            n2=leerTeclado.nextDouble();
            System.out.println("Ingrese Nota 3:");
            n3=leerTeclado.nextDouble();
            
            if(promedio>=17 && promedio<=20) {
                estado="Aprobo con mension excelente";
            }else if(promedio<17 && promedio>=14){
                estado="Aprobo con mension regular";
            }else if(promedio<14 && promedio>=11){
                estado="Aprobo con mension baja";
            }else{
                estado="Desaprobo";
            }

            System.out.println(estado);
    }


    public static void main(String[] args) {
        Pregunta1();
    }


    
    }