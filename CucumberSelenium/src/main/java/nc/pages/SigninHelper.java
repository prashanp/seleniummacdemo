package nc.pages;

import com.nc.SanveoBase;
import cucumber.api.java.ro.Si;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class SigninHelper extends SanveoBase {

    //private SigninPage SigninPageobject;

    SigninPage  signinPage = new SigninPage(driver);

    public void enterUserName(String txt) {
        signinPage.email.sendKeys(txt);
    }

    public void clickNextButton(){
        signinPage.NextButton.click();
    }
    /*
    public void clickNextButton() {
       (signinPage.NextButton).click();
    }*/

    public void enter_userid(String userid) {
        signinPage.enter_userid.sendKeys(userid);
    }
    /*
    public void enter_userid(String userid) {
       (SigninPage.enter_userid).sendKeys(userid);
    }*/

    public void enter_password(String passward){
        signinPage.enter_password.sendKeys(passward);
        System.out.println("ok");
    }

    /*
    public void enter_password(String password) {
       (SigninPage.enter_password).sendKeys(password);
    }*/

    public void enter_rollselrectionpa() {
        signinPage.rollselrection_pa.sendKeys("students");
    }
    /*
    public void enter_rollselrection_pa() {
       (SigninPage.rollselrection_pa).sendKeys("Students");
    } */

    //public void check_pagetitle(String title) {
    //    signinPage.checkPageTitle(title);
    //}
    /*
    public void check_pagetitle(String title) {
        SigninPageobject.checkPageTitle(title);
    }*/

    public void click_rollslrection_pa() {
        signinPage.rollselrection_pa.click();
    }
    /*
    public void click_rollselrection_pa() {
       (SigninPage.rollselrection_pa).click();
    }*/

    public void click_logsignin(){
        signinPage.logsignin.click();
    }
    /*
    public void click_logsignin() {
        //JavascriptExecutor je=(JavascriptExecutor) webDriver;
        //je.executeScript("arguments[0].scrollIntoView()",SigninPage.logsignin);
       (SigninPage.logsignin).click();
    }*/

    //public void get_currenturl(){
    //    signinPage.getCurrentUrl();
    //}
    /*
    public void get_currenturl() {
        SigninPageobject.getCurrentUrl();
    }*/

    public void click_background_revoke_no_radiobutton() {
        signinPage.background_revoke_no_radiobutton.click();
    }
    /*
    public void click_background_revoke_no_radiobutton() {
       (SigninPage.background_revoke_no_radiobutton).click();
    }*/

    public void click_background_felony_no_radiobutton() {
        signinPage.background_felony_no_radiobutton.click();
    }
    /*
    public void click_background_felony_no_radiobutton() {
       (SigninPage.background_felony_no_radiobutton).click();
    }*/

    public void click_background_mental_no_radiobutton() {
        signinPage.background_mental_no_radiobutton.click();
    }
    /*
    public void click_background_mental_no_radiobutton() {
       (SigninPage.background_mental_no_radiobutton).click();
    }*/

    public void click_background_accept_button() {
        signinPage.background_accept_button.click();
    }
    /*
    public void click_background_accept_button() {
       (SigninPage.background_accept_button).click();
    }*/

    public void click_important_notice_dialog() {
        signinPage.important_notice_dialog.click();
    }
    /*
    public void click_important_notice_dialog() {
       (SigninPage.important_notice_dialog).click();
    }*/

    public void click_important_notice_dialog_updateprofile() {
        signinPage.important_notice_dialog_updateprofile.click();
    }
    /*
    public void click_important_notice_dialog_updateprofile() {
       (SigninPage.important_notice_dialog_updateprofile).click();
    }*/

    public void click_important_notice_dialog_completeprofile() {
        signinPage.important_notice_dialog_completeprofile.click();
    }
    /*
    public void click_important_notice_dialog_completeprofile() {
       (SigninPage.important_notice_dialog_completeprofile).click();
    }*/

    public void click_important_notice_acknowledgeonly() {
        signinPage.important_notice_acknowledgeonly.click();
    }
    /*
    public void click_important_notice_acknowledgeonly() {
       (SigninPage.important_notice_acknowledgeonly).click();
    }*/

    public void Verifytext(String title) {
        signinPage.link_dashboard.getText();
    }
    /*
    public void Verifytext(String title) {
        (SigninPage.link_dashboard);
    }*/

    //public void clickable_code_signout() throws InterruptedException {
    //Thread.sleep(5000);
    //SigninPageobject.elementToBeClickable(SigninPage.code_signout);
    //public void clickable_code_signout() throws InterruptedException {
    //    	Thread.sleep(5000);
    //    	SigninPageobject.visibilityOf((WebElement)SigninPage.code_signout);
    //}

    public void visibility_code_signout() throws InterruptedException {
        Thread.sleep( 5000);
        if(signinPage.code_signout.isDisplayed())
            signinPage.code_signout.click();
    }
//
//    public void visibility_code_signout() throws InterruptedException {
//        Thread.sleep(5000);
//        SigninPageobject.visibilityOf((WebElement) SigninPage.code_signout);
//    }

    public void click_code_signout() {
    //    signinPage.code_signout();
    }

    public String Verify_pagetitle() {
        return signinPage.pagetitle.getText();
    }
    /*
    public void click_code_signout() {
        waitForExpectedElement(CommonPage.code_signout); }
    public String Verify_pagetitle() {
        return waitForExpectedElement(CommonPage.pagetitle).getText();
    }*/

    //public string get_pageTitle() {
    //    webdriver.getTitle();
    //}
    /*
    public String get_PageTitle() {
        return webDriver.getTitle();
    }*/

    public boolean checkVisibility_background_revoke_no_radiobutton() {
        return signinPage.background_revoke_no_radiobutton.isDisplayed();
    }
    /*
    public boolean checkVisibility_background_revoke_no_radiobutton() {
        return (SigninPage.background_revoke_no_radiobutton).isDisplayed();
    }*/

    public boolean checkVisibility_background_felony_no_radiobutton() {
        return signinPage.background_felony_no_radiobutton.isDisplayed();
    }
    /*
    public boolean checkVisibility_background_felony_no_radiobutton() {
        return (SigninPage.background_felony_no_radiobutton).isDisplayed();
    }*/

    public boolean checkVisibility_background_mental_no_radiobutton() {
        return signinPage.background_mental_no_radiobutton.isDisplayed();
    }
    /*
    public boolean checkVisibility_background_mental_no_radiobutton() {
        return (SigninPage.background_mental_no_radiobutton).isDisplayed();
    }*/

    public boolean checkVisibility_background_accept_button() {
        return signinPage.background_accept_button.isDisplayed();
    }
    /*
    public boolean checkVisibility_background_accept_button() {
        return (SigninPage.background_accept_button).isDisplayed();
    }*/

    public boolean checkVisibility_important_notice_acknowledge() {
        return signinPage.important_notice_acknowledge.isDisplayed();
    }
    /*
    public boolean checkVisibility_important_notice_acknowledge() {
        return (SigninPage.important_notice_acknowledge).isDisplayed();
    }*/

    public boolean checkVisibility_important_notice_dialog() {
        return signinPage.important_notice_dialog.isDisplayed();
    }
    /*
    public boolean checkVisibility_important_notice_dialog() {
        return (SigninPage.important_notice_dialog).isDisplayed();
    }*/

    public boolean checkVisibility_important_notice_dialog_updateprofile() {
        return signinPage.important_notice_dialog_updateprofile.isDisplayed();
    }
    /*
    public boolean checkVisibility_important_notice_dialog_updateprofile() {
        return (SigninPage.important_notice_dialog_updateprofile).isDisplayed();
    }*/

    public boolean checkVisibility_important_notice_dialog_completeprofil() {
        return signinPage.important_notice_dialog_completeprofile.isDisplayed();
    }
    /*
    public boolean checkVisibility_important_notice_dialog_completeprofile() {
        return (SigninPage.important_notice_dialog_completeprofile).isDisplayed();
    }*/

    public boolean checkVisibility_important_notice_acknowledgeonly() {
        return signinPage.important_notice_acknowledgeonly.isDisplayed();
    }
    /*
    public boolean checkVisibility_important_notice_acknowledgeonly() {
        return (SigninPage.important_notice_acknowledgeonly).isDisplayed();
    }*/

    public String get_CurrentUrl() {
      return   driver.getCurrentUrl();
    }
    /*
    public String get_CurrentUrl() {
        return webDriver.getCurrentUrl();
    }*/

    public void click_important_notice_dialog_deadline() {
        signinPage.important_notice_dialog_deadline.click();
    }
    /*
    public void click_important_notice_dialog_deadline() {
       (SigninPage.important_notice_dialog_deadline).click();
    }*/

    public void click_important_notice_acknowledge() {
        signinPage.important_notice_acknowledge.click();
    }
    /*
    public void click_important_notice_acknowledge() {
       (SigninPage.important_notice_acknowledge).click();
    }*/


}
