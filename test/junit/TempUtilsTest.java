/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;

import org.junit.Test;



import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList; 
import utils.TempUtils;

public class TempUtilsTest {

	@Test
	public void testGetWeatherForCities() throws MalformedURLException, IOException {
		TempUtils util = new TempUtils();
                ArrayList<String> ids = new ArrayList<>();
                ids.add("735914");
		String result = util.getWeatherForCities("http://api.openweathermap.org/data/2.5/group", 
				"2c48c02c54482ea955d6414942572809", ids);
		assertTrue(result.contains("Katerini"));
	}
	
	@Test
	public void testGetWeatherForCitiesCount() throws MalformedURLException, IOException {
		TempUtils util = new TempUtils();
                ArrayList<String> ids = new ArrayList<>();
                ids.add("735914");
                ids.add("734077");
                ids.add("264371");
		String json = util.getWeatherForCities("http://api.openweathermap.org/data/2.5/group", 
				"2c48c02c54482ea955d6414942572809", ids);
		
		ObjectMapper mapper = new ObjectMapper();
		EweatherInfo eweather = mapper.readValue(json, EweatherInfo.class);
		
		assertEquals(Integer.valueOf(3), eweather.getCnt());
	}
	
	@Test
	public void testGetWeatherForCitiesMalformedException() {
		TempUtils util = new TempUtils();
		boolean result = false;
		try {
			 util.getWeatherForCities("xttp://api.openweathermap.org/data/2.5/group", 
					"2c48c02c54482ea955d6414942572809", Arrays.asList("735914", "734077", "264371"));
		} catch (MalformedURLException  e1) {
			result = true;
		} catch (IOException e2) {
			result = false;
		}
		assertTrue(result);
	}
}

