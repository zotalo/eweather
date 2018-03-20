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
    
    private float threeHours;
    
    //constructor
    public Rain(float threeHours){
        this.threeHours=threeHours;
    }
    
    public float getThreeHours(){
        return threeHours;
    }
    public void setThreeHours(float threeHours){
        this.threeHours=threeHours;
    }
}
