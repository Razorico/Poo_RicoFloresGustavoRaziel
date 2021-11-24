/*
para poder aplicar la herencia de una clase, se utiliza la palabra reservada
extends
Eso significa que la clase va a heredar de una clase padre
Animal es la clase padre
Perro es la clase hija
*/
public class Perro extends Animal{

    String ladrido;

    public Perro(){
        //constructor de la case
    }
    public Perro(String nombre, String raza, String tipo_alimento,
    int edad, boolean sexo, String ladrido){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(nombre, raza, tipo_alimento, edad, sexo);
        this.ladrido = ladrido;
        
    }
    //recibir
    public String getLadrido(){
        return ladrido;
    }

    //enviar
    public void setLadrido(){
        this.ladrido = ladrido;
    }
    //metodo para mostrar la informacion del perro
    public void mostrarPerro(){
        System.out.println("El nombre del perro es: " + getNombre() +"\n"
                            + "Su raza es: "+ getRaza() +"\n"
                            + "Se alimenta de: " + getTipo_alimento() +"\n"
                            + "Tiene la edad de: "+ getEdad() +"\n"
                            + "Su sexo es: "+ getSexo() +"\n"
                            + "Su ladrido es:"+ ladrido +"\n");
    }
}

