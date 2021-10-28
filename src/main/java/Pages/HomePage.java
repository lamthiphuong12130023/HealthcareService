package Pages;

import Locators.HomeLocators;
import org.openqa.selenium.WebDriver;

import static Locators.HomeLocators.BUTTON_MAKE_APPOINTMENT;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void clickMakeAppointment() {
        click(BUTTON_MAKE_APPOINTMENT);
    }
}
