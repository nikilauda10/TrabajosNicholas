import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Dame tu altura");
        double altura = sc.nextDouble();
        System.out.println("Dame tu peso");
        double peso = sc.nextDouble();


        Persona people = new Persona(altura, peso, nombre);
        double imc = people.calcularImc();

        String mensaje = people.clasificarImc();
        System.out.println(people.getNombre() + " IMC: " + imc + " clasificacion" + mensaje);

    }
}