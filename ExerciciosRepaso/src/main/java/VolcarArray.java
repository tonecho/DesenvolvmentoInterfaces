import java.util.Arrays;
import java.util.Scanner;

public class VolcarArray {
     public static void main(String[] args) {
         
         int orixinal[]= new int[] {1, 2, 3, 4};
         int copia[]= new int[6];
         int posini, posfin;
         Scanner sc=new Scanner(System.in);
         System.out.println("Introduce inicio");
         posini=sc.nextInt();
         System.out.println("Introduce fin");
         posfin=sc.nextInt();
         copia=Arrays.copyOfRange(orixinal, posini, posfin);
         System.out.println(Arrays.toString(copia));
            
     }
    
}
