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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gaxp
 */
@Entity
@Table(name = "linea_presupuesto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LineaPresupuesto.findAll", query = "SELECT l FROM LineaPresupuesto l"),
    @NamedQuery(name = "LineaPresupuesto.findByDescripcion", query = "SELECT l FROM LineaPresupuesto l WHERE l.descripcion = :descripcion"),
    @NamedQuery(name = "LineaPresupuesto.findByUnidades", query = "SELECT l FROM LineaPresupuesto l WHERE l.unidades = :unidades"),
    @NamedQuery(name = "LineaPresupuesto.findByCosteUnidad", query = "SELECT l FROM LineaPresupuesto l WHERE l.costeUnidad = :costeUnidad"),
    @NamedQuery(name = "LineaPresupuesto.findByTotal", query = "SELECT l FROM LineaPresupuesto l WHERE l.total = :total"),
    @NamedQuery(name = "LineaPresupuesto.findByIdPresupuesto", query = "SELECT l FROM LineaPresupuesto l WHERE l.idPresupuesto = :idPresupuesto"),
    @NamedQuery(name = "LineaPresupuesto.findById", query = "SELECT l FROM LineaPresupuesto l WHERE l.id = :id")})
public class LineaPresupuesto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "DESCRIPCION")
    private Integer descripcion;
    @Column(name = "UNIDADES")
    private Integer unidades;
    @Column(name = "COSTE_UNIDAD")
    private Integer costeUnidad;
    @Column(name = "TOTAL")
    private Integer total;
    @Column(name = "ID_PRESUPUESTO")
    private Integer idPresupuesto;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;

    public LineaPresupuesto() {
    }

    public LineaPresupuesto(Integer id) {
        this.id = id;
    }

    public Integer getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Integer descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public Integer getCosteUnidad() {
        return costeUnidad;
    }

    public void setCosteUnidad(Integer costeUnidad) {
        this.costeUnidad = costeUnidad;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(Integer idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof LineaPresupuesto)) {
            return false;
        }
        LineaPresupuesto other = (LineaPresupuesto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gaxp.com.services.LineaPresupuesto[ id=" + id + " ]";
    }
    
}
