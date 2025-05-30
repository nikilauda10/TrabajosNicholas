public class Square {
  private double side;


    // getters y setters
    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {

        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }
}
