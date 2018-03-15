/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author George Siorokos <georgios.siorokos at gmail.com>
 */
@Entity
@Table(name = "WEATHERTYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Weathertype.findAll", query = "SELECT w FROM Weathertype w")
    , @NamedQuery(name = "Weathertype.findByTypeid", query = "SELECT w FROM Weathertype w WHERE w.typeid = :typeid")
    , @NamedQuery(name = "Weathertype.findByTypename", query = "SELECT w FROM Weathertype w WHERE w.typename = :typename")})
public class Weathertype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TYPEID")
    private Integer typeid;
    @Column(name = "TYPENAME")
    private String typename;
    @OneToMany(mappedBy = "wtype")
    private List<Weatherdata> weatherdataList;

    public Weathertype() {
    }

    public Weathertype(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @XmlTransient
    public List<Weatherdata> getWeatherdataList() {
        return weatherdataList;
    }

    public void setWeatherdataList(List<Weatherdata> weatherdataList) {
        this.weatherdataList = weatherdataList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typeid != null ? typeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Weathertype)) {
            return false;
        }
        Weathertype other = (Weathertype) object;
        if ((this.typeid == null && other.typeid != null) || (this.typeid != null && !this.typeid.equals(other.typeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Weathertype[ typeid=" + typeid + " ]";
    }
    
}
