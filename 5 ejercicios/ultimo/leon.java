package ultimo;

public class leon extends zoo {
    String vacuna;

    public leon(String vacuna,String nombre,int edad){
        super(nombre, edad);
        this.vacuna=vacuna;
    }
    
    public void rugir(){
        System.out.println(this.nombre+"empezo a rugir");
    }
    public void cazar(){
        System.out.println(this.nombre+"empezo a cazar");
    }
    
}
