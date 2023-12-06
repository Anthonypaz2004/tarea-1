package ultimo;

public  abstract class persona {
    String nombre;
    int edad;
    private long cedula;

    public persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }


    public void setcedula(long cedula){
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
