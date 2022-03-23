import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        String texto = "";
        String pass = "1234";
        String fakeInput = "1111\n2222"; //\n1234";
        InputStream inputStream = new ByteArrayInputStream(fakeInput.getBytes());
        Scanner sc = new Scanner(inputStream);
        do{
            System.out.println("Adivina mi contraseña secreta:");
            texto = sc.nextLine();
            System.out.print("He recibido" + texto);
        }while(!texto.equals(pass) && sc.hasNext());



    }



}
