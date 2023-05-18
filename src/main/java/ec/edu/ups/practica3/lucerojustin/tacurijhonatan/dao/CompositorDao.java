/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.dao;

import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Cancion;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Compositor;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.idao.ICompositorDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CompositorDao implements ICompositorDao{
    
    private List<Compositor> listaCompositor;

    public CompositorDao() {
        listaCompositor = new ArrayList<>();
    }
    
    

    @Override
    public void create(Compositor compositor) {
        listaCompositor.add(compositor);
    }

    @Override
    public Compositor read(String nombre) {
        for (Compositor compositor : listaCompositor) {
            if (compositor.getNombre().equals(nombre)) {
                return compositor;
            }
        }
        return null;
    }

    @Override
    public void update(Compositor compositor) {
        for (int i = 0; i < listaCompositor.size(); i++) {
            Compositor c = listaCompositor.get(i);
            if (c.getCodigo() == compositor.getCodigo()) {
                listaCompositor.set(i, compositor);
                break;
            }
        }
    }

    @Override
    public void delete(Compositor compostior) {
        Iterator<Compositor> it = listaCompositor.iterator();
        while (it.hasNext()) {
            Compositor e = it.next();
            if (e.getNombre()== compostior.getNombre()) {
                it.remove();
                break;
            }
        }
    }
    
    @Override
    public Compositor buscarPorTituloDeCancion(String valor) {
        for (Compositor compositor : listaCompositor) { // iteramos sobre cada persona en la lista
            if (compositor instanceof Compositor) { // si la persona es un compositor
                for (Cancion cancion : compositor.getCancionesTop100Billboard()) { // iteramos sobre las canciones del compositor
                    if (cancion.getTitulo().equals(valor)) { // si encontramos una canción con el título buscado
                        System.out.println("Compositor: " + compositor.getNombre() + " " + compositor.getApellido());
                        System.out.println("Canción: " + cancion.getTitulo());
                        return compositor; // solo se imprime la primera coincidencia, por lo que terminamos el método con un return
                    }
                }
            }
        }
        System.out.println("No se encontró ninguna canción con el título '" + valor + "'"); // si no se encontró ninguna canción con el título buscado, se imprime este mensaje
        return null;
    }
    
    @Override
    public List<Compositor> findAll() {
        return listaCompositor;
    }
    
}
