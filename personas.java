public class personas{
    String nombre;//atributo
    int edad;//atributo

    // constructor
    public personas(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    //metodo
    public void saltar(){
        System.out.println(this.nombre +" Empezo a saltar");
    }
    public void comer(){
        System.out.println(this.nombre +" Empezo a comer");
    }
    public void escribir(){
        System.out.println(this.nombre +"Empezo a escribir");
    }
    //cuerpo principal
    public static void main(String[] args) {
        personas p1 =new personas("Anthony",19);//instancia=dar vida
        p1.comer();
        p1.saltar();
    }

    }





