import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordTesting {
    UserRegestration userRegestration;

    @Before
    public void setup(){
        userRegestration = new UserRegestration();
    }

    //Happy Test Scenario
    @Test
    public void validateEmailTest(){
        String samplePassword = "abcXYZ@123";

        UserRegestration userRegestration = new UserRegestration();
        boolean actual = userRegestration.checkPassword(samplePassword);

        assertEquals(true,actual);
    }

    //Negative Test Scenario
    @Test(expected = AssertionError.class)
    public void validateEmailTestNegative(){
        String samplePassword = "abc.xyz6@bl.co.in";

        UserRegestration userRegestration = new UserRegestration();
        boolean actual = userRegestration.checkPassword(samplePassword);

        assertEquals(true,actual);
    }


}
