package Utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class FakersGenerator {

    private Faker faker;
    private String firstName;
    private String lastName;
    private String zipCode;
    private String email;
    private String firstNameAddress;
    private String numCellPhone;
    private String numPhone;


    public FakersGenerator(WebDriver driver){

        faker = new Faker(new Locale("pt-BR"));

    }

    public String getFirstName(){

        firstName = faker.name().firstName();
        return firstName;

    }

    public String getLastName(){

        lastName = faker.name().lastName();
        return lastName;
    }

    public String getZipCode(){

        zipCode = faker.address().zipCode();
        return zipCode;
    }
    public String getEmail(){

        email = faker.internet().emailAddress();
        return email;
    }

    public String getFirstNameAddress(){

        firstNameAddress = faker.address().firstName();
        return firstNameAddress;

    }

    public String getNumCellPhone(){

        numCellPhone = faker.phoneNumber().cellPhone();
        return numCellPhone;

    }

    public String getNumPhone(){

        numPhone = faker.phoneNumber().phoneNumber();
        return numPhone;
    }
}
