import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmailTesting {
    UserRegestration userRegestration;

    @Before
    public void setup(){
        userRegestration = new UserRegestration();
    }

    //Happy Test Scenario
    @Test
    public void validateEmailTest(){
        String sampleEmail = "abc.xyz6@bl.co.in";

        UserRegestration userRegestration = new UserRegestration();
        boolean actual = userRegestration.checkEmail(sampleEmail);

        assertEquals(true,actual);
    }

    //Negative Test Scenario
    @Test(expected = AssertionError.class)
    public void validateEmailTestNegative(){
        String sampleEmail = "saurabhChavan@khj.354";

        UserRegestration userRegestration = new UserRegestration();
        boolean actual = userRegestration.checkEmail(sampleEmail);

        assertEquals(true,actual);
    }


}
