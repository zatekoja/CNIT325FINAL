
package cnit325finalproject;

//ADD APACHE COMMONS LANG .JAR FILE TO LIBRARY
//ADD ORG.JSON .JAR FILE TO LIBRARY

import java.net.URL;
import org.json.JSONObject;
import java.io.*;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONTokener;


//Extends Order to obtain Customer's zipcode for shipping estimate
public class Delivery extends Order{
    private String zipTo, zipFrom;
    private String distance, duration;

    public String getZipTo() {
        return zipTo;
    }

    public void setZipTo(String zipTo) {
        this.zipTo = zipTo;
    }

    public String getZipFrom() {
        return zipFrom;
    }

    public void setZipFrom(String zipFrom) {
        this.zipFrom = zipFrom;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    public Delivery(String zipTo) {
        this.zipFrom = "47907";
        this.zipTo = zipTo;
    }
    
   
   //method builds the URL to pull the JSON data from the Google Distance Matrix API
   //Includes parameters for zipcode to and from to calculate distance and duration 
    public String urlBuild(String to, String from){
       String replaceTo = to.replace(" ", "+");
       String replaceFrom = from.replace(" ", "+");
       String url = "https://maps.googleapis.com/maps/api/distancematrix/json?units=imperial&origins=" 
               + replaceFrom + "&destinations=" + replaceTo 
               + "&key=AIzaSyBudOwhhWwuPh1L7CQn4rZg9JAKIa0xNEc";
       return url;
    }
    
   //Obtains the JSON data and grabs the distance and duration given from the API
    public void getDeliveryInfo() throws IOException {
        JSONObject json = null;
        URL url;
        String miles;
        String duration;
        try {
            url = new URL(urlBuild(getZipFrom(), getZipTo()));
            JSONTokener t = new JSONTokener(url.openStream());
            json = new JSONObject(t);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Delivery.class.getName()).log(Level.SEVERE, null, ex);
        }
        duration = json.toString();
        miles = json.toString();
       
        setDuration(StringUtils.substringBetween(duration, "\"duration\":{\"text\":\"", "\","));
        //System.out.println(dur2);
       
        setDistance(StringUtils.substringBetween(miles, "\"distance\":{\"text\":\"", "\","));
        //System.out.println(mil2);
    }
}
