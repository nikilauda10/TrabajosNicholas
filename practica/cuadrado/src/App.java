public class App {
    public static void main(String[] args) throws Exception {
        Square sq = new Square();
        sq.setSide(10);
        System.out.println("El area del cuadrado representado es: " + sq.getArea());
        System.out.println("El perimetro es: " + sq.getPerimeter());

    }
} 

