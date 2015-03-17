/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ordersAgiles.controlador;

import co.com.ordersAgiles.entidades.Ordprf;
import java.util.List;

/**
 *
 * @author Disable
 */
public interface OrdprfDAO {
    
    public List<Ordprf> listar();
    public void insertar(Ordprf perfil);
    public void modificar(Ordprf perfil);
    public void eliminar(Ordprf perfil);
    public Ordprf buscarPorId(Integer id);
    public int obtenerSequencia();
    public int nextSequencia();
}
