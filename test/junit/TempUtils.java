/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author George Siorokos <georgios.siorokos at gmail.com>
 */
public class TempUtils {
    public String getWeatherForCities(
            String baseUrl, 
            String apiKey,
            List<String> cityIds)
            throws MalformedURLException, IOException {
        StringBuilder sb = new StringBuilder();

        String urlStr
                = baseUrl + "?id=";
        int count = cityIds.size();
        for (int i = 0; i < count; i++) {
            urlStr += cityIds.get(i);
            if (i < count - 1) {
                urlStr += ",";
            }
        }
        urlStr += "&units=metric&appid=" + apiKey;
        URL = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));

        String output;
        System.out.println("Output from Server .... \n");

        while ((output = br.readLine()) != null) {
            sb.append(output);
        }
        conn.disconnect();

        return sb.toString();
    }
    public TempUtils() {
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
