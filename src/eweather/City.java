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
    //private ArrayList<Rain> rains;
    //private ArrayList<Snow> snows;
    private Main main;
    private Wind wind;
    private Clouds clouds;
    private Rain rain;
    private Snow snow;
    
    //constructors
    public City(){
        weathers=new ArrayList<>();
        //rains=new ArrayList<>();
        //snows=new ArrayList<>();
    }
    public City(int id,int dt,String name,float mainTemp,float windSpeed,int cloudsAll,float rainMmRain,float snowMmSnow){
        this.id=id;
        this.dt=dt;
        this.name=name;
        main=new Main(mainTemp);
        //System.out.println("City temp : "+main.getTemp());
        wind=new Wind(windSpeed);
        //System.out.println("City Wind Speed : "+wind.getSpeed());
        clouds=new Clouds(cloudsAll);
        //System.out.println("City Clouds : "+clouds.getAll());
        rain=new Rain(rainMmRain);
        //System.out.println("City Rain : "+rain.getMmRain());
        snow=new Snow(snowMmSnow);
        //System.out.println("City Snow : "+snow.getMmSnow());
        
        
    }
    //add objects in array list
    public void addWeather(Weather w){
        weathers.add(w);
    }
    /*
    public void addRain(Rain r){
        rains.add(r);
    }
    public void addSnow(Snow s){
        snows.add(s);
    
    }
    */ 
    
    
    //Getter για αναζήτηση κλήση από την main class
    public float getMainTemp(){
        return main.getTemp();
    }
    //Setter για αναζήτηση κλήση από την main class
     public void setMainTemp(float mainTemp){
        main.setTemp(mainTemp);
    }
    
    
    
    
    public float getWindSpeed(){
        return wind.getSpeed();
    }
    
    public void setWindSpeed(float windSpeed){
        wind.setSpeed(windSpeed);
    }
    
    
    public int getCloudsAll(){
        return clouds.getAll();
    }
    
    public void setCloudsAll(int cloudsAll){
        clouds.setAll(cloudsAll);
    }
    
    public float getRainMmRain(){
        return rain.getMmRain();
    }
    public void setRainMmRain(float rainMmRain){
        rain.setMmRain(rainMmRain);
    }
    
    public float getSnowMmSnow(){
        return snow.getMmSnow();
    }
    public void setSnowMmRain(float snowMmSnow){
        snow.setMmSnow(snowMmSnow);
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
