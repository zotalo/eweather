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
        
            int cityId=10;
            int cityDt=10;
            String cityName="Stavros";
            float cityMainTemp=10.15f;
            float cityWindSpeed=18.19f;
            int cityCloudsAll=68;
            float cityRainMmRain=0.16f;
            float citySnowMmSnow=0.75f;
            City newCity= new City(cityId,cityDt,cityName,cityMainTemp,cityWindSpeed,cityCloudsAll,cityRainMmRain,citySnowMmSnow);
            System.out.println("Id πόλης : "+newCity.getId());
            System.out.println("Dt πόλης : "+newCity.getDt());
            System.out.println("Όνομα πόλης : "+newCity.getName());
            //newCity.setMainTemp(88.98f);
            System.out.println("Θερμοκρασία πόλης : "+newCity.getMainTemp());
            System.out.println("Άνεμος πόλης : "+newCity.getWindSpeed());
            System.out.println("Βροχή πόλης : "+newCity.getRainMmRain());
            System.out.println("Χιόνι πόλης : "+newCity.getSnowMmSnow());
        
            
        try{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EweatherPU");
        em = emf.createEntityManager();
    }catch(Exception e) {
        System.out.println("Error! No Connection with the DB");
        return;
    }
        newCity= new City();
        //(int cityId,int cityDt,String cityName,Main cityMain,Wind cityWind,Clouds cityCloud);
    
        Mainmenu mm = new Mainmenu();
        mm.setVisible(true);
        // TODO code application logic here
    }
    
}
