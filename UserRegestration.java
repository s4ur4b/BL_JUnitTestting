import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//This is a User Resgistration Problem where the code needs to ensure that all the validations are in place during user entry

//Created a class for validation
public class UserRegestration {
        Scanner scan = new Scanner(System.in);

    public boolean checkName(String name){

        String nameRegex = "^[A-Z]{1}[a-z]{2,15}$";

        Pattern pattern = Pattern.compile(nameRegex);

        Matcher matcher = pattern.matcher(name);

       return matcher.matches();

    }

    public boolean checkLastName(String lastName){

        String nameRegex = "^[A-Z]{1}[a-z]{2,15}$";

        Pattern pattern = Pattern.compile(nameRegex);

        Matcher matcher = pattern.matcher(lastName);

        return matcher.matches();
    }

    public boolean checkEmail(String email) {

        String emailRegex = "^[a-zA-Z0-9]+.[a-zA-Z0-9+_-]+@[a-zA-Z0-9+_-]+.[a-z]+.[a-z]+$";
//        String emailRegex = "^[a-zA-Z0-9]+.[a-zA-Z0-9+_-]+@[a-zA-Z0-9+_-]+.[a-z.]+$";

        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    void checkPhone() {
        System.out.println("Enter Your phone number");
        String phoneNo = scan.next();

        String Regex = "^[91]{2}\\s[0-9]{10}$";

        boolean result = phoneNo.matches(Regex);
        if (result) {
            System.out.println("Given phone number is valid");
        } else {
            System.out.println("Given phone number is not valid");
        }
    }

    public boolean checkPassword(String password) {

        String Regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!#%*?&])[A-Za-z\\d@$!#%*?&]{8,}$";

        boolean result = password.matches(Regex);
       return result;
    }

}
