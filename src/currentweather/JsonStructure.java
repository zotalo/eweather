/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currentweather;


import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Stavros
 */
public class JsonStructure implements Serializable {
    private int cnt;
    private List<currentweather.ListInfo> list;
    

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<currentweather.ListInfo> getList() {
        return list;
    }

    public void setList(List<currentweather.ListInfo> list) {
        this.list = list;
    }
    
}
