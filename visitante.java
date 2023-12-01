package ultimo;

public class visitante extends persona {
    private int carnet;

    public visitante(String nombre,int edad,long cedula,int carnet){
        super(nombre, edad, cedula);
        this.carnet=carnet;

    }
    public void comprar(){
        System.out.println(this.nombre+" empezo a comprar");
    }
    public int getcarnet(){
        return carnet;
    }

    
}
