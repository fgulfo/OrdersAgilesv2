/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ordersAgiles.controlador;

import co.com.ordersAgiles.entidades.Ordusr;
import co.com.ordersAgiles.persistencia.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Disable
 */
public class OrdusrDaoImplements implements OrdusrDAO{

    @Override
    public List<Ordusr> listarUsuarios() {
        
        Session sesion = null;
        
        List<Ordusr> lista = null;
        
        try {
             sesion = NewHibernateUtil.getSessionFactory().openSession();
            Query q = sesion.createQuery("from Ordusr");
              lista = (List<Ordusr>)q.list();
        } catch (Exception e) {
            System.out.println("MENSAGE : " +e.getMessage());
        }
        finally{
            if(sesion != null){
                sesion.close();
            }
        }
        return lista;
    }

    @Override
    public void insertarUsuario(Ordusr usuario) {
        
        Session sesion = null;
        
        try {
            
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(usuario);
            
        } catch (Exception e) {
        }
    }

    @Override
    public void modificarUsuario(Ordusr usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarUsuario(Ordusr usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
