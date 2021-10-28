package Pages;

import Locators.AppointmentConfirmationLocators;
import Objects.Appointment;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static Locators.AppointmentConfirmationLocators.*;

public class AppointmentConfirmationPage extends BasePage {

    public AppointmentConfirmationPage(WebDriver driver) {
        super(driver);
    }


    public Appointment getAppointmentInfo() {
        Appointment appointment = new Appointment();
        appointment.setFacility(getText(LABEL_FACILITY));
        String hospitalReadmission = getText(LABEL_APPLY_HOSPITAL_READMISSION);
        appointment.setHospitalReadmission(false);
        if (hospitalReadmission.equalsIgnoreCase("yes")) {
            appointment.setHospitalReadmission(true);
        }
        appointment.setHealthcareProgram(getText(LABEL_PROGRAM));
        appointment.setVisitDate(getText(LABEL_VISIT_DATE));
        appointment.setComment(getText(LABEL_COMMENT));
        return appointment;
    }

    public void compareAppointment(Appointment actual, Appointment expected) {
        Assert.assertEquals(actual.getFacility(), expected.getFacility());
        Assert.assertEquals(actual.isHospitalReadmission(), expected.isHospitalReadmission());
        Assert.assertEquals(actual.getHealthcareProgram(), expected.getHealthcareProgram());
        Assert.assertEquals(actual.getVisitDate(), expected.getVisitDate());
        Assert.assertEquals(actual.getComment(), expected.getComment());
    }
}
