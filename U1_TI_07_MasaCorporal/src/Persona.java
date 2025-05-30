public class Persona {
    private String nombre;
    private double altura;
    private double peso;

    public Persona(double altura, double peso, String nombre) {
        this.altura = altura;
        this.peso = peso;
        this.nombre = nombre;
    }


    //metodo para sacar el IMC
    public double calcularImc() {
        return peso = peso / (altura * altura);
    }

    //metodo para enseñar peso
    public String clasificarImc() {
        String imc = "";
        if (peso < 18.5) {
           imc = "Bajo peso";
        } else if (peso >= 18.5 && peso <= 24.9) {
            imc = "Peso Normal";

        } else if (peso >= 25 && peso <= 29.9) {
            imc = "Sobre Peso";
        } else if (peso >= 30 && peso <= 39.9) {
            imc = "Peso Obesidad";
        } else  {
            imc = "Muerte";
        }

        return imc;
    }
    //setters y getters
    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public double getAltura () {
        return altura;
    }

    public void setAltura ( double altura){
        this.altura = altura;
    }

    public double getPeso () {
        return peso;
    }

    public void setPeso ( double peso){
        this.peso = peso;
    }
}