public class Animal{

    private String nombre, raza, tipo_alimento;
    private int edad;
    private boolean sexo;
    
    public Animal(){
        // esto es un constructor
        /* 
        podemos inicializar las variables
        podemos aplicar la sobrecarga
        */
    }

    public Animal(String nombre, String raza, String tipo_alimento, int edad, boolean sexo){
        //podemos realizar operaciones con cada uno de los parametros
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
        this.sexo = sexo;
    } 
    /*
    cuando los atributos son de tipom private:
    debemos de acceder a los datos a traves del uso de los metodos 
    get obtener -> recibir
    set asignat -> enviar
    */
    //recibir
    public String getNombre(){
        return nombre;
    }

    //enviar
    public void setNombre(){
        this.nombre = nombre;
    }
    //recibir 
    public String getRaza(){
        return raza;
    }

    //enviar
    public void setRaza(){
        this.raza = raza;
    }
    //recibir 
    public String getTipo_alimento(){
        return tipo_alimento;
    }

    //enviar
    public void setTipo_alimento(){
        this.tipo_alimento = tipo_alimento;
    }
    //recibir 
    public int getEdad(){
        return edad;
    }

    //enviar
    public void setEdad(){
        this.edad = edad;
    }
    //recibir 
    public boolean getSexo(){
        return boolean;
    }

    //enviar
    public boolean setSexo(){
        this.sexo = sexo;
    }

}