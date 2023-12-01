package ultimo;

public class zoo {
    String nombre;
    int edad;
    private int registro;

    public zoo(String nombre,int edad,int registro){
        this.nombre=nombre;
        this.edad=edad;
        this.registro=registro;
    }
    public int getregistro(){
        return registro;
    }
    public void dormir(){
        System.out.println(this.nombre +" Empezo a saltar");
    }
    public void comer(){
        System.out.println(this.nombre +" Empezo a comer");
    }
}
