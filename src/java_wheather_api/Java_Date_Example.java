
package java_wheather_api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Java_Date_Example {

    public static void main(String[] args) {
        
        long unix_seconds = 1485794875;
        
        Date date = new Date(unix_seconds*1000L);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss z ");
        
        sdf.setTimeZone(TimeZone.getTimeZone("GMT-5.30"));
        String final_date = sdf.format(date);
        
        System.out.println("\n"+final_date+"\n");
        
    }

    
}
