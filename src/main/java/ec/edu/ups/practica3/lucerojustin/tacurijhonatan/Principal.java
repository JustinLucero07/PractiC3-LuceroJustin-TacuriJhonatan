/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.practica3.lucerojustin.tacurijhonatan;

import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.controlador.ControladorCantante;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.controlador.ControladorCompositor;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.dao.CancionDao;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.dao.CantanteDao;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.dao.CompositorDao;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.dao.DiscoDao;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista.VistaCancion;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista.VistaCantante;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista.VistaCompositor;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista.VistaDisco;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        VistaCantante cantante = new VistaCantante();
        VistaDisco disco = new VistaDisco();
        CantanteDao cant = new CantanteDao();
        DiscoDao dis = new DiscoDao();
        ControladorCantante controladorcan = new ControladorCantante(cantante, disco, cant, dis);
        
        VistaCompositor compositor = new VistaCompositor();
        VistaCancion cancion = new VistaCancion();
        CompositorDao comp = new CompositorDao();
        CancionDao can = new CancionDao();
        ControladorCompositor controladorcomp = new ControladorCompositor(compositor, comp, cancion, can, cant);
        
        int opcion = 0 ;
        do{
            
            
            System.out.println("\t******MENU****** \n1.Ingresar Cantante \n2.Ingresar compositor\n3.Eliminar\n4.Buscar\n5.Actualizar\n6.Imprimir\n7.Busqueda de Cantante por Nombre de Disco. \n8.Busqueda de compositor por nombre de Cancion.\n9.Agregar Cliente. \n10.Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("**********CANTANTE **********");
                    System.out.println("Ingrese el numero de cantantes que desea ingresar: ");
                    int n = teclado.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.println("Ingrese los datos del cantante #"+ i + ":");
                        controladorcan.registrar();
                    }
                    break;
                case 2 :
                    System.out.println("**********COMPOSITOR***********");
                    System.out.println("Ingrese el numero de compositores que dea ingresar: ");
                    int n1 = teclado.nextInt();
                    for (int i = 1; i <= n1; i++) {
                        System.out.println("Ingrese los datos del compositor#"+ i + ":");
                        controladorcomp.ingresarComposi();
                    }
                    break;
                case 3 :
                    System.out.println("----Que desea eliminar cantante o compositor: ");
                    System.out.println("\n-Ingrese 1 si desea eliminar cantante \n-Ingrese 2 si desea eliminar compsitor \n-Ingrese 3 si desea eliminar disco \n-Ingrese 4 si desea eliminar cancion: ");
                    int ingrese = teclado.nextInt();
                    while (ingrese != 1 && ingrese != 4) {
                        System.out.println("Opción inválida. Inténtelo nuevamente:");
                        ingrese = teclado.nextInt();
                        break;
                    }

                    System.out.println("Opción válida ingresada: " + ingrese);

                    if (ingrese == 1) {
                        controladorcan.eliminar();
                    
                    } else if (ingrese == 2) {
                        controladorcomp.elimininarCompo();
                    } else if (ingrese == 3){
                        controladorcan.eliminarDisco();
                    } else if (ingrese == 4){
                        controladorcomp.eliminarCancion();
                    }
                    break;
                case 4 :
                    System.out.println("----Que desea eliminar cantante o compositor: ");
                    System.out.println("\n-Ingrese 1 si desea buscar cantante \n-Ingrese 2 si desea buscar compsitor :");
                    int ingrese1 = teclado.nextInt();
                    while (ingrese1 != 1 && ingrese1 != 2) {
                        System.out.println("Opción inválida. Inténtelo nuevamente:");
                        ingrese1 = teclado.nextInt();
                        break;
                    }

                    System.out.println("Opción válida ingresada: " + ingrese1);

                    if (ingrese1 == 1) {
                        controladorcan.buscarCantante();
                    
                    } else if (ingrese1 == 2) {
                        controladorcomp.verCompositor();
                    } 
                    break;
                case 5 :
                    System.out.println("----Que desea actualizar cantante o compositor: ");
                    System.out.println("\n-Ingrese 1 si desea actualizar cantante \n-Ingrese 2 si desea actualizar compsitor \n-Ingrese 3 si desea actualizar disco \n-Ingrese 4 si desea actualizar cancion:: ");
                    int ingrese2 = teclado.nextInt();
                    while (ingrese2 != 1 && ingrese2 != 4) {
                        System.out.println("Opción inválida. Inténtelo nuevamente:");
                        ingrese2 = teclado.nextInt();
                        break;
                    }

                    System.out.println("Opción válida ingresada: " + ingrese2);

                    if (ingrese2 == 1) {
                    } else if (ingrese2 == 2) {
                        controladorcomp.actualizarCompositor();
                    } else if (ingrese2 == 3){
                        controladorcan.actualizarDisco();
                    } else if (ingrese2 == 4)
                        controladorcomp.actualizarCancion();
                    break;
                case 6 :
                    System.out.println("*******LISTA CANTANTES***********");
                    controladorcan.verCantantes();
                    System.out.println("*******LISTA COMPOSITORES**********");
                    controladorcomp.verCompositores();
                    break;
                case 7 :
                    controladorcan.buscarporDisco();
                    break;
                case 8 :
                    controladorcomp.buscarPorCancion();
                    break;
                case 9 :
                    controladorcomp.agregarClienteCan();
                    break;
        }
            
        }while(opcion!=10);
        
    }
}
