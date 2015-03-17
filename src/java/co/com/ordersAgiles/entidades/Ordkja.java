package co.com.ordersAgiles.entidades;
// Generated 27/02/2015 01:39:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Ordkja generated by hbm2java
 */
public class Ordkja  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String descripcion;
     private Integer estado;
     private Set<Ordarq> ordarqs = new HashSet<Ordarq>(0);
     private Set<Orddoc> orddocs = new HashSet<Orddoc>(0);

    public Ordkja() {
    }

	
    public Ordkja(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Ordkja(int id, String nombre, String descripcion, Integer estado, Set<Ordarq> ordarqs, Set<Orddoc> orddocs) {
       this.id = id;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.estado = estado;
       this.ordarqs = ordarqs;
       this.orddocs = orddocs;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public Set<Ordarq> getOrdarqs() {
        return this.ordarqs;
    }
    
    public void setOrdarqs(Set<Ordarq> ordarqs) {
        this.ordarqs = ordarqs;
    }
    public Set<Orddoc> getOrddocs() {
        return this.orddocs;
    }
    
    public void setOrddocs(Set<Orddoc> orddocs) {
        this.orddocs = orddocs;
    }




}


