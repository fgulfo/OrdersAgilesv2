/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ordersAgiles.controlador;

import co.com.ordersAgiles.entidades.Ordprf;
import co.com.ordersAgiles.persistencia.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Disable
 */
public class OrdprfDaoImplements implements OrdprfDAO{

    @Override
    public List<Ordprf> listar() {
        
        System.out.println("listando de bd");
        
        List<Ordprf> lista = null;
        
        try {
            
             Session sesion = NewHibernateUtil.getSessionFactory().openSession();
             sesion = NewHibernateUtil.getSessionFactory().openSession();
            Query q = sesion.createQuery("from Ordprf order by id");
              lista = (List<Ordprf>)q.list();
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
    public void insertar(Ordprf perfil) {
        
        System.out.println("Insertando en bd");
        
        Session sesion = null;
        
        try {
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(perfil);
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
    public void modificar(Ordprf perfil) {
        
        System.out.println("Modificando en bd");
        
        Session sesion = null;
        
        try {
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.update(perfil);
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
    public void eliminar(Ordprf perfil) {
        
        System.out.println("Eliminando en bd");
        
        Session sesion = null;
        
        try {
            sesion = NewHibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.delete(perfil);
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
            Query q = sesion.createQuery("select count(prf.id) from Ordprf prf ");
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
    public Ordprf buscarPorId(Integer id) {
        
        Ordprf perfil = null;
        
        return perfil;
    }

    @Override
    public int nextSequencia() {
        System.out.println("seq---");
        int total = 0;
        
        List<Long> lista = null;
        
        Session sesion = null;
        
        try {
             sesion = NewHibernateUtil.getSessionFactory().openSession();
            Query q = sesion.createQuery("select count(prf.id) from Ordprf prf ");
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
