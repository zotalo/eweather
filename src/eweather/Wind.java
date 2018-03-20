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
public class Wind {
    
    private float speed;
    
    //constructor
    public Wind(float speed){
        this.speed=speed;
    }
    
    //getters/setters
    public float getSpeed(){
        return speed;
    }
    public void setSpeed(float speed){
        this.speed=speed;
    }
}
