/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Dany
 */
@Entity
@Table(name = "chat")
public class Chat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idchat")
    private Long idchat;
    
    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;
    
    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL)
    private List<Mensaje> mensajes;
    
    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL)
    private List<Rel_ChatUsuario> rel_chatusuario;

    public Chat() {
        this.mensajes = new ArrayList<>();
        this.rel_chatusuario = new ArrayList<>();
    }
    
    public Chat(String nombre) {
        this();
        this.nombre = nombre;
    }

    public Long getIdchat() {
        return idchat;
    }

    public void setIdchat(Long idchat) {
        this.idchat = idchat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public List<Rel_ChatUsuario> getRel_chatusuario() {
        return rel_chatusuario;
    }

    public void setRel_chatusuario(List<Rel_ChatUsuario> rel_chatusuario) {
        this.rel_chatusuario = rel_chatusuario;
    }

    public void addrel(Rel_ChatUsuario rel){
        this.rel_chatusuario.add(rel);
    }
    
    public void agregarMensaje(Mensaje mensaje){
        this.mensajes.add(mensaje);
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idchat != null ? idchat.hashCode() : 0);
        return hash;
    }


    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chat)) {
            return false;
        }
        Chat other = (Chat) object;
        if ((this.idchat == null && other.idchat != null) || (this.idchat != null && !this.idchat.equals(other.idchat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  idchat + ", " + nombre;
    }

}
