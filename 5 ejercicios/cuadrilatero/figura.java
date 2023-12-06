package cuadrilatero;

public class figura {
    private double lado1,lado2;

    public void getlado(double lado1,double lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public double getarea(){
        double area;
        area=lado1*lado2 ;
        return area;
    }

    public double getperimetro(){
        double perimetro;
        perimetro= 2*(lado1+lado2);
        return perimetro;
    }
    


    
}
