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
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
/*
 * @author George Siorokos <georgios.siorokos at gmail.com>
 */
public class Eweather {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       URL url = new URL("http://api.openweathermap.org/data/2.5/group?id=264371,734077,8133690,8133786,261743&units=metric&appid=dad54c459600534e7967891651018385");
  try (InputStream is = url.openStream();
       JsonParser parser = Json.createParser(is)) {
      while (parser.hasNext()) {
          JsonParser.Event e = parser.next();
          if (e == JsonParser.Event.KEY_NAME) {
              switch (parser.getString()) {
                  case "message":
                      parser.next();
                    System.out.print(parser.getString());
                    System.out.print(": ");
                    break;
                case "temp":
                    parser.next();
                    System.out.println(parser.getString());
                    System.out.println("---------");
                    break;
             }
         }
     }
 }
        Mainmenu mm = new Mainmenu();
        mm.setVisible(true);
        // TODO code application logic here
    }
    
}
