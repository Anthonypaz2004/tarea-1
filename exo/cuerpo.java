package exo;
import java.util.Scanner;

public class cuerpo {

    public static void main(String[] args) {
        String nombre, nombrea;
        int edad, edada;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre= entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        while((edad<10)||(edad>99)){
            System.out.println("la edad no es valida");
            System.out.print("Ingrese su edad nuevamente: ");
            edad = entrada.nextInt();
        }
        entrada.nextLine();
        persona p1=new persona(nombre, edad);
        System.out.println(nombre+" empezo a comer");
        System.out.println("Tiene una edad de:"+edad);
        System.out.println("su numero de ceula es:"+p1.getcedula());

        System.out.println("---------Animal-----------");
        System.out.print("Ingrese su nombre: ");
        nombrea= entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        edada = entrada.nextInt();
        while((edada<1)||(edada>18)){
            System.out.println("la edad no es valida");
            System.out.print("Ingrese la edad del animal en un rango de (0-18) nuevamente: ");
            edada = entrada.nextInt();
        }
        entrada.nextLine();
        zoo a1=new zoo(nombrea, edada);
        System.out.println(nombrea+" empezo a comer");
        System.out.println("Tiene una edad de:"+edada);
        System.out.println("su numero de registro es:"+a1.getregistro());

    }
}

