/*
41 - 60
Las funciones de la biblioteca 
prestamo de libros
*/ 

import java.util.Scanner;
import java.util.*;
import javax.swing.*;

public class Biblioteca
{
    //vamos a crear un objeto para poder introducir los datos
    Scanner entrada = new Scanner(System.in);

    /*
    Vamos a realizar el 
    Variables
    Autor, Titutlo, ISBN, Genero, 
    Ejemplares, Costo del prestamo
    //metodos
    prestamo de libros
    Devolucion de libros
    */

    float total = 0;
    int ejemplaresCarrito = 0;
    Libro[] inventario = new Libro[5];
    Libro[] carrito = new Libro[15];

    public Biblioteca()
    {
    	this.inventario[0] = new Libro("Mas alla del bien y el mal", "F. Nietzche", "Filosofia", 20, 3);
    	this.inventario[1] = new Libro("Critica a la razon pura", "I. Kant", "Filosofia", 10, 3);
    	this.inventario[2] = new Libro("Principia mathematica", "I. Newton", "Ciencia", 50, 3);
    	this.inventario[3] = new Libro("Fenomenologia del espiritu", "F. Hegel", "Filosofia", 40, 3);
    	this.inventario[4] = new Libro("Tempestades de acero", "Ernst Junger", "Historia", 25, 3);
    }


    public void Libros()
    {
        //menu para el prestamo del libro

        //agregar el try catch para el manejo de errores
        //identificar si son variables publicas o privadas para el manejo de los datos
        String text;

        text = JOptionPane.showInputDialog("Elija la funcion que desea ejecutar: "
                                + "\n 1.- Prestamo del libro"
                                + "\n 2.- Devolucion del libro");

        int opcion;

        opcion = Integer.parseInt(text);

        switch (opcion) {
            case 1:

                this.prestamo();
                
                break;

            case 2:

                this.devolucion();

                break;
            default:

                JOptionPane.showInputDialog("Gracias por usar el programa de Prestamos de Libros");
                break;
        }
    }

    private void prestamo()
    {
    	String text, message;
    	int libro;
        /*
        Lo primero es que deberan de crear los objetos de Libros
        Donde cada uno de ustedes debera de tener 5 Libros diferentes
        Se debera de precargar la informacion del libro
        Primero se debe de crear la clase Libro
        Libro drama = new Libro("La cumbre escarlata", "No me lo se", "12345-BN", 5);
        Libro fantasmas = new Libro("Las cronicas Mutantes", "No me lo se", "00345-BN", 3);
        
        Segundo
        Tiene que aparecer la lista de todos los libros
        
        Tercero
        Ingrese el titulo que desea para su prestamo, y la cantidad de libros la debes de ir registrando
        porque se debe de preguntar, si desea agregar otro titlo
        Cuarto
        Se debe de visualizar los datos del libro que se presto y quedan x cantidad de existencias
        
        */ 

        message = "Libros disponibles\n";

        for (int i = 0; i < this.inventario.length; i++)
        	message += i + ") " + this.inventario[i].getNombre() + " existencias: " + this.inventario[i].getExistencias() + "\n";

        text = JOptionPane.showInputDialog(message + "\n\nSeleccione el libro que desea");
        libro = Integer.parseInt(text);

        if (libro > 5)
        	JOptionPane.showMessageDialog(null, "No se encuentra esa opcion en el inventario");

        else if (this.inventario[libro].getExistencias() > 0)
        {
        	message  = "";
        	this.carrito[this.ejemplaresCarrito] = this.inventario[libro];
        	this.inventario[libro].setExistencias(this.inventario[libro].getExistencias() - 1);
        	this.ejemplaresCarrito++;

        	message = "Libros disponibles\n";
        	for (int i = 0; i < this.carrito.length; i++)
        	{
        		if (this.carrito[i] != null)
        		{
        			message += i + ") " + this.carrito[i].getNombre() + "\n";
        			total += this.carrito[i].getCosto();
        		}
       		}

       		message = "\nTotal del prestamo: $" + total;

       		JOptionPane.showMessageDialog(null, message);
      	}

        else
        	System.out.println("No hay existencias de ese ejemplar");
    }

    private void devolucion()
    {
        /*
        Primero 
        Buscar en el sistema el libro que se presto
        Segundo 
        
        Cambiar el estado de ese prestamo -> Volver a sumar la cantidad del ejemplar
        Tercero
        Visualizar los datos del libro de nuevo
        */

        String text, message;
        int libro;

        message = "Catalogo\n";

        for (int i = 0; i < this.inventario.length; i++)
        	message += i + ") " + this.inventario[i].getNombre() + " existencias: " + this.inventario[i].getExistencias() + "\n";
    	
    	text = JOptionPane.showInputDialog(message + "\nSeleccione el libro que desea devolver");
        libro = Integer.parseInt(text);
        message = "";

        if (libro > 5)
        	JOptionPane.showMessageDialog(null, "No se encuentra esa opcion en el inventario");

        else
        	this.inventario[libro].setExistencias(this.inventario[libro].getExistencias() + 1);


        for (int i = 0; i < this.inventario.length; i++)
        	message += i + ") " + this.inventario[i].getNombre() + " existencias: " + this.inventario[i].getExistencias() + "\n";

        JOptionPane.showMessageDialog(null, message);
    }
}