/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ordersAgiles.controlador;

import co.com.ordersAgiles.entidades.Ordprm;
import co.com.ordersAgiles.persistencia.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Disable
 */
public class OrdprmDaoImplements implements OrdprmDAO{

    @Override
    public List<Ordprm> listar() {
        
        System.out.println("listando de bd");
        
        List<Ordprm> lista = null;
        
        try {
            
             Session sesion = NewHibernateUtil.getSessionFactory().openSession();
             sesion = NewHibernateUtil.getSessionFactory().openSession();
            Query q = sesion.createQuery("from Ordprm order by id");
              lista = (List<Ordprm>)q.list();
            sesion.flush();
             if(sesion != null){
                sesion.close();
            }
        } catch (Exception e) {
            System.out.println("MENSAGE : " +e.getMessage());
        }

        return lista;
    }

    @Override
    public void insertar(Ordprm permiso) {
        
        System.out.println("Insertando en bd");
        
        Session sesion = null;
        
        try {
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(permiso);
            sesion.getTransaction().commit();
            sesion.flush();
        } catch (Exception e) {
            System.out.println("mensaje:" +e.getMessage());
            sesion.getTransaction().rollback();
        }
        finally{
            if(sesion != null){
                sesion.close();
            }
        }
    }

    @Override
    public void modificar(Ordprm permiso) {
        
        System.out.println("Modificando en bd");
        
        Session sesion = null;
        
        try {
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.update(permiso);
            sesion.getTransaction().commit();
            sesion.flush();
        } catch (Exception e) {
            System.out.println("mensaje:" +e.getMessage());
            sesion.getTransaction().rollback();
        }
        finally{
            if(sesion != null){
                sesion.close();
            }
        }
    }

    @Override
    public void eliminar(Ordprm permiso) {
        
        System.out.println("Eliminando en bd");
        
        Session sesion = null;
        
        try {
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.delete(permiso);
            sesion.getTransaction().commit();
            sesion.flush();
        } catch (Exception e) {
            System.out.println("mensaje:" +e.getMessage());
            sesion.getTransaction().rollback();
        }
        finally{
            if(sesion != null){
                sesion.close();
            }
        }
        
    }


    @Override
    public int obtenerSequencia() {
        System.out.println("seq---");
        int total = 0;
        
        List<Long> lista = null;
        
        Session sesion = null;
        
        try {
             sesion = NewHibernateUtil.getSessionFactory().openSession();
            Query q = sesion.createQuery("select count(prm.id) from Ordprm prm ");
            lista = q.list();
            
            for(Long i : lista){
                System.out.println("seq :" +i);
                total = i.intValue();
            }
            
            
        } catch (Exception e) {
            System.out.println("MENSAGE : " +e.getMessage());
        }
        
        return total;
    }

    @Override
    public Ordprm buscarPorId(Integer id) {
        
        Ordprm permiso = null;
        
        return permiso;
    }

    @Override
    public int nextSequencia() {
        System.out.println("seq---");
        int total = 0;
        
        List<Long> lista = null;
        
        Session sesion = null;
        
        try {
             sesion = NewHibernateUtil.getSessionFactory().openSession();
            Query q = sesion.createQuery("select count(prm.id) from Ordprm prm ");
            lista = q.list();
            
            for(Long i : lista){
                System.out.println("seq :" +i);
                total = i.intValue();
                total = total+1;
            }
            
            
        } catch (Exception e) {
            System.out.println("MENSAGE : " +e.getMessage());
        }
        
        return total;
    }
    
}
