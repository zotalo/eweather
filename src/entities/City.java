/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author George Siorokos <georgios.siorokos at gmail.com>
 */
@Entity
@Table(name = "CITY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "City.findAll", query = "SELECT c FROM City c")
    , @NamedQuery(name = "City.findByCityid", query = "SELECT c FROM City c WHERE c.cityid = :cityid")
    , @NamedQuery(name = "City.findByCityname", query = "SELECT c FROM City c WHERE c.cityname = :cityname")})
public class City implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CITYID")
    private Integer cityid;
    @Column(name = "CITYNAME")
    private String cityname;
    @OneToMany(mappedBy = "cityid")
    private List<Weatherdata> weatherdataList;

    public City() {
    }

    public City(Integer cityid) {
        this.cityid = cityid;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        Integer oldCityid = this.cityid;
        this.cityid = cityid;
        changeSupport.firePropertyChange("cityid", oldCityid, cityid);
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        String oldCityname = this.cityname;
        this.cityname = cityname;
        changeSupport.firePropertyChange("cityname", oldCityname, cityname);
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
        hash += (cityid != null ? cityid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof City)) {
            return false;
        }
        City other = (City) object;
        if ((this.cityid == null && other.cityid != null) || (this.cityid != null && !this.cityid.equals(other.cityid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.City[ cityid=" + cityid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
