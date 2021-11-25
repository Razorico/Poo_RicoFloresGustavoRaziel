import java.util.Scanner;
import java.util.*;
import javax.swing.*;

public class Biblioteca {
    //vamos a crear un objeto para poder introducir los datos
    Scanner entrada = new Scanner(System.in);
    /*
    //variables 
    Autor, Titulo, ISBN, Genero,
    Ejemplares, Costo de prestamo
    //metodos
    prestamo de libros
    devolucion de libros
    */
    String titulo, autor, isbn, genero;
    int ejemplares;
    double costo_prestamo, total;

    public void Libros(){
        string text;

        text = JOptionPane.showInputDialog("Elija la funcion que desea ejecutar: "
                                +"\n 1.-Prestamo del libro"
                                +"\n 2.-Devolucion del libro")

            switch{
                case 1:

                Prestamo();
                break;
            }
    }
    public void Prestamo(){

    }

    public void Devolucio(){
        
    }

}