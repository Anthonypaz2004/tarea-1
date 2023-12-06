import java.util.Scanner;

class Persona {
    private String nombre;

    // Constructor que inicializa el nombre de la persona
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método para mostrar un saludo personalizado
    public void saludar() {
        System.out.println("¡Hola, " + nombre + "! Gracias por atender.");
    }
}

public class Salud {
String nombre;
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Crear un objeto de la clase Persona con el nombre proporcionado
        Persona persona = new Persona(nombre);

        // Mostrar un saludo personalizado usando el método de la clase Persona
        persona.saludar();

        // Cerrar el scanner para evitar posibles fugas de recursos
        scanner.close();
    }
}
