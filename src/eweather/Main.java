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
public class Main {
    
    private float temp;
    
    public Main(float temp){
        this.temp=temp;
    }
    
    public float getTemp(){
        return temp;
    }  
    public void setTemp(float temp){
        this.temp=temp;
    }
}
