/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author George Siorokos <georgios.siorokos at gmail.com>
 */
@Entity
@Table(name = "WEATHER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Weather.findAll", query = "SELECT w FROM Weather w")
    , @NamedQuery(name = "Weather.findByWid", query = "SELECT w FROM Weather w WHERE w.wid = :wid")
    , @NamedQuery(name = "Weather.findByWdescription", query = "SELECT w FROM Weather w WHERE w.wdescription = :wdescription")})
public class Weather implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "WID")
    private Integer wid;
    @Column(name = "WDESCRIPTION")
    private String wdescription;
    @JoinColumn(name = "WDID", referencedColumnName = "WDID")
    @ManyToOne
    private Weatherdata wdid;

    public Weather() {
    }

    public Weather(Integer wid) {
        this.wid = wid;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWdescription() {
        return wdescription;
    }

    public void setWdescription(String wdescription) {
        this.wdescription = wdescription;
    }

    public Weatherdata getWdid() {
        return wdid;
    }

    public void setWdid(Weatherdata wdid) {
        this.wdid = wdid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wid != null ? wid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Weather)) {
            return false;
        }
        Weather other = (Weather) object;
        if ((this.wid == null && other.wid != null) || (this.wid != null && !this.wid.equals(other.wid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Weather[ wid=" + wid + " ]";
    }
    
}
