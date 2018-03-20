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
    private ArrayList<Rain> rains;
    private ArrayList<Snow> snows;
    private Main main;
    private Wind wind;
    private Clouds clouds;
    
    //constructors
    public City(){
        weathers=new ArrayList<>();
        rains=new ArrayList<>();
        snows=new ArrayList<>();
    }
    public City(int id,int dt,String name,float temp,float speed,int all){
        this.id=id;
        this.dt=dt;
        this.name=name;
        main=new Main(temp);
        wind=new Wind(speed);
        clouds=new Clouds(all);
    }
    //add objects in array list
    public void addWeather(Weather w){
        weathers.add(w);
    }
    public void addRain(Rain r){
        rains.add(r);
    }
    public void addSnow(Snow s){
        snows.add(s);
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
