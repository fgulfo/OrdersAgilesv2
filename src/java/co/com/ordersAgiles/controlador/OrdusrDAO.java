/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ordersAgiles.controlador;

import co.com.ordersAgiles.entidades.Ordusr;
import java.util.List;

/**
 *
 * @author Disable
 */
public interface OrdusrDAO {
    
    /**
     *
     */
    public List<Ordusr> listarUsuarios();
    public void insertarUsuario(Ordusr usuario);
    public void modificarUsuario(Ordusr usuario);
    public void eliminarUsuario(Ordusr usuario);
    
    
}
