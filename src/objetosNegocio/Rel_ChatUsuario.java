/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author Dany
 */
@Entity
@Table(name = "rel_chatusuario")
public class Rel_ChatUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrel_chatusuario")
    private Long idrel_chatusuario;
    
    @ManyToOne(cascade =CascadeType.MERGE, optional = false)
    @JoinColumn(name = "idchat")
    private Chat chat; 
    
    @ManyToOne(cascade = CascadeType.MERGE, optional = false)
    @JoinColumn(name="idusuario")
    private Usuario usuario;

    public Rel_ChatUsuario() {
    }
    
    public Rel_ChatUsuario(Chat chat, Usuario usuario){
        this.chat=chat;
        this.usuario=usuario;
    }
    public Long getIdrel_chatusuario() {
        return idrel_chatusuario;
    }

    public void setIdrel_chatusuario(Long idrel_chatusuario) {
        this.idrel_chatusuario = idrel_chatusuario;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrel_chatusuario != null ? idrel_chatusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idrel_chatusuario fields are not set
        if (!(object instanceof Rel_ChatUsuario)) {
            return false;
        }
        Rel_ChatUsuario other = (Rel_ChatUsuario) object;
        if ((this.idrel_chatusuario == null && other.idrel_chatusuario != null) || (this.idrel_chatusuario != null && !this.idrel_chatusuario.equals(other.idrel_chatusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rel_ChatUsuario{" + "idrel_chatusuario=" + idrel_chatusuario + ", chat=" + chat + ", usuario=" + usuario + '}';
    }
    
}
