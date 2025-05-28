import Model.Estudiante;

public class App {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(); 
        Estudiante estudiante2 = new Estudiante(); 
        Estudiante estudiante3 = new Estudiante(); 
        Estudiante estudiante4 = new Estudiante(); 
        Estudiante estudiante5 = new Estudiante(); 

        // Estudiante 1
        estudiante1.setNombre("Estudiante 1"); 
        estudiante1.setMatricula("20243ds060");     
        estudiante1.setNota(0, 75);
        estudiante1.setNota(1, 80);
        estudiante1.setNota(2, 65);
        estudiante1.setNota(3, 90);
        estudiante1.setNota(4, 70);

        // Estudiante 2
        estudiante2.setNombre("Estudiante 2"); 
        estudiante2.setMatricula("20243ds010");     
        estudiante2.setNota(0, 85);
        estudiante2.setNota(1, 78);
        estudiante2.setNota(2, 82);
        estudiante2.setNota(3, 90);
        estudiante2.setNota(4, 95);

        // Estudiante 3
        estudiante3.setNombre("Estudiante 3"); 
        estudiante3.setMatricula("20243ds020");     
        estudiante3.setNota(0, 60);
        estudiante3.setNota(1, 65);
        estudiante3.setNota(2, 70);
        estudiante3.setNota(3, 68);
        estudiante3.setNota(4, 72);

        // Estudiante 4
        estudiante4.setNombre("Estudiante 4"); 
        estudiante4.setMatricula("20243ds030");     
        estudiante4.setNota(0, 90);
        estudiante4.setNota(1, 85);
        estudiante4.setNota(2, 80);
        estudiante4.setNota(3, 95);
        estudiante4.setNota(4, 88);

        // Estudiante 5
        estudiante5.setNombre("Estudiante 5"); 
        estudiante5.setMatricula("20243ds040");     
        estudiante5.setNota(0, 50);
        estudiante5.setNota(1, 60);
        estudiante5.setNota(2, 55);
        estudiante5.setNota(3, 65);
        estudiante5.setNota(4, 58);

        // Mostrar datos
        mostrar(estudiante1);
        mostrar(estudiante2);
        mostrar(estudiante3);
        mostrar(estudiante4);
        mostrar(estudiante5);
    }

    public static void mostrar(Estudiante est) {
        System.out.println("\nNombre: " + est.getNombre());
        System.out.println("Matrícula: " + est.getMatricula());
        System.out.println("Promedio: " + est.calcularPromedio());
        System.out.println("¿Aprobado?: " + (est.aprobado() ? "Sí" : "No"));
    }
}
