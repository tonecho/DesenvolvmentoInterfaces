import java.util.Scanner;

public class ComprobarContraseña {
    public static void main(String[] args) {

        String contraseña= "abc123.";
        String introducir;
        Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce contraseña: ");
            introducir = teclado.nextLine();

           if(contraseña.equals(introducir) == true) {
               System.out.println("coinciden");
           }else{
               System.out.println("Non coinciden");
           }
    }
}
