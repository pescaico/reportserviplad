/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gaxp.com.services;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gaxp
 */
@Entity
@Table(name = "linea_factura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LineaFactura.findAll", query = "SELECT l FROM LineaFactura l"),
    @NamedQuery(name = "LineaFactura.findById", query = "SELECT l FROM LineaFactura l WHERE l.id = :id"),
    @NamedQuery(name = "LineaFactura.findByIdFactura", query = "SELECT l FROM LineaFactura l WHERE l.idFactura = :idFactura"),
    @NamedQuery(name = "LineaFactura.findByDescripcion", query = "SELECT l FROM LineaFactura l WHERE l.descripcion = :descripcion"),
    @NamedQuery(name = "LineaFactura.findByUnidades", query = "SELECT l FROM LineaFactura l WHERE l.unidades = :unidades"),
    @NamedQuery(name = "LineaFactura.findByCoste", query = "SELECT l FROM LineaFactura l WHERE l.coste = :coste"),
    @NamedQuery(name = "LineaFactura.findByTotal", query = "SELECT l FROM LineaFactura l WHERE l.total = :total")})
public class LineaFactura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FACTURA")
    private long idFactura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UNIDADES")
    private double unidades;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COSTE")
    private double coste;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TOTAL")
    private double total;

    public LineaFactura() {
    }

    public LineaFactura(Long id) {
        this.id = id;
    }

    public LineaFactura(Long id, long idFactura, String descripcion, double unidades, double coste, double total) {
        this.id = id;
        this.idFactura = idFactura;
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.coste = coste;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(long idFactura) {
        this.idFactura = idFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getUnidades() {
        return unidades;
    }

    public void setUnidades(double unidades) {
        this.unidades = unidades;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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
        if (!(object instanceof LineaFactura)) {
            return false;
        }
        LineaFactura other = (LineaFactura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gaxp.com.services.LineaFactura[ id=" + id + " ]";
    }
    
}
