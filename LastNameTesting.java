import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastNameTesting {
    UserRegestration userRegestration;

    @Before
    public void setup(){
        userRegestration = new UserRegestration();
    }

    //Happy Test Scenario
    @Test
    public void validateLastNameTest(){
        String sampleLastName = "Chavan";

        UserRegestration userRegestration = new UserRegestration();
        boolean actual = userRegestration.checkLastName(sampleLastName);

        assertEquals(true,actual);
    }

    //Negative Test Scenario
    @Test(expected = AssertionError.class)
    public void validateLastNameTestNegative(){
        String sampleLastName = "ChaVan";

        UserRegestration userRegestration = new UserRegestration();
        boolean actual = userRegestration.checkName(sampleLastName);

        assertEquals(true,actual);
    }

}
