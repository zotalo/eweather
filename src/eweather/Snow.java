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
    
    private float threeHours;
    
    public Snow(float threeHours){
        this.threeHours=threeHours;
    }
    
    public float getThreeHours(){
        return threeHours;
    }
    public void getThreeHours(float threeHours){
        this.threeHours=threeHours;
    }
    
}
