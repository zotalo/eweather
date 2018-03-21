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
public class Snow {
    
    private float mmSnow;
    
    //constructor
    public Snow(float mmSnow){
        this.mmSnow=mmSnow;
    }
    
    public float getMmSnow(){
        return mmSnow;
    }
    public void setMmSnow(float mmSnow){
        this.mmSnow=mmSnow;
    }
    
}
