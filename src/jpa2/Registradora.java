/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa2;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Álvaro Rios
 */
@Entity
@Table(name = "REGISTRADORA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registradora.findAll", query = "SELECT r FROM Registradora r"),
    @NamedQuery(name = "Registradora.findById", query = "SELECT r FROM Registradora r WHERE r.id = :id"),
    @NamedQuery(name = "Registradora.findByFecha", query = "SELECT r FROM Registradora r WHERE r.fecha = :fecha")})
public class Registradora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "ID_ASOCIADO", referencedColumnName = "NOMBRE")
    @ManyToOne(optional = false)
    private Asociado idAsociado;

    public Registradora() {
    }

    public Registradora(Integer id) {
        this.id = id;
    }

    public Registradora(Integer id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Asociado getIdAsociado() {
        return idAsociado;
    }

    public void setIdAsociado(Asociado idAsociado) {
        this.idAsociado = idAsociado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registradora)) {
            return false;
        }
        Registradora other = (Registradora) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa2.Registradora[ id=" + id + " ]";
    }
    
    
     public static void insertarRegistro(String nombre,String fecha){
         
      System.out.println(nombre);   
     
     }
    
   
    
    
}
