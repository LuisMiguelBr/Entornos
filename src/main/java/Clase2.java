public class Clase2 {
    public static void main(String [] args){
        Usuario u1 = new Usuario("MechaCristo","1234");
        Usuario u2 = new Usuario();
        System.out.println(u2);
        Usuario[] usuarios = new Usuario[2];
        usuarios[0] = u1;
        usuarios[1] = u2;

        // Pedir inciar sesion a un usuario
        // Primero hay que comprobar el nombre
        // Si el nombre es correcto entonces hay que pedir la contraseña
        // Si no te sigo preguntando por el nombre.
        // Si la contraseña es correcta te digo, usuario logeado!
        // Si no te pregunto hasta 2 veces por la contraseña como maximo
        // Si tras esos intentos no he conseguido acertar, entonces finalizara el programa diciendo
        // Alerta Hackerman!
    }



}
