//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Computadora computadora = new Computadora();
        Computadora computadora2 = new Computadora();
        //computadora 1
        System.out.println("==============================");
        computadora.setModelo("MacBook Pro ");
        computadora.setDueño("Nicholas Sotelo");
        computadora.setCosto("$1,500 USD");
        computadora.encender();
        computadora.encender();
        computadora.apagar();
        System.out.println(computadora.getModelo());
        System.out.println(computadora.getDueño());
        System.out.println(computadora.getCosto());
        System.out.println("==============================");

        //computadora 2
        computadora2.setModelo("Dell Inspiron");
        computadora2.setDueño("Juan Perez");
        computadora2.setCosto("$800 USD");
        computadora2.encender();
        computadora2.encender();
        computadora2.apagar();
        System.out.println(computadora2.getModelo());
        System.out.println(computadora2.getDueño());
        System.out.println(computadora2.getCosto());
        System.out.println("==============================");

    }

    
}