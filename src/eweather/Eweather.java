/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eweather;
import java.awt.Event;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL; 
import javax.json.*;
import javax.json.stream.JsonParser;
import model.*;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
/*
 * @author George Siorokos <georgios.siorokos at gmail.com>
 */
public class Eweather {
        public static EntityManager em;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        try{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EweatherPU");
        em = emf.createEntityManager();
    }catch(Exception e) {
        System.out.println("Error! No Connection with the DB");
        return;
    }
    
        Mainmenu mm = new Mainmenu();
        mm.setVisible(true);
        // TODO code application logic here
    }
    
}
