import java.util.Arrays;


public class CombinacionGanadora {
    
      /*public static void main(String[] args) {
          
         int[] numerosUsuario = new int[6];
	 int[] numerosGanadores = new int[6];
        
        
        numerosUsuario[0]=2;
	numerosUsuario[1]=7;
	numerosUsuario[2]=15;
	numerosUsuario[3]=22;
        numerosUsuario[4]=26;
        numerosUsuario[5]=41;
        
        numerosGanadores[0]=5;
	numerosGanadores[1]=7;
	numerosGanadores[2]=15;
	numerosGanadores[3]=22;
        numerosGanadores[4]=26;
        numerosGanadores[5]=41;
           
      }*/
    static int primitiva(int apuesta[], int[] combinacionGanadora) {
        int aciertos = 0;

        for (int a : apuesta) {
            if (Arrays.binarySearch(combinacionGanadora, a) >= 0) {
                aciertos++;
            }
        }
        return (aciertos);
    }
    

    public static void main(String[] args) {
        int combinacionGanadora[] = {3, 13, 25, 33, 41, 48};
           int apuesta[] = {3, 25, 41, 42, 45, 49};
           
           System.err.println("Aciertos: " + primitiva(apuesta, combinacionGanadora));
    }

}
