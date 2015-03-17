/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ordersAgiles.controlador;

import co.com.ordersAgiles.entidades.Ordprm;
import java.util.List;

/**
 *
 * @author Disable
 */
public interface OrdprmDAO {
    
    public List<Ordprm> listar();
    public void insertar(Ordprm permiso);
    public void modificar(Ordprm permiso);
    public void eliminar(Ordprm permiso);
    public Ordprm buscarPorId(Integer id);
    public int obtenerSequencia();
    public int nextSequencia();
    
}
