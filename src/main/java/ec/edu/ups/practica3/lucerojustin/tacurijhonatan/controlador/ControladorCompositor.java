/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.controlador;

import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Cancion;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista.VistaCancion;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.vista.VistaCompositor;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Cantante;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Compositor;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.dao.CantanteDao;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.idao.ICancionDao;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.idao.ICompositorDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author venot
 */
public class ControladorCompositor {
    private VistaCompositor vistaCompositor;
    private ICompositorDao compositorDao;
    private VistaCancion vistaCancion;
    private ICancionDao cancioDao;
    private Compositor compositor;
    private Cantante cantante;
    private CantanteDao cantantedao;

    public ControladorCompositor(VistaCompositor vistaCompositor, ICompositorDao compositorDao, VistaCancion vistaCancion, ICancionDao cancioDao, CantanteDao cantantedao) {
        this.vistaCompositor = vistaCompositor;
        this.compositorDao = compositorDao;
        this.vistaCancion = vistaCancion;
        this.cancioDao = cancioDao;
        this.cantantedao = cantantedao;
    }

    
    
    public void ingresarComposi(){
        Compositor com = vistaCompositor.ingresarCompositor();
        compositorDao.create(com);
    }
    public void verCompositor(){
        String nombre = vistaCompositor.buscarCompositor();
        compositor = compositorDao.read(nombre);
        vistaCompositor.verComposit(compositor);
        
    }
    public void verCompositores(){
        List<Compositor> compositores;
        compositores = compositorDao.findAll();
        vistaCompositor.verCompositores(compositores);
    }
    
    public void actualizarCompositor(){
        Compositor compositor = (Compositor) vistaCompositor.actualizarCompositor();
        compositorDao.update(compositor);
    }
    public void elimininarCompo(){
        String nombre = vistaCompositor.eliminarCompositor();
        compositorDao.delete(compositorDao.read(nombre));
        
    }
    
    public void buscarPorCancion(){
        String nombre = vistaCompositor.buscarporcancion();
        compositorDao.buscarPorTituloDeCancion(nombre);
    }
    
    public void agregarClienteCan(){
        String nombre = vistaCompositor.agregarCliente1();
        compositor = compositorDao.read(nombre);
        if(compositor == null){
            System.out.println("El compositor no existe: ");
        }else if(compositor != null){
            String ncan = vistaCompositor.agregarCliente2();
            cantante = cantantedao.read(ncan);
            if(cantante == null){
                System.out.println("El cantante no existe");
            }else if(cantante != null){
                System.out.println("El cantante se agrego exitosamente");
                compositor.agregarClientE(cantante);
            }
        }
    }
    
    public void actualizarCancion(){
        String nombre = vistaCompositor.buscarCompositor();
        Compositor compositor = compositorDao.read(nombre);
        
        if (compositor != null) {
            Cancion cann = vistaCompositor.actualizarCancion();
            compositor.actualizarCancion(cann);
            compositorDao.update(compositor);
            System.out.println("Cancion actualizada correctamente.");
        } else {
            System.out.println("No se encontró el compositor en la base de datos.");
        }
    }
    
    public void eliminarCancion(){
        String nombreCompositor = vistaCompositor.buscarCompositor();
        Compositor compositor = compositorDao.read(nombreCompositor);

        if (compositor != null) {
            int codigoCan = vistaCompositor.eliminarCancion();
            compositor.eliminarCancion(codigoCan);
            compositorDao.update(compositor);
            System.out.println("Cancion eliminada correctamente.");
        } else {
            System.out.println("No se encontró el compositor en la base de datos.");
        }
    }
}
