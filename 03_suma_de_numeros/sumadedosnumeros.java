/*

para poder hacer el programa de suma de dos numeros 

debemos entender el algoritmo de la suma 

declarar variables

num1 num2 resultado

1.- solo una vez se sume
2.- voy a querer que se sumen los numeros  y que se repita

*/

// es necesasrio ocupar librerias dentro de java para unos procesos
// vamos a ocupar la libreria Scanner que nos sirve para obtener la entradada de datos

import java.util.Scanner;

class sumadedosnumeros{

    // el identado del codigo 
    //metodo principal
    public static void main(String[] args){
     
        //definir un objeto de la libreria Scanner que nos sirva para obtener los datos
        Scanner entrada = new Scanner(System.in);
        /*
        para realizar una instancia del objeto que se debe de colocar:
        nombreclase nombreobjeto = new nombreclase();

        System.in es una clased superior donde nosotros podemos obtener los 
        datos que vienen por parte de la entrada estandar de la cmputadora

        */

        //definicion de variable
        int num1, num2;
        int resultado=0;

      do{
        System.out.println("Introduce los numeros que quieras sumar; si pones 0 se detiene la suma:");
        //asignar el primer numero a su variable
        num1 = entrada.nextInt();
        //System.out.println("Introduce el segundo numero a sumar:");
        //asignar el segundo numero a su variable
        //num2 = entrada.nextInt();

        resultado = resultado + num1;


      }while(num1 !=0);
      System.out.println("El resultado de la suma es: " + resultado);
    }
}