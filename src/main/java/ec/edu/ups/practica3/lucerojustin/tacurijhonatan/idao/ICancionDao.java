/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.idao;

import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Cancion;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ICancionDao {
    
    public void create(Cancion cancion);
    public Cancion read(String nombre);
    public void update(Cancion cancion);
    public void delete(Cancion cancion);   
    public List<Cancion> findAll();
}
