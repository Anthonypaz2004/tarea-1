package Esfera;

public class medidas {
    private double altura;
    private double radio;

    public void setaltura(double altura){
        this.altura=altura;
    } 
    public void setradio(double radio){
        this.radio=radio;
    }

    public double getvolumen(){
        double volumen;
        double radiot;
        radiot=radio*radio;
        volumen=altura*radiot*3.1416;
        return volumen;
    }


    
}
