package Pages;

import Locators.MakeAppointmentLocators;
import Objects.Appointment;
import org.openqa.selenium.WebDriver;

import static Locators.MakeAppointmentLocators.*;

public class MakeAppointmentPage extends BasePage {

    public MakeAppointmentPage(WebDriver driver) {
        super(driver);
    }


    public void makeAppointment(Appointment appointment) {
        selectDropdownByVisibleText(DROPDOWN_FACILITY, appointment.getFacility());
        if (appointment.isHospitalReadmission()) {
            if (!isSelected(CHECKBOX_APPLY_HOSPITAL_READMISSION)) {
                click(CHECKBOX_APPLY_HOSPITAL_READMISSION);
            }
        }

        switch (appointment.getHealthcareProgram().toLowerCase()) {
            case "medicare":
                click(RADIO_MEDICARE);
                break;
            case "medicaid":
                click(RADIO_MEDICAID);
                break;
            case "none":
                click(RADIO_NONE);
                break;
        }

        setText(INPUT_VISIT_DATE, appointment.getVisitDate());
        setText(TEXT_COMMENT, appointment.getComment());
        click(BUTTON_BOOK_APPOINTMENT);
    }
}
