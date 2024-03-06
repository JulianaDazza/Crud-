package co.com.hyunseda.market.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
  * @author Libardo, Julio
 */

public class LocationTest
{
    LocationTest(){
    }
    
    @Test
    public void noParametrizedConstructorTest()
    {
        Location objLocation = new Location();
        int testLocationLatitud = 0;
        int testLocationLongitud = 0;
        
        assertEquals(objLocation.getLatitude(),testLocationLatitud);
        assertEquals(objLocation.getLongitude(),testLocationLongitud);
    }
    
    @Test
     public void ParametrizedConstructorTest()
    {
        Location objLocation = new Location();
        int testLocationLatitud = 15;
        int testLocationLongitud = 13;
        
        assertEquals(objLocation.getLatitude(),testLocationLatitud);
        assertEquals(objLocation.getLongitude(),testLocationLongitud);
    }
    
    
}