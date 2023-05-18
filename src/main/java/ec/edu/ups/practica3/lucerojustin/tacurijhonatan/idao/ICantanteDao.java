/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.lucerojustin.tacurijhonatan.idao;

import ec.edu.ups.practica3.lucerojustin.tacurijhonatan.clases.Cantante;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ICantanteDao {
    
    public void create(Cantante cantante);
    public Cantante read(String nombre);
    public void update(Cantante cantante);
    public void delete(Cantante cantante);  
    public Cantante buscarPorNombreDeDisco(String valor);
    public List<Cantante> findAll();
}
