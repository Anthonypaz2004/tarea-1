package ultimo;

public class visitante extends persona {
    private int carnet;

    public visitante(int edad,int carnet,String nombre){
        super(nombre, edad);
        this.carnet=carnet;

    }
    public void comprar(){
        System.out.println(this.nombre+" empezo a comprar");
    }
    public int getcarnet(){
        return carnet;
    }

    
}
