

import java.util.*;
public class NewClass {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] muestra = new int[10];

        int i;
        int cantidades[]=new int[muestra.length];
        int cantidade = 0;
        int moda;
        int numero;

        for (i = 0; i < muestra.length; i++) {
            System.out.print("Introduce numero para a mostra. Elemento" + i);
            numero = sc.nextInt();
            muestra[i] = numero;
        }
        for (int k = 0; k < muestra.length; k++) {
            
            cantidade=0;
            for (int j = 0; j < muestra.length; j++) {
                if (muestra[k] == muestra[j]) {
                    cantidade++;
                }
                cantidades[k]=cantidade;
            }
        }
        for (int i=0; i < muestra.length; i++){
        
        }

    }
}
