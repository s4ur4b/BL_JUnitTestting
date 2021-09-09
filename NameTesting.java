import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTesting {
           UserRegestration userRegestration;

     @Before
     public void setup(){
         userRegestration = new UserRegestration();
     }

     //Happy Test Scenario
    @Test
    public void validateNameTest(){
            String sampleName = "Saurabh";

            UserRegestration userRegestration = new UserRegestration();
            boolean actual = userRegestration.checkName(sampleName);

            assertEquals(true,actual);
    }

    //Negative Test Scenario
    @Test(expected = AssertionError.class)
    public void validateNameTestNegative(){
            String sampleLastName = "SauRabh";

            UserRegestration userRegestration = new UserRegestration();
            boolean actual = userRegestration.checkName(sampleLastName);

            assertEquals(true,actual);
    }
}
