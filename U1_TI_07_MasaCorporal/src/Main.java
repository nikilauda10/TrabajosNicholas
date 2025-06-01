import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Solicitar datos de la primera persona
        System.out.println("Dame tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Dame tu altura");
        double altura = sc.nextDouble();
        System.out.println("Dame tu peso");
        double peso = sc.nextDouble();
         sc.nextLine(); // Consumir el salto de línea pendiente
// Solicitar datos de la segunda persona
System.out.println("Dame el nombre de la segunda persona");
        String nombre1 = sc.nextLine();
        System.out.println("Dame tu altura");
        double altura1 = sc.nextDouble();
        System.out.println("Dame tu peso");
        double peso1 = sc.nextDouble();
//Para calcular el imc de la primera persona y impir el mensaje
        Persona people = new Persona(altura, peso, nombre);
        double imc = people.calcularImc();

        String mensaje = people.clasificarImc();
        System.out.println("________________________________");
        System.out.println(people.getNombre() + " IMC: " + imc + " clasificacion" + mensaje);

   

        //Para calcular el imc de la segunda persona y impir el mensaje
        Persona people2 = new Persona(altura1, peso1 ,nombre1);
        double imc2 = people2.calcularImc();
        String mensaje2 = people2.clasificarImc();
        System.out.println("________________________________");
        System.out.println(people2.getNombre() + " IMC: " + imc2 + " clasificacion" + mensaje2);

    }
}