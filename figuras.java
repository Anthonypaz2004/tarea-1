import java.util.Scanner;
class lados {
    private float lado1;
    private float lado2;
    private float area;

    public lados(float lado1, float lado2, float area) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.area = area;
    }

    public void areacuadri() {
        System.out.println("Lado1=" + lado1 + " Lado2=" + lado2 + " --> Área total=" + area);
    }
    public void areacircu() {
        System.out.println("Pi=3.1416"+ " Radio=" + lado2 + " --> Área total=" + area);
    }
    public void areatrian() {
        System.out.println("Base=" + lado1 + " Altura=" + lado2 + " --> Área total=" + area);
    }
}

public class figuras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú de Cálculo de Áreas ===");
            System.out.println("1. Calcular área de un cuadrilátero");
            System.out.println("2. Calcular área de una circunferencia");
            System.out.println("3. Calcular área de un triángulo");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    calcularAreaCuadrilatero(entrada);
                    break;
                case 2:
                    calcularAreaCircunferencia(entrada);
                    break;
                case 3:
                    calcularAreaTriangulo(entrada);
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);

    
    }

    private static void calcularAreaCuadrilatero(Scanner entrada) {
        float lado1, lado2, area;

        System.out.print("Ingrese la longitud del primer lado: ");
        lado1 = entrada.nextFloat();

        System.out.print("Ingrese la longitud del segundo lado: ");
        lado2 = entrada.nextFloat();

        area = lado1 * lado2;
        lados figura = new lados(lado1, lado2, area);
        figura.areacuadri();
    }

    private static void calcularAreaCircunferencia(Scanner entrada) {
        final float PI = 3.14159f;
        float radio, area;

        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = entrada.nextFloat();

        area = PI * radio * radio;
        lados figura = new lados(PI,radio , area);
        figura.areacircu();
    }

    private static void calcularAreaTriangulo(Scanner entrada) {
        float base, altura, area;

        System.out.print("Ingrese la longitud de la base del triángulo: ");
        base = entrada.nextFloat();

        System.out.print("Ingrese la altura del triángulo: ");
        altura = entrada.nextFloat();

        area = (base * altura) / 2;
        lados figura = new lados(base, altura, area);
        figura.areatrian();
    }
}
