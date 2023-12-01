package ultimo;

public class cuidador extends persona {
    int N_ID;
    public cuidador (int N_ID,String nombre,int edad,long cedula){
        super(nombre, edad, cedula);
        this.N_ID=N_ID;
    }
    public void cuidar_animales(){
        System.out.println(this.nombre+"empezo a cuidar animales");
    }
    
}
