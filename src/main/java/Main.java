import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Proyecto Listo para GitHub");
        Scanner sc = new Scanner(System.in);
        String texto = "";
        String pass = "1234";


        do{
            System.out.print("Adivina mi contraseña secreta:");
            texto = sc.nextLine();
            System.out.print("He recibido" + texto);
        }while(texto != pass);



    }



}
