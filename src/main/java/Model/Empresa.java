/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jose Maria
 */


@Entity
@Table(name="tblDatos_Empresa")
public class Empresa implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdEmpresa;
    
     @Column(name="CIF_empresa")
    private String cif;
    
      @Column(name="nombre_empresa")
    private String nombre_empresa;
    
       @Column(name="direccion_empresa")
    private String direccion_empresa;
    
        @Column(name="")
    private long telefono_empresa;
    
         @Column(name="e_mail")
    private String email_empresa;
    
          @Column(name="activaempresa")
    private boolean activo;

   
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDireccion_empresa() {
        return direccion_empresa;
    }

    public void setDireccion_empresa(String direccion_empresa) {
        this.direccion_empresa = direccion_empresa;
    }

    public long getTelefono_empresa() {
        return telefono_empresa;
    }

    public void setTelefono_empresa(long telefono_empresa) {
        this.telefono_empresa = telefono_empresa;
    }

    public String getEmail_empresa() {
        return email_empresa;
    }

    public void setEmail_empresa(String email_empresa) {
        this.email_empresa = email_empresa;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getIdEmpresa() {
        return IdEmpresa;
    }

    public void setIdEmpresa(int IdEmpresa) {
        this.IdEmpresa = IdEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.IdEmpresa;
        hash = 29 * hash + Objects.hashCode(this.cif);
        hash = 29 * hash + Objects.hashCode(this.nombre_empresa);
        hash = 29 * hash + Objects.hashCode(this.direccion_empresa);
        hash = 29 * hash + (int) (this.telefono_empresa ^ (this.telefono_empresa >>> 32));
        hash = 29 * hash + Objects.hashCode(this.email_empresa);
        hash = 29 * hash + (this.activo ? 1 : 0);
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
        final Empresa other = (Empresa) obj;
        if (this.IdEmpresa != other.IdEmpresa) {
            return false;
        }
        if (this.telefono_empresa != other.telefono_empresa) {
            return false;
        }
        if (this.activo != other.activo) {
            return false;
        }
        if (!Objects.equals(this.cif, other.cif)) {
            return false;
        }
        if (!Objects.equals(this.nombre_empresa, other.nombre_empresa)) {
            return false;
        }
        if (!Objects.equals(this.direccion_empresa, other.direccion_empresa)) {
            return false;
        }
        if (!Objects.equals(this.email_empresa, other.email_empresa)) {
            return false;
        }
        return true;
    }

   
          
    
}
