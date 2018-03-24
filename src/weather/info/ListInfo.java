/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather.info;

/**
 *
 * @author stmor
 */


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ListInfo implements Serializable {
    private CoordInfo coord;
    private SysInfo sys;
    private List<WeatherInfo> weather;
    private MainInfo main;
    private Long visibility;
    private WindInfo wind;
    private CloudsInfo clouds;
    private Long dt;
    private Long id;
    private String name;

    public CoordInfo getCoord() {
        return coord;
    }

    public void setCoord(CoordInfo coord) {
        this.coord = coord;
    }

    public SysInfo getSys() {
        return sys;
    }

    public void setSys(SysInfo sys) {
        this.sys = sys;
    }

    public List<WeatherInfo> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherInfo> weather) {
        this.weather = weather;
    }

 
    public MainInfo getMain() {
        return main;
    }

    public void setMain(MainInfo main) {
        this.main = main;
    }

    public Long getVisibility() {
        return visibility;
    }

    public void setVisibility(Long visibility) {
        this.visibility = visibility;
    }

    public WindInfo getWind() {
        return wind;
    }

    public void setWind(WindInfo wind) {
        this.wind = wind;
    }

    public CloudsInfo getClouds() {
        return clouds;
    }

    public void setClouds(CloudsInfo clouds) {
        this.clouds = clouds;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
