package ultimo;

public class pinguino extends zoo {
    public pinguino (String nombre,int edad){
        super(nombre, edad);
    }
    public void nadar(){
        System.out.println(this.nombre+"empezo a nadar");
    }
    public void pescar(){
        System.out.println(this.nombre+"empezo a pescar");
    }
}
