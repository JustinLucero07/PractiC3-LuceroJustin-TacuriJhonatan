/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.dao;

import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Disco;
import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.idao.IDiscoDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class DiscoDao implements IDiscoDao {
    
    private List<Disco> listaDisco;

    public DiscoDao() {
        listaDisco = new ArrayList<>();
    }
    
    @Override
    public void create(Disco disco) {
        listaDisco.add(disco);
        
    }

    @Override
    public Disco read(String nombre) {
        for (Disco disco : listaDisco) {
            if (disco.getNombre() == nombre) {
                return disco;
            }else {
                System.out.println("Disco No existe");
                
            }
        }
        return null;
    }

    @Override
    public void update(Disco disco) {
        for (int i = 0; i < listaDisco.size(); i++) {
            Disco c = listaDisco.get(i);
            if (c.getNombre()== disco.getNombre()) {
                listaDisco.set(i, disco);
                break;
            }
        }
    }

    @Override
    public void delete(Disco disco) {
        Iterator<Disco> it = listaDisco.iterator();
        while (it.hasNext()) {
            Disco d = it.next();
            if (d.getNombre()== disco.getNombre()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Disco> findAll() {
        return listaDisco;
    }
    
}
