//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Computadora computadora = new Computadora();
        computadora.setModelo("MacBook Pro ");
        computadora.encender();
        computadora.encender();
        computadora.apagar();
        System.out.println(computadora.getModelo());
        System.out.println("==============================");
    }
}