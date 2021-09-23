import java.util.Scanner;
import co.app.Usuarios;
public class App {
    public static void main(String[] args) {
        Scanner XD= new Scanner(System.in);
        String nombre="";
        int n=0;
        Usuarios usu= new Usuarios();
        usu.setGenerarNumero(15);
        System.out.print("ingrese su nombre :");
        nombre=XD.next();
        usu.setNombre(nombre);
        System.out.println("ingrese un numero: "+usu.getNombre() );
        n= XD.nextInt();
        usu.setGenerarNumero(n);
    }
    
}
