package co.com.ordersAgiles.entidades;
// Generated 27/02/2015 01:39:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Ordprm generated by hbm2java
 */
public class Ordprm  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private Integer estado;
     private String nombre;
     private Set<Ordprf> ordprfs = new HashSet<Ordprf>(0);

    public Ordprm() {
    }

	
    public Ordprm(int id) {
        this.id = id;
    }
    public Ordprm(int id, String descripcion, Integer estado, String nombre, Set<Ordprf> ordprfs) {
       this.id = id;
       this.descripcion = descripcion;
       this.estado = estado;
       this.nombre = nombre;
       this.ordprfs = ordprfs;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getEstado() {
        return this.estado;
    }
    
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Ordprf> getOrdprfs() {
        return this.ordprfs;
    }
    
    public void setOrdprfs(Set<Ordprf> ordprfs) {
        this.ordprfs = ordprfs;
    }




}

