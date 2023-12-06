package expo;
public class sumas {
        public int sumar(int a, int b) {
            return a + b;
        }
    
        public double sumar(double a, double b) {
            return a + b;
        }
    
        public static void main(String[] args) {
            sumas suma = new sumas();
            System.out.println(suma.sumar(5, 10));        // Invoca al primer método
            System.out.println(suma.sumar(5.5, 10.5));    // Invoca al segundo método
        }
    
}
