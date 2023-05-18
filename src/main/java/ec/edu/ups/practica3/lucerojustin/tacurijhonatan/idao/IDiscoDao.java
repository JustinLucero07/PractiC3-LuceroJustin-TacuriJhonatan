/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.idao;

import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Disco;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IDiscoDao {
    
    public void create(Disco disco);
    public Disco read(String nombre);
    public void update(Disco disco);
    public void delete(Disco disco);   
    public List<Disco> findAll();
}
