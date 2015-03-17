/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ordersAgiles.ejBean;

import co.com.ordersAgiles.controlador.OrdprmDaoImplements;
import co.com.ordersAgiles.entidades.Ordprm;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.CloseEvent;

/**
 *
 * @author Disable
 */
@ManagedBean
@ViewScoped
public class OrdprmejBean implements Serializable{

    private Ordprm permiso;
    private List<Ordprm> listaPermisos;
    private OrdprmDaoImplements OrdprmControlador;
    private String text;
    private String estadoBtnGuardar = "true";
    private String estadoBtnModificar = "true";
    
    public OrdprmejBean() {
        
        permiso = new Ordprm();
        OrdprmControlador = new OrdprmDaoImplements();
        
        listar();
        
        System.out.println("Sequencia: "+OrdprmControlador.obtenerSequencia());
        System.out.println("next : "+OrdprmControlador.nextSequencia());
    }
    
    public void handleClose(CloseEvent event){
        
    }
    
    public void ocultarBtnModificar(){
        
        estadoBtnModificar = "false";
        estadoBtnGuardar = "true";
    }
    
    public void ocultarBtnGuardar(){
        
        estadoBtnGuardar = "false";
        estadoBtnModificar = "true";
    }
    
    public void estatusOn(){
        text = "true";
        System.out.println("Estatus : "+text);
    }
    
    public void estatusOff(){
        text = "false";
        System.out.println("Estatus : "+text);
    }
    
    public void listar(){
        
        System.out.println("listando");
         listaPermisos = OrdprmControlador.listar();
        /*
        for (Ordprf prf : listaPerfiles) {
            
            System.out.println("--"+prf.getId()+"-"+prf.getNombre()+"-"+prf.getDescripcion());
        }*/
        
    }
    
    public void insertar(){
        
        System.out.println("Insertar...");
        
        if(permiso != null){
            System.out.println("Guardando...");
            permiso.setId(OrdprmControlador.nextSequencia());
            System.out.println("Perfil :" +permiso.getId()+"-"+permiso.getNombre());
            OrdprmControlador.insertar(permiso);
            nuevo();
            listar();
            nuevo();
        }
    }
    
    public void modificar(){
        
        System.out.println("Modificar...");
        
        if(permiso != null){
            System.out.println("Modificando...");
            //perfil.setId(OrdprmControlador.nextSequencia());
            System.out.println("Perfil :" +permiso.getId()+"-"+permiso.getNombre());
            OrdprmControlador.modificar(permiso);
            nuevo();
            listar();
            
        }
    }
    
    public void eliminar(){
        
        System.out.println("Eliminar...");
        
        if(permiso != null){
            System.out.println("Eliminando...");
            //perfil.setId(OrdprmControlador.nextSequencia());
            System.out.println("Perfil :" +permiso.getId()+"-"+permiso.getNombre());
            OrdprmControlador.eliminar(permiso);
            nuevo();
            listar();
            
        }
    }
    
    public void nuevo(){
        System.out.println("nuevo...");
        permiso = new Ordprm();
        ocultarBtnModificar();
        
    }

    public Ordprm getPermiso() {
        return permiso;
    }

    public void setPermiso(Ordprm permiso) {
        this.permiso = permiso;
    }

    public List<Ordprm> getListaPermisos() {
        return listaPermisos;
    }

    public void setListaPermisos(List<Ordprm> listaPermisos) {
        this.listaPermisos = listaPermisos;
    }

    public OrdprmDaoImplements getOrdprmControlador() {
        return OrdprmControlador;
    }

    public void setOrdprmControlador(OrdprmDaoImplements OrdprmControlador) {
        this.OrdprmControlador = OrdprmControlador;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEstadoBtnGuardar() {
        return estadoBtnGuardar;
    }

    public void setEstadoBtnGuardar(String estadoBtnGuardar) {
        this.estadoBtnGuardar = estadoBtnGuardar;
    }

    public String getEstadoBtnModificar() {
        return estadoBtnModificar;
    }

    public void setEstadoBtnModificar(String estadoBtnModificar) {
        this.estadoBtnModificar = estadoBtnModificar;
    }
    
    
    
}
