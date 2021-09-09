import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterisedEmailTesting {

    //Happy Test Scenario
    @ParameterizedTest
    @ValueSource(strings ={"abc@yahoo.com", "abc-100@yahoo.com" ,"abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net",
            "abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"})
    public void validateEmailList(String input){

        UserRegestration userRegestration = new UserRegestration();
        boolean actual = userRegestration.checkEmail(input);

        assertEquals(true,actual);

    }

    //Sad Case Scenario
    @ParameterizedTest
    @ValueSource(strings ={"abc","abc@.com.my","abc123@.com","abc123@.com.com",".abc@abc.com",
            "abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com",
            "abc@gmail.com.1a","abc@gmail.com.aa.au"})
    public void validateEmailListNegative(String input) {

        UserRegestration userRegestration = new UserRegestration();
        boolean actual = userRegestration.checkEmail(input);

        assertEquals(true, actual);

    }

}
