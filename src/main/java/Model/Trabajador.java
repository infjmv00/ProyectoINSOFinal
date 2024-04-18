/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
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
 * @author Jose Maria
 */
@Entity
@Table(name="tblTrabajadores")
public class Trabajador implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NIFtrab")
    private String NIFtrab;

    @ManyToOne
    @JoinColumn(name = "IdRol")
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "id_Empresa")
    private Empresa empresa;

    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "contrasenya")
    private String contrasenya;

    @Column(name = "nombretrab")
    private String nombretrab;

    @Column(name = "apellidostrab")
    private String apellidostrab;

    @Column(name = "direcciontrab")
    private String direcciontrab;

    @Column(name = "Telefonotrab")
    private long Telefonotrab;

    @Column(name = "e_mailtrab")
    private String e_mailtrab;

    @Column(name = "Fecha_inicio")
    private Date Fecha_inicio;

    @Column(name = "fecha_fin")
    private Date fecha_fin;

    @Column(name = "activotrab")
    private boolean activotrab;
    
   

    public String getNIFtrab() {
        return NIFtrab;
    }

    public void setNIFtrab(String NIFtrab) {
        this.NIFtrab = NIFtrab;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getNombretrab() {
        return nombretrab;
    }

    public void setNombretrab(String nombretrab) {
        this.nombretrab = nombretrab;
    }

    public String getApellidostrab() {
        return apellidostrab;
    }

    public void setApellidostrab(String apellidostrab) {
        this.apellidostrab = apellidostrab;
    }

    public String getDirecciontrab() {
        return direcciontrab;
    }

    public void setDirecciontrab(String direcciontrab) {
        this.direcciontrab = direcciontrab;
    }

    public long getTelefonotrab() {
        return Telefonotrab;
    }

    public void setTelefonotrab(long Telefonotrab) {
        this.Telefonotrab = Telefonotrab;
    }

    public String getE_mailtrab() {
        return e_mailtrab;
    }

    public void setE_mailtrab(String e_mailtrab) {
        this.e_mailtrab = e_mailtrab;
    }

    public Date getFecha_inicio() {
        return Fecha_inicio;
    }

    public void setFecha_inicio(Date Fecha_inicio) {
        this.Fecha_inicio = Fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public boolean isActivotrab() {
        return activotrab;
    }

    public void setActivotrab(boolean activotrab) {
        this.activotrab = activotrab;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.NIFtrab);
        hash = 59 * hash + Objects.hashCode(this.rol);
        hash = 59 * hash + Objects.hashCode(this.empresa);
        hash = 59 * hash + Objects.hashCode(this.fecha);
        hash = 59 * hash + Objects.hashCode(this.usuario);
        hash = 59 * hash + Objects.hashCode(this.contrasenya);
        hash = 59 * hash + Objects.hashCode(this.nombretrab);
        hash = 59 * hash + Objects.hashCode(this.apellidostrab);
        hash = 59 * hash + Objects.hashCode(this.direcciontrab);
        hash = 59 * hash + (int) (this.Telefonotrab ^ (this.Telefonotrab >>> 32));
        hash = 59 * hash + Objects.hashCode(this.e_mailtrab);
        hash = 59 * hash + Objects.hashCode(this.Fecha_inicio);
        hash = 59 * hash + Objects.hashCode(this.fecha_fin);
        hash = 59 * hash + (this.activotrab ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajador other = (Trabajador) obj;
        if (this.Telefonotrab != other.Telefonotrab) {
            return false;
        }
        if (this.activotrab != other.activotrab) {
            return false;
        }
        if (!Objects.equals(this.NIFtrab, other.NIFtrab)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.contrasenya, other.contrasenya)) {
            return false;
        }
        if (!Objects.equals(this.nombretrab, other.nombretrab)) {
            return false;
        }
        if (!Objects.equals(this.apellidostrab, other.apellidostrab)) {
            return false;
        }
        if (!Objects.equals(this.direcciontrab, other.direcciontrab)) {
            return false;
        }
        if (!Objects.equals(this.e_mailtrab, other.e_mailtrab)) {
            return false;
        }
        if (!Objects.equals(this.rol, other.rol)) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.Fecha_inicio, other.Fecha_inicio)) {
            return false;
        }
        if (!Objects.equals(this.fecha_fin, other.fecha_fin)) {
            return false;
        }
        return true;
    }
    
    
    
}
