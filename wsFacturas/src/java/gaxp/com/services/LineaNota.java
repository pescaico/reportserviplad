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
@Table(name = "linea_nota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LineaNota.findAll", query = "SELECT l FROM LineaNota l"),
    @NamedQuery(name = "LineaNota.findByDescripcion", query = "SELECT l FROM LineaNota l WHERE l.descripcion = :descripcion"),
    @NamedQuery(name = "LineaNota.findById", query = "SELECT l FROM LineaNota l WHERE l.id = :id"),
    @NamedQuery(name = "LineaNota.findByHoras", query = "SELECT l FROM LineaNota l WHERE l.horas = :horas"),
    @NamedQuery(name = "LineaNota.findByCosteHora", query = "SELECT l FROM LineaNota l WHERE l.costeHora = :costeHora"),
    @NamedQuery(name = "LineaNota.findByIdNota", query = "SELECT l FROM LineaNota l WHERE l.idNota = :idNota"),
    @NamedQuery(name = "LineaNota.findByTotal", query = "SELECT l FROM LineaNota l WHERE l.total = :total")})
public class LineaNota implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HORAS")
    private Double horas;
    @Column(name = "COSTE_HORA")
    private Double costeHora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_NOTA")
    private int idNota;
    @Column(name = "TOTAL")
    private Double total;

    public LineaNota() {
    }

    public LineaNota(Integer id) {
        this.id = id;
    }

    public LineaNota(Integer id, int idNota) {
        this.id = id;
        this.idNota = idNota;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }

    public Double getCosteHora() {
        return costeHora;
    }

    public void setCosteHora(Double costeHora) {
        this.costeHora = costeHora;
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
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
        if (!(object instanceof LineaNota)) {
            return false;
        }
        LineaNota other = (LineaNota) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gaxp.com.services.LineaNota[ id=" + id + " ]";
    }
    
}
