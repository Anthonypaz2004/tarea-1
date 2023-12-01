package ultimo;

public class pinguino extends zoo {
    public pinguino (String nombre,int edad,int registro){
        super(nombre, edad, registro);
    }
    public void nadar(){
        System.out.println(this.nombre+"empezo a nadar");
    }
    public void pescar(){
        System.out.println(this.nombre+"empezo a pescar");
    }
}
