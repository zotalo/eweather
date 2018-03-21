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
public class Rain {
    
    private float mmRain;
    
    //constructor
    public Rain(float mmRain){
        this.mmRain=mmRain;
    }
    
    public float getMmRain(){
        return mmRain;
    }
    public void setMmRain(float mmRain){
        this.mmRain=mmRain;
    }
}
