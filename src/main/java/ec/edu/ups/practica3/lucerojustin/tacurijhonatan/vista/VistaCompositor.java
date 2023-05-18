/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista;

import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Cancion;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Cantante;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Compositor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaCompositor {
    
    private Scanner teclado;

    public VistaCompositor() {
        teclado = new Scanner(System.in);
    }
    
    public Compositor ingresarCompositor(){
                   
                        System.out.print("Codigo: ");
                        int codigo2 = teclado.nextInt();
            
                        System.out.print("Nombre: ");
                        String nombre2 = teclado.next();
                    
                        System.out.print("Apellido: ");
                        String apellido2 = teclado.next();
                    
                        System.out.print("Edad: ");
                        int edad2 = teclado.nextInt();
                    
                        System.out.print("Nacionalidad: ");
                        String nacionalidad2 = teclado.next();
            
                        System.out.print("Salario: ");
                        double salario2 = teclado.nextDouble();
                    
                        System.out.print("Numero de Composiciones: ");
                        int numeroComposiciones = teclado.nextInt();
                        VistaCancion can = new VistaCancion();
                        List<Cancion> canc = can.ingresarCancion();
                        List<Cantante> cliente = new ArrayList<>();
                        
       return new Compositor(numeroComposiciones, canc, cliente, codigo2, nombre2, apellido2, edad2, nacionalidad2, salario2);
    }
    
    public String buscarCompositor(){
        System.out.println("Ingrese el nombre del compositor a buscar");
        String nombre = teclado.next();
        return nombre ;
    }
    
    public void verComposit(Compositor composi){
        System.out.println(composi);
    }
    public void verCompositores(List<Compositor> compositores){
        System.out.println("Datos de los Cantantes ; \n");
        for (Compositor comp : compositores) {
            System.out.println(comp);
            
        }
    }
    public Compositor actualizarCompositor(){
        System.out.println("Ingresa el codigo del compositor a actualizar");
        int codigo = teclado.nextInt();
        System.out.println("Ingrese los nuevos Datos: ");
        System.out.println("Nombre nuevo: ");
        String nombren = teclado.next();
        System.out.println("Apellido nuevo:");
        String apellidon = teclado.next();
        System.out.print("Edad nueva: ");
        int edad2n = teclado.nextInt();
        System.out.print("Nacionalidad nueva: ");
        String nacionalidad2n = teclado.next();
        System.out.print("Salario nuevo: ");
        double salario2n = teclado.nextDouble();   
        System.out.print("Numero de Composiciones nuevos: ");
        int numeroComposicionesn = teclado.nextInt();
        return new Compositor(numeroComposicionesn, null, null, codigo, nombren, apellidon, edad2n, nacionalidad2n, salario2n);
    }
    public String eliminarCompositor(){
        System.out.println("Ingresa el nombre del compositor a elimintar : ");
        String nom = teclado.next();
        return nom;
    }
    
    public String buscarporcancion(){
        System.out.println("Ingrese el nombre de la cancion que tiene el compositor: ");
        String nomcan = teclado.next();
        return nomcan;
    }
    
    public String agregarCliente1(){
        System.out.println("Ingrese el compositor al que le quiere agregar un cliente: ");
        String nomcli = teclado.next();
        return nomcli;
    }
    
    public String agregarCliente2(){
        System.out.println("Ingrese el nombre artistico del cantante: ");
        String ncan = teclado.next();
        return ncan;
    }
    
    public Cancion actualizarCancion(){
        System.out.println("Ingrese el codigo de la cancion a actualizar: ");
        int ac = teclado.nextInt();
        System.out.println("Titulo nuevo: ");
        String tn = teclado.next();
        System.out.println("Letra nueva: ");
        String letran = teclado.next();
        System.out.println("Tiempo nuevo: ");
        double tiempon = teclado.nextDouble();
        return new Cancion(ac, tn, letran, tiempon);
    }
    
    public int eliminarCancion(){
        System.out.println("Ingrese el codigo de la cancion a eliminar: ");
        int codigoc = teclado.nextInt();
        return codigoc;
    }
}

