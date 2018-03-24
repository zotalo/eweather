/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eweather;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Event;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import javax.json.*;
import javax.json.stream.JsonParser;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import utils.TempUtils;
import forecast.info.*;
/*
 * @author George Siorokos <georgios.siorokos at gmail.com>
 */
public class Eweather {
        public static EntityManager em;

        private static final String url = "http://api.openweathermap.org/data/2.5/group";
        private static final String apiKey = "dad54c459600534e7967891651018385";

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
            TempUtils util = new TempUtils();
            List<String> cityIds = new ArrayList<>();
            cityIds.add("264371");
            cityIds.add("734077");
            cityIds.add("8133690");
            cityIds.add("8133786");
            cityIds.add("261743");
            String json = util.getWeatherForCities(url, apiKey, cityIds);
  //          ObjectMapper mapper = new ObjectMapper();
  //          JsonStructure jsonStructure = mapper.readValue(json, JsonStructure.class);
            
            for(String cityCode : Arrays.asList("264371", "734077", "8133690", "8133786", "261743")) {
   String jsonForecast = util.getWeatherForCities("http://api.openweathermap.org/data/2.5/forecast", 
     "2c48c02c54482ea955d6414942572809", Arrays.asList(cityCode));
   
   ObjectMapper mapperForecast = new ObjectMapper();
  ForecastInfo forecastInfo = mapperForecast.readValue(jsonForecast, ForecastInfo.class);
   
   //new ForecastToCityMapper().apply(forecastInfo); 
   
   System.out.println("test");
   
   //service.save(city);
  }
            
            
            ObjectMapper mapperForecast = new ObjectMapper();
            ForecastInfo forecastInfo = mapperForecast.readValue(jsonForecast, ForecastInfo.class);
            int cityId=10;
            int cityDt=10;
            String cityName="Stavros";
            float cityMainTemp=10.15f;
            float cityWindSpeed=18.19f;
            int cityCloudsAll=68;
            float cityRainMmRain=0.16f;
            float citySnowMmSnow=0.75f;
            String cityWeatherDescr="Κατά τόπους χιόνι";
            //List<Weather> weathers = new ArrayList<>();
            String neoJsonWeatherKid="Xalase o kairos";
//            City newCity= new City(cityId, cityDt, cityName, cityMainTemp, cityWindSpeed, cityCloudsAll, cityRainMmRain, citySnowMmSnow, cityWeatherDescr);
//            for (int i=0; i<5; i++){
//                newCity.BuildWeath(newCity.getWeathers().size(), neoJsonWeatherKid);
//            }
            //City newWeath = null;
            //newWeath.BuildWeath(cityWeatherDescr);
            //Weather weatherAdd=new Weather("xoxoxoxo");
            //weathers.add(weatherAdd);
//            System.out.println("Id πόλης : "+newCity.getId());
//            System.out.println("Dt πόλης : "+newCity.getDt());
//            System.out.println("Όνομα πόλης : "+newCity.getName());
//            //newCity.setMainTemp(88.98f);
//            System.out.println("Θερμοκρασία πόλης : "+newCity.getMain().getTemp());
//            System.out.println("Άνεμος πόλης : "+newCity.getWind().getSpeed());
//            System.out.println("Βροχή πόλης : "+newCity.getRain().getMmRain());
//            System.out.println("Χιόνι πόλης : "+newCity.getSnow().getMmSnow());
//            for (int i=0; i<newCity.getWeathers().size(); i++){
//
//                System.out.println("Περιγραφή καιρού στην θέση λίστας Weather : "+(newCity.getWeathers().get(i).getCnt()+1)+" είναι "+newCity.getWeathers().get(i).getDescription());
//            }
           // System.out.println("Περιγραφή καιρού vol 2 : "+newWeath.getWeathers().get(1).getDescription());



        try{
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EweatherPU");
        em = emf.createEntityManager();
    }catch(Exception e) {
        System.out.println("Error! No Connection with the DB");
        return;
    }
       // newCity= new City();
        //(int cityId,int cityDt,String cityName,Main cityMain,Wind cityWind,Clouds cityCloud);

        Mainmenu mm = new Mainmenu();
        mm.setVisible(true);
        // TODO code application logic here
    }

}
