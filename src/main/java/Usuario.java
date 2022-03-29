import java.util.Scanner;

public class Usuario {

    private String nombre;
    private  String pass;


    public Usuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del usuario");
        this.nombre = sc.nextLine();
        System.out.println("Introduce la pass del usuario" + this.nombre);
        this.pass   = sc.nextLine();

    }







    public Usuario(String nombre, String pass){
        this.nombre = nombre;
        this.pass = pass;

    }


}
