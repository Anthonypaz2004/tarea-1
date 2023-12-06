package ultimo;

import java.util.InputMismatchException;
import java.util.Scanner;

import poo.Cuidador;
import poo.Visitante;

public class principal {
    static boolean validar=false;
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        String nombre="";
        int edad=0;
        do{
            System.out.println("------------Menu------------");
            System.out.println("1) Persona");
            System.out.println("2) Zoo");
            System.out.println("3) Finalizar programa");
            System.out.println("ingrese su opcion");
            op=entrada.nextInt();
            entrada.nextLine();
            switch (op) {
                case 1:
                    int opcion;
                    do {
                        System.out.println("----Ha escogido Persona----");
                        System.out.println("Escoja una de las opciones");
                        System.out.println("1) Visitante");
                        System.out.println("2) Cuidador");
                        System.out.println("3) Salir");
                        System.out.println("ingrese su opcion");
                        opcion=entrada.nextInt();
                        entrada.nextLine();
                        switch (opcion) {
                            case 1:
                                tnombre(entrada);
                                pedad(entrada);
                                entrada.nextLine();
                                pcedula(entrada);
                                vcarnet(entrada);
                                entrada.nextLine();
                                Visitante visitante=new Visitante(nombre, edad, nombre, nombre);
                                visitante.comer();
                                visitante.dormir();
                                visitante.comprar();
                                break;
                            case 2:
                                tnombre(entrada);
                                pedad(entrada);
                                pcedula(entrada);
                                cidentificacion(entrada);
                                Cuidador cuidador=new Cuidador(nombre, edad, nombre, nombre);
                                cuidador.comer();
                                cuidador.dormir();
                                cuidador.alimentarAnimales();

                                break;
                            case 3:
                                System.out.println("regreso al menu principal");
                                break;
                        
                            default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                                break;
                        }
                        
                    } while (opcion!=3);
                    break;
                case 2:
                int opcio;
                    do {
                        System.out.println("----Ha escogido Zoo----");
                        System.out.println("Escoja una de las opciones");
                        System.out.println("1) Leon");
                        System.out.println("2) Pinguino");
                        System.out.println("3) regresar al menu");
                        System.out.println("ingrese su opcion");
                        opcio=entrada.nextInt();
                        entrada.nextLine();
                        switch (opcio) {
                            case 1:
                                String vacuna="";
                                anombre(entrada);
                                aedad(entrada);
                                entrada.nextLine();
                                aregistro(entrada);
                                entrada.nextLine();
                                lvacuna(entrada);
                                leon leo=new leon(vacuna, nombre, edad);
                                leo.getregistro();
                                leo.comer();
                                leo.dormir();
                                leo.rugir();
                                leo.cazar();
                                break;
                            case 2:
                                anombre(entrada);
                                pedad(entrada);
                                entrada.nextLine();
                                aregistro(entrada);
                                entrada.nextLine();
                                pinguino pingui=new pinguino(nombre, edad);
                                pingui.comer();
                                pingui.dormir();
                                pingui.nadar();
                                pingui.pescar();
                                
                                break;
                            case 3:
                                System.out.println("regreso al menu principal");
                                break;
                        
                            default:
                                System.out.println("Opción no válida. Inténtelo de nuevo.");
                                break;
                        }
                        
                    } while (opcio!=3);
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        }while(op!=3);

        entrada.close();
    }

    private static void tnombre(Scanner entrada){
        
        String nombre;
        do{
            System.out.println("Porfavor ingrese su nombre:");
            nombre=entrada.nextLine();
            if (nombre.matches("[a-zA-Z]+")) {
            validar=true;
            } else {
            System.out.println("Error: Debes ingresar un nombre válido. Intenta de nuevo.");
             }
        }while(!validar);
    }
    private static void pedad(Scanner entrada){
        int edad;
        do{
            try {
                System.out.println("Porfavor ingrese su edad:");
                edad=entrada.nextInt();
                while ((edad<10)||(edad>100)) {
                    System.err.println("ingrese nuevamente a edad del 10 al 100:");
                    edad = entrada.nextInt(); 
                } 
                validar=true; 
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero. Intenta de nuevo.");
                entrada.nextLine();
                validar=false;
            }
        }while(!validar);
    }

    private static void pcedula(Scanner entrada){
        long cedula;
        do{
            try {
                System.out.println("Porfavor ingrese su cedula ");
                cedula=entrada.nextLong();
                while ((cedula<1000000000)||(cedula>1999999999)) {
                    System.err.println("ingrese nuevamente a edad del 10 al 100:");
                cedula = entrada.nextLong(); 
                } 
                validar=true; 
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero. Intenta de nuevo.");
                entrada.nextLine();
                validar=false;
            }
        }while(!validar);
    }

    private static void vcarnet(Scanner entrada){
        int carnet;
        do{
            try {
                System.out.println("Porfavor ingrese su Numero de carnet:");
                carnet=entrada.nextInt();
                while ((carnet<10)||(carnet>100)) {
                    System.err.println("ingrese nuevamente su numero de carnet del 1 al 100:");
                    carnet = entrada.nextInt(); 
                } 
                validar=true; 
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero. Intenta de nuevo.");
                entrada.nextLine();
                validar=false;
            }
        }while(!validar);
    }
    private static void cidentificacion(Scanner entrada){
        int N_ID;
        do{
            try {
                System.out.println("Porfavor ingrese su Numero de Identificacion:");
                N_ID=entrada.nextInt();
                while ((N_ID<10)||(N_ID>100)) {
                    System.err.println("ingrese nuevamente su numero de identificacion del 1 al 100:");
                    N_ID = entrada.nextInt(); 
                } 
                validar=true; 
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero. Intenta de nuevo.");
                entrada.nextLine();
                validar=false;
            }
        }while(!validar);
    }
    private static void anombre(Scanner entrada){
        
        String nombre;
        do{
            System.out.println("Porfavor ingrese el nombre del animal:");
            nombre=entrada.nextLine();
            if (nombre.matches("[a-zA-Z]+")) {
            validar=true;
            } else {
            System.out.println("Error: Debes ingresar un nombre válido. Intenta de nuevo.");
             }
        }while(!validar);
    }
    private static void aedad(Scanner entrada){
        int edad;
        do{
            try {
                System.out.println("Porfavor ingrese la edad del animal:");
                edad=entrada.nextInt();
                while ((edad<10)||(edad>100)) {
                    System.err.println("ingrese nuevamente a edad del 1 al 18:");
                    edad = entrada.nextInt(); 
                } 
                validar=true; 
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero. Intenta de nuevo.");
                entrada.nextLine();
                validar=false;
            }
        }while(!validar);
    }
    private static void aregistro(Scanner entrada){
        int registro;
        do{
            try {
                System.out.println("Porfavor ingrese su Numero de registro:");
                registro=entrada.nextInt();
                while ((registro<1)||(registro>100))
                {
                    System.err.println("ingrese nuevamente su numero de identificacion del 1 al 100:");
                    registro = entrada.nextInt(); 
                } 
                validar=true; 
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero. Intenta de nuevo.");
                entrada.nextLine();
                validar=false;
            }
        }while(!validar);
    }

    private static void lvacuna(Scanner entrada){
        
        String vacuna;
        do{
            System.out.println("Porfavor ingrese el nombre de la vacuna:");
            vacuna=entrada.nextLine();
            if (vacuna.matches("[a-zA-Z]+")) {
            validar=true;
            } else {
            System.out.println("Error: Debes ingresar un nombre válido. Intenta de nuevo.");
             }
        }while(!validar);
    }

}


