/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.info;


import java.io.Serializable;
/**
 *
 * @author Stavros
 */
public class CoordInfo implements Serializable{
    private float lon;
    private float lat;
    
    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }
    
    
}
