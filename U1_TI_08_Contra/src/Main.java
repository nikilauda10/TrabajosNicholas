import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre de usuario");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Ingrese su contraseña");
        String password = sc.nextLine();
        System.out.println("confirme su contraseña");
        String auth = sc.nextLine();

        UsuarioSeguro usuario = new UsuarioSeguro();
        usuario.setNombreUsuario(nombre);
        usuario.setPassword(password);
        if(usuario.validarPassword(auth)){
            System.out.println("acceso exitoso");
        }
        else{
            System.out.println("acceso no valido");
        }
    }
}