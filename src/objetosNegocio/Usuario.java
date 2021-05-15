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
import Enums.Sexo;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Dany
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private Long idusuario;

    @Column(name = "correoElectronico", length = 150, nullable = false)
    private String correoElectronico;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechanacimiento", nullable = false)
    private Calendar fechanacimiento;

    @Column(name = "sexo", length = 10, nullable = false)
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(name = "nombreusuario", length = 45, nullable = false,unique = true)
    private String nombreUsuario;

    @Column(name = "contrasenia", length = 10, nullable = false)
    private String contrasenia;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Mensaje> mensajes;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Rel_ChatUsuario> rel_chatusuario;

    public Usuario() {
        this.mensajes = new ArrayList<>();
        this.rel_chatusuario = new ArrayList<>();
    }

    public Usuario(Long idusuario, String correoElectronico, Calendar fechanacimiento, Sexo sexo, String nombreUsuario, String contrasenia) {
        this.idusuario = idusuario;
        this.correoElectronico = correoElectronico;
        this.fechanacimiento = fechanacimiento;
        this.sexo = sexo;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }
    
    public Usuario(String correoElectronico, Calendar fechanacimiento, Sexo sexo, String nombreUsuario, String contraseña) {
        this();
        this.correoElectronico = correoElectronico;
        this.fechanacimiento = fechanacimiento;
        this.sexo = sexo;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contraseña;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Calendar getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Calendar fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public void agregarMensaje(Mensaje mensaje) {
        this.mensajes.add(mensaje);
    }

    public List<Rel_ChatUsuario> getRel_chatusuario() {
        return rel_chatusuario;
    }

    public void setRel_chatusuario(List<Rel_ChatUsuario> rel_chatusuario) {
        this.rel_chatusuario = rel_chatusuario;
    }

    public void addRel(Rel_ChatUsuario  rel){
        this.rel_chatusuario.add(rel);
    }
        
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idusuario+" "+nombreUsuario;
    }

}
