/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista;

import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Cantante;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Disco;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaCantante {
    
    private Scanner teclado;

    public VistaCantante() {
        teclado = new Scanner(System.in);
    }
    
    public Cantante ingresarCantante() {
        teclado = new Scanner(System.in);
        System.out.print("Codigo: ");
        int codigo = teclado.nextInt();
        System.out.print("Nombre: ");
        String nombre = teclado.next();
        System.out.print("Apellido: ");
        String apellido = teclado.next();
        System.out.print("Edad: ");
        int edad = teclado.nextInt();
        System.out.print("Nacionalidad: ");
        String nacionalidad = teclado.next();
        System.out.print("Salario: ");
        double salario = teclado.nextDouble();
        System.out.print("Nombre Artistico: ");
        String nArtistico = teclado.next();
        System.out.print("Genero Musical: ");
        String generoMusical = teclado.next();
        System.out.print("Número de sencillos: ");
        int numeroSencillos = teclado.nextInt();
        System.out.print("Numero de Conciertos: ");
        int numeroConciertos = teclado.nextInt();
        System.out.print("Número de giras: ");
        int numeroGiras = teclado.nextInt();  
       
            VistaDisco d = new VistaDisco();
            List<Disco> dis = d.ingresarDisco();
        return new Cantante(nArtistico, generoMusical, numeroSencillos, numeroConciertos, numeroGiras,dis , codigo, nombre, apellido, edad, nacionalidad, salario);
    }
    
    public Cantante actualizarCantante() {
        
        System.out.println("Ingresa el codigo del cantante a actualizar");
        int cod = teclado.nextInt();
        
        System.out.print("Codigo nuevo: ");
        int codigon = teclado.nextInt();
        System.out.print("Nombre nuevo: ");
        String nombren = teclado.next();
        System.out.print("Apellido nuevo: ");
        String apellidon = teclado.next();
        System.out.print("Edad nuevo: ");
        int edadn = teclado.nextInt();
        System.out.print("Nacionalidad nuevo: ");
        String nacionalidadn = teclado.next();
        System.out.print("Salario nuevo: ");
        double salarion = teclado.nextDouble();
        System.out.print("Nombre Artistico nuevo: ");
        String nArtisticon = teclado.next();
        System.out.print("Genero Musical nuevo: ");
        String generoMusicaln = teclado.next();
        System.out.print("Número de sencillos nuevo: ");
        int numeroSencillosn = teclado.nextInt();
        System.out.print("Numero de Conciertos nuevo: ");
        int numeroConciertosn = teclado.nextInt();
        System.out.print("Número de giras nuevo: ");
        int numeroGirasn = teclado.nextInt(); 
        return new Cantante(nArtisticon, generoMusicaln, numeroSencillosn, numeroConciertosn, numeroGirasn, null, codigon, nombren, apellidon, edadn, nacionalidadn, salarion);
    }

    public String eliminarCantante() {
        System.out.println("Ingresa el nombre del cantante a eliminar");
        String nom = teclado.next();
        return nom;
    }

    
    public String buscarCantante() {
        System.out.println("Ingresa el nombre del cantante a buscar");
        String nombre = teclado.next();
        return nombre;
    }

    
    public void verCantante(Cantante cantante) {
        System.out.println("Datos del Cantante: " + cantante);
    }

    public void verCantantes(List<Cantante> cantantes) {
        for (Cantante cant : cantantes) {
            System.out.println("Datos de los cantantes: " + cant);
        }
    }
    
    public String buscarPorDisco(){
        System.out.println("Ingrese el nombre del disco: ");
        String nomdis = teclado.next();
        return nomdis;
    }
    
    public int eliminarDisco(){
        System.out.println("Ingrese el codigo del disco a eliminar: ");
        int codis = teclado.nextInt();
        return codis;
    }
    
    public Disco actualizarDisco(){
        System.out.println("Ingrese el codigo del disco a actuzaliar: ");
        int ac = teclado.nextInt();
        System.out.println("Nombre nuevo: ");
        String nomnu = teclado.next();
        System.out.println("Anio nuevo: ");
        int anion = teclado.nextInt();
        return new Disco(ac, nomnu, anion);
    }
}
