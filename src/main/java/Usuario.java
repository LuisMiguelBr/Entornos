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


    @Override
    public String toString(){
        return "Mi nombre es " + nombre + " y mi pass es " + pass;
    }

    public String getNombre(){
        return nombre;

    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
