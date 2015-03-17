package co.com.ordersAgiles.entidades;
// Generated 27/02/2015 01:39:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Ordusr generated by hbm2java
 */
public class Ordusr  implements java.io.Serializable {


     private int id;
     private Ordter ordter;
     private Integer estado;
     private String nick;
     private String password;
     private Integer perfil;
     private Set<Ordarq> ordarqsForUsuarioapertura = new HashSet<Ordarq>(0);
     private Set<Ordarq> ordarqsForUsuariocierre = new HashSet<Ordarq>(0);
     private Set<Ordprf> ordprfs = new HashSet<Ordprf>(0);

    public Ordusr() {
    }

	
    public Ordusr(int id) {
        this.id = id;
    }
    public Ordusr(int id, Ordter ordter, Integer estado, String nick, String password, Integer perfil, Set<Ordarq> ordarqsForUsuarioapertura, Set<Ordarq> ordarqsForUsuariocierre, Set<Ordprf> ordprfs) {
       this.id = id;
       this.ordter = ordter;
       this.estado = estado;
       this.nick = nick;
       this.password = password;
       this.perfil = perfil;
       this.ordarqsForUsuarioapertura = ordarqsForUsuarioapertura;
       this.ordarqsForUsuariocierre = ordarqsForUsuariocierre;
       this.ordprfs = ordprfs;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Ordter getOrdter() {
        return this.ordter;
    }
    
    public void setOrdter(Ordter ordter) {
        this.ordter = ordter;
    }
    public Integer getEstado() {
        return this.estado;
    }
    
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public String getNick() {
        return this.nick;
    }
    
    public void setNick(String nick) {
        this.nick = nick;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Integer perfil) {
        this.perfil = perfil;
    }
    public Set<Ordarq> getOrdarqsForUsuarioapertura() {
        return this.ordarqsForUsuarioapertura;
    }
    
    public void setOrdarqsForUsuarioapertura(Set<Ordarq> ordarqsForUsuarioapertura) {
        this.ordarqsForUsuarioapertura = ordarqsForUsuarioapertura;
    }
    public Set<Ordarq> getOrdarqsForUsuariocierre() {
        return this.ordarqsForUsuariocierre;
    }
    
    public void setOrdarqsForUsuariocierre(Set<Ordarq> ordarqsForUsuariocierre) {
        this.ordarqsForUsuariocierre = ordarqsForUsuariocierre;
    }
    public Set<Ordprf> getOrdprfs() {
        return this.ordprfs;
    }
    
    public void setOrdprfs(Set<Ordprf> ordprfs) {
        this.ordprfs = ordprfs;
    }




}

