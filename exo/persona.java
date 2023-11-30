package exo;

public class persona {
    String nombre;
    int edad;
    private int cedula;

    public persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public int getcedula(){
        cedula=1755864061;
        return cedula;
    }



}
