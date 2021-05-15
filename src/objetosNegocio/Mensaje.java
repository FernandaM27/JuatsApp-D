/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Dany
 */
@Entity
@Table(name = "mensaje")
public class Mensaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmensaje")
    private Long idmensaje;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "idusuario")
    Usuario usuario;

    @Column(name = "mensaje", length = 200, nullable = false)
    private String mensaje;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_hora", nullable = false)
    private Date fecha_hora;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "idchat")
    private Chat chat;

    public Mensaje() {
    }

    public Mensaje(Usuario usuario, String mensaje, Date fecha_hora, Chat chat) {
        this.usuario = usuario;
        this.mensaje = mensaje;
        this.fecha_hora = fecha_hora;
        this.chat = chat;
    }

    public Long getIdmensaje() {
        return idmensaje;
    }

    public void setIdmensaje(Long idmensaje) {
        this.idmensaje = idmensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmensaje != null ? idmensaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idmensaje fields are not set
        if (!(object instanceof Mensaje)) {
            return false;
        }
        Mensaje other = (Mensaje) object;
        if ((this.idmensaje == null && other.idmensaje != null) || (this.idmensaje != null && !this.idmensaje.equals(other.idmensaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "idmensaje=" + idmensaje + ", usuario=" + usuario + ", mensaje=" + mensaje + ", fecha_hora=" + fecha_hora + ", chat=" + chat + '}';
    }
}
