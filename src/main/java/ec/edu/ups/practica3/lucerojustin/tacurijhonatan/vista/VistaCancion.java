/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista;

import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Cancion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaCancion {
    
    private Scanner teclado;

    public VistaCancion() {
        teclado = new Scanner(System.in);
    }
    
    public List<Cancion> ingresarCancion(){
        System.out.print("Ingrese el numero de canciones TOP 100 Billboard: ");
                        int cancionesTop = teclado.nextInt();
                        
                        List<Cancion> canciones = new ArrayList<>(); //Se crea una lista vacia de canciones.
                        //List<Cantante> cliente = new ArrayList<>(); //Se crea una lista vacia de clientes.
                        
                        // Se crea una instancia de la clase Compositor con los datos ingresados por el usuario.
                        //Compositor comp1 = new Compositor(numeroComposiciones, canciones, cliente, codigo2, nombre2, apellido2, edad2, nacionalidad2, salario2);
                        
                        for (int j = 1; j <= cancionesTop; j++){
                            //Se pide al usuario el ingreso de la datos de una cancion
                            
                            System.out.print("Codigo de la Cancion: ");
                            int codigo3 = teclado.nextInt();
                            
                            System.out.print("Titulo de la cancion: ");
                            String titulo = teclado.next();
                            
                            System.out.print("Letra de la cancion: ");
                            String letra = teclado.next();
                            
                            System.out.print("Duracion de la cancion: ");
                            double tiempo = teclado.nextDouble();
                           
                            Cancion cancion = new Cancion(codigo3, titulo, letra, tiempo);
                            canciones.add(cancion);
                        }
                        return canciones;
    }
    
    
    
}
