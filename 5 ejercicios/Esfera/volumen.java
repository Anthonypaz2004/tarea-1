package Esfera;
import java.util.Scanner;
public class volumen {
    public static void main(String[] args) {
        double altura;
        double radio;
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("ingrese la altura de la esfera:");
        altura=entrada.nextDouble();
        entrada.nextLine();
        System.out.println("ingrese le radio de la esfera:");
        radio=entrada.nextDouble();
        entrada.nextLine();
        medidas esfera=new medidas();
        esfera.setaltura(altura);
        esfera.setradio(radio);
        System.out.println("el volumen es igual: "+esfera.getvolumen()+" unidades cubicas");
        entrada.close();






        

    }
    
}
