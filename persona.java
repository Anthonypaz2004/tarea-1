package ultimo;

public class persona {
    String nombre;
    int edad;
    private long cedula;

    public persona(String nombre,int edad,long cedula){
        this.nombre=nombre;
        this.edad=edad;
        this.cedula=cedula;
    }
    public long getcedula(){
        return cedula;
    }
    public void dormir(){
        System.out.println(this.nombre +" Empezo a saltar");
    }
    public void comer(){
        System.out.println(this.nombre +" Empezo a comer");
    }


}
