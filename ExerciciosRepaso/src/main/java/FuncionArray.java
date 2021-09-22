import java.util.Arrays;

public class FuncionArray {
    
    public static int[] iniciarArray(int[] tablaEnteiros)
    {
        for(int i=0;i<tablaEnteiros.length;i++)
            {
            tablaEnteiros[i]=7;
            }
            return tablaEnteiros;
    }
    
    public static void main(String[] args) {
        int[] tablaEnteiros=new int[8];
        for(int i=0;i<tablaEnteiros.length;i++)
        {
            tablaEnteiros[i]=0;
        }
        tablaEnteiros=iniciarArray(tablaEnteiros);
        System.out.println(Arrays.toString(tablaEnteiros));

    }

}
