/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author George Siorokos <georgios.siorokos at gmail.com>
 */
@Entity
@Table(name = "WEATHERDATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Weatherdata.findAll", query = "SELECT w FROM Weatherdata w")
    , @NamedQuery(name = "Weatherdata.findByWdid", query = "SELECT w FROM Weatherdata w WHERE w.wdid = :wdid")
    , @NamedQuery(name = "Weatherdata.findByTemp", query = "SELECT w FROM Weatherdata w WHERE w.temp = :temp")
    , @NamedQuery(name = "Weatherdata.findByDescription", query = "SELECT w FROM Weatherdata w WHERE w.description = :description")
    , @NamedQuery(name = "Weatherdata.findByWind", query = "SELECT w FROM Weatherdata w WHERE w.wind = :wind")
    , @NamedQuery(name = "Weatherdata.findByRain", query = "SELECT w FROM Weatherdata w WHERE w.rain = :rain")
    , @NamedQuery(name = "Weatherdata.findBySnow", query = "SELECT w FROM Weatherdata w WHERE w.snow = :snow")
    , @NamedQuery(name = "Weatherdata.findByDt", query = "SELECT w FROM Weatherdata w WHERE w.dt = :dt")
    , @NamedQuery(name = "Weatherdata.findBySystime", query = "SELECT w FROM Weatherdata w WHERE w.systime = :systime")
    , @NamedQuery(name = "Weatherdata.findByRecordtime", query = "SELECT w FROM Weatherdata w WHERE w.recordtime = :recordtime")})
public class Weatherdata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "WDID")
    private Integer wdid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TEMP")
    private Double temp;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "WIND")
    private Double wind;
    @Column(name = "RAIN")
    private Double rain;
    @Column(name = "SNOW")
    private Double snow;
    @Column(name = "DT")
    private Integer dt;
    @Column(name = "SYSTIME")
    private Integer systime;
    @Column(name = "RECORDTIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordtime;
    @OneToMany(mappedBy = "wdid")
    private List<Weather> weatherList;
    @JoinColumn(name = "CITYID", referencedColumnName = "CITYID")
    @ManyToOne
    private City cityid;
    @JoinColumn(name = "WTYPE", referencedColumnName = "TYPEID")
    @ManyToOne
    private Weathertype wtype;

    public Weatherdata() {
    }

    public Weatherdata(Integer wdid) {
        this.wdid = wdid;
    }

    public Integer getWdid() {
        return wdid;
    }

    public void setWdid(Integer wdid) {
        this.wdid = wdid;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getWind() {
        return wind;
    }

    public void setWind(Double wind) {
        this.wind = wind;
    }

    public Double getRain() {
        return rain;
    }

    public void setRain(Double rain) {
        this.rain = rain;
    }

    public Double getSnow() {
        return snow;
    }

    public void setSnow(Double snow) {
        this.snow = snow;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Integer getSystime() {
        return systime;
    }

    public void setSystime(Integer systime) {
        this.systime = systime;
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    @XmlTransient
    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    public City getCityid() {
        return cityid;
    }

    public void setCityid(City cityid) {
        this.cityid = cityid;
    }

    public Weathertype getWtype() {
        return wtype;
    }

    public void setWtype(Weathertype wtype) {
        this.wtype = wtype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wdid != null ? wdid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Weatherdata)) {
            return false;
        }
        Weatherdata other = (Weatherdata) object;
        if ((this.wdid == null && other.wdid != null) || (this.wdid != null && !this.wdid.equals(other.wdid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Weatherdata[ wdid=" + wdid + " ]";
    }
    
}
