/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eweather;

/**
 *
 * @author stmor
 */

import java.util.ArrayList;

public class City {
    private int id;
    private int dt;
    private String name;
    private ArrayList<Weather> weathers;
    private Main main;
    
    //constructors
    public City(){
        weathers=new ArrayList<>();
    }
    public void addWeather(Weather w){
        weathers.add(w);
    }
    public City(int id,int dt,String name,float temp){
        this.id=id;
        this.dt=dt;
        this.name=name;
        main=new Main(temp);
    }
    
    
    
    
    
    
    
    
    public int getId(){
        return id;
    }  
    public void setId(int id){
        this.id=id;
    }
    public int getDt(){
        return dt;
    }
    public void setDt(int dt){
        this.dt=dt;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
}
