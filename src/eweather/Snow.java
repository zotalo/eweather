/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eweather;

import java.io.Serializable;

/**
 *
 * @author stmor
 */
public class Snow implements Serializable {
    
    private float mmSnow;

    public float getMmSnow() {
        return mmSnow;
    }

    public void setMmSnow(float mmSnow) {
        this.mmSnow = mmSnow;
    }
    
}
