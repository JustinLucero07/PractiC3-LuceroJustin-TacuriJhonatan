/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.dao;

import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Cancion;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.idao.ICancionDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CancionDao implements ICancionDao {
    
    private List<Cancion> listaCanciones;

    public CancionDao() {
        listaCanciones = new ArrayList<>();
    }
    

    @Override
    public void create(Cancion cancion) {
        listaCanciones.add(cancion);
    }

    @Override
    public Cancion read(String nombre) {
        for (Cancion cancion : listaCanciones) {
            if (cancion.getTitulo()==nombre) {
                return cancion;
            }
        }
        return null;
    }

    @Override
    public void update(Cancion cancion) {
        for (int i = 0; i < listaCanciones.size(); i++) {
            Cancion c = listaCanciones.get(i);
            if (c.getTitulo()== cancion.getTitulo()) {
                listaCanciones.set(i, cancion);
                break;
            }
        }
    }

    @Override
    public void delete(Cancion cancion) {
        Iterator<Cancion> it = listaCanciones.iterator();
        while (it.hasNext()) {
            Cancion d = it.next();
            if (d.getTitulo()== cancion.getTitulo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cancion> findAll() {
        return listaCanciones;
    } 
}
