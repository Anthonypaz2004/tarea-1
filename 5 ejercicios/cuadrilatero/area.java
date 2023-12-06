package cuadrilatero;


public class area {
    public static void main(String[] args) {
        figura cuadrilatero1= new figura();

        cuadrilatero1.getlado((10.3), (20.3));
        
        System.out.println("el area es:"+cuadrilatero1.getarea());
        System.out.println("el perimetro es:"+cuadrilatero1.getperimetro());

    }

}
