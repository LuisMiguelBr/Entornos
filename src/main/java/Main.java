import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String texto = "";
        String pass = "1234";
        String fakeInput = "1111";
        InputStream inputStream = new ByteArrayInputStream(fakeInput.getBytes());

        do{
            System.out.println("Adivina mi contraseña secreta:");
            texto = sc.nextLine();
            System.out.print("He recibido" + texto);
        }while(!texto.equals(pass));



    }



}
