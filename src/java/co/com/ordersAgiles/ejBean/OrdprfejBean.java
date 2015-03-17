/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ordersAgiles.ejBean;

import co.com.ordersAgiles.controlador.OrdprfDaoImplements;
import co.com.ordersAgiles.entidades.Ordprf;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import org.primefaces.event.CloseEvent;

/**
 *
 * @author Disable
 */

@ManagedBean
@ViewScoped
public class OrdprfejBean implements Serializable{

    private Ordprf perfil;
    private Ordprf per;
    private List<Ordprf> listaPerfiles;
    private OrdprfDaoImplements OrdprfControlador;
    private String text;
    private String estadoBtnGuardar = "true";
    private String estadoBtnModificar = "true";
    
    protected final Logger log = Logger.getLogger(getClass().toString());
    
    
    public OrdprfejBean() {
         
        System.out.println(log.getName());
        text = "false";
        perfil = new Ordprf();
        listaPerfiles = new ArrayList<>();
        OrdprfControlador = new OrdprfDaoImplements();
        listar();
        
        /*Ordprf p = new Ordprf();
        p.setId(3);
        p.setEstado(1);
        p.setDescripcion("prueba");
        p.setNombre("perfil de prueba");
        OrdprfControlador.insertarUsuario(p);*/
        
        System.out.println("Sequencia: "+OrdprfControlador.obtenerSequencia());
        System.out.println("next : "+OrdprfControlador.nextSequencia());
        
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
         listaPerfiles = OrdprfControlador.listar();
        /*
        for (Ordprf prf : listaPerfiles) {
            
            System.out.println("--"+prf.getId()+"-"+prf.getNombre()+"-"+prf.getDescripcion());
        }*/
        
    }
    
    public void insertar(){
        
        System.out.println("Insertar...");
        
        if(perfil != null){
            System.out.println("Guardando...");
            perfil.setId(OrdprfControlador.nextSequencia());
            System.out.println("Perfil :" +perfil.getId()+"-"+perfil.getNombre());
            OrdprfControlador.insertar(perfil);
            nuevo();
            listar();
            nuevo();
        }
    }
    
    public void modificar(){
        
        System.out.println("Modificar...");
        
        if(perfil != null){
            System.out.println("Modificando...");
            //perfil.setId(OrdprfControlador.nextSequencia());
            System.out.println("Perfil :" +perfil.getId()+"-"+perfil.getNombre());
            OrdprfControlador.modificar(perfil);
            nuevo();
            listar();
            
        }
    }
    
    public void eliminar(){
        
        System.out.println("Eliminar...");
        
        if(perfil != null){
            System.out.println("Eliminando...");
            //perfil.setId(OrdprfControlador.nextSequencia());
            System.out.println("Perfil :" +perfil.getId()+"-"+perfil.getNombre());
            OrdprfControlador.eliminar(perfil);
            nuevo();
            listar();
            
        }
    }
    
    public void nuevo(){
        System.out.println("nuevo...");
        perfil = new Ordprf();
        ocultarBtnModificar();
        
    }
    public Ordprf getPerfil() {
        return perfil;
    }

    public void setPerfil(Ordprf perfil) {
        this.perfil = perfil;
    }

    public List<Ordprf> getListaPerfiles() {
        return listaPerfiles;
    }

    public void setListaPerfiles(List<Ordprf> listaPerfiles) {
        this.listaPerfiles = listaPerfiles;
    }

    public Ordprf getPer() {
        return per;
    }

    public void setPer(Ordprf per) {
        this.per = per;
    }

    public OrdprfDaoImplements getOrdprfControlador() {
        return OrdprfControlador;
    }

    public void setOrdprfControlador(OrdprfDaoImplements OrdprfControlador) {
        this.OrdprfControlador = OrdprfControlador;
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
