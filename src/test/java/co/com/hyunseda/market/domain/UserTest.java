package co.com.hyunseda.market.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
  * @author Libardo, Julio
 */

public class UserTest
{
    UserTest(){
    }
    
    @Test
    public void noParametrizedConstructor()
    {
        Long expectedUserId = null;
        String expectedFirstName = null;
        String expectedLastName = null;
        
        User objUser = new User();
        
        assertEquals(objUser.getUserId(),expectedUserId);
        assertEquals(objUser.getFirstName(),expectedFirstName);
        assertEquals(objUser.getLastName(),expectedLastName);
    }
    
    @Test
    public void ParametrizedConstructor()
    {
        Long expectedUserId = 5122L;
        String expectedFirstName = "Juan";
        String expectedLastName = "Lopez";
        
        User objUser = new User(expectedUserId, expectedFirstName, expectedLastName);
        
        assertEquals(objUser.getUserId(),expectedUserId);
        assertEquals(objUser.getFirstName(),expectedFirstName);
        assertEquals(objUser.getLastName(),expectedLastName);
    }
    
}