/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista;

import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Disco;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaDisco {
    
    private Scanner teclado;

    public VistaDisco() {
        teclado = new Scanner(System.in);
    }
    
    public List<Disco> ingresarDisco(){
        // Se crea una lista vacía de discos para el cantante.
            List<Disco> discografia = new ArrayList<>();
            // Se crea una instancia de la clase Cantante con los datos ingresados por el usuario.
            System.out.print("Ingrese el numero de discos que desea ingresar: : ");
            int n = teclado.nextInt();
            for (int j = 1; j <= n; j++) {
                System.out.println("Ingrese los datos del Disco #" + j + ":");
                // Se le solicita al usuario ingresar los datos del disco.
                            
                System.out.print("Codigo del Disco: ");
                int co = teclado.nextInt();
                            
                System.out.print("Nombre del Disco: ");
                String nombreDis = teclado.next();
                            
                System.out.print("Anio Lanzamiento: ");
                int anio = teclado.nextInt();
                
                Disco disco = new Disco(co, nombreDis, anio);
                discografia.add(disco);
            }
        return discografia;
    }
}
