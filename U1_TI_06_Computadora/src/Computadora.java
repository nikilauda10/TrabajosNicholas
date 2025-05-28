public class Computadora {
    private String Marca;
    private String modelo;
    private boolean estado;
    private String dueño;

    public String getMarca() {
        return Marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }
    public boolean getEstado() {
        return estado;
    }
    public void encender() {
        if (estado ==false) {
            estado = true;
            System.out.println("Encendiendo");
        }
    }
    public void apagar() {
        if (estado ==true) {
            estado = false;
            System.out.println("Apagando");
        }

    }
    public String getDueño() {
        return dueño;
    }
    public void setDueño(String dueño) {
        this.dueño = dueño;
    
    }

    
}
