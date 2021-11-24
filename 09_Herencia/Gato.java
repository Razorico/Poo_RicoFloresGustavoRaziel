/*
para poder aplicar la herencia de una clase, se utiliza la palabra reservada
extends
Eso significa que la clase va a heredar de una clase padre
Animal es la clase padre
Perro es la clase hija
*/
public class Gato extends Animal{

    int num_vidas;

    public Gato(){
        //constructor de la case
    }
    public Gato(String nombre, String raza, String tipo_alimento,
    int edad, boolean sexo, int num_vidas){
        //para poder obtener los atributos por herencia
        //se debe de colocar super
        super(nombre, raza, tipo_alimento, edad, sexo);
        this.num_vidas = num_vidas;
        
    }
    //recibir
    public int getNum_vidas(){
        return num_vidas;
    }

    //enviar
    public void setNum_vidas(){
        this.num_vidas = num_vidas;
    }
    //metodo para mostrar la informacion del perro
    public void mostrarGato(){
        System.out.println("El nombre del michi es: " + getNombre() +"\n"
                            + "Su raza es: "+ getRaza() +"\n"
                            + "Se alimenta de: " + getTipo_alimento() +"\n"
                            + "Tiene la edad de: "+ getEdad() +"\n"
                            + "Su sexo es: "+ getSexo() +"\n"
                            + "Su numero de vidas es:"+ num_vidas +"\n");
    }
}

