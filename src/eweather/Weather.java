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
public class Weather {
    
    private String description;
    
    public Weather(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
}
