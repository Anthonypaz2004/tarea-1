package expo;
public class Animales {
    public void sonido() {
        System.out.println("Ruido");
    }

    public static class Dog extends Animales {
        public void sonido() {
            System.out.println("Ladrando");
        }
    }

    public static class Cat extends Animales {
        public void sonido() {
            System.out.println("Maullando");
        }
    }

    public static void main(String[] args) {
      
       Animales mascota = new Dog(); // Polimorfismo: mascota ahora es un perro
        mascota.sonido();
        mascota = new Cat(); // Polimorfismo: mascota ahora es un gato
        mascota.sonido();
    }
}

