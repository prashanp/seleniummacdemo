package nc.pages;

import com.nc.SanveoBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage extends SanveoBase {

//    public static By email = By.xpath("//input[@id='identifierId']");
//    public static By NextButton = By.cssSelector("#identifierNext > div > button > span");

    //public static By rollselrection_pa = By.id("providerName");
    //public static By enter_userid = By.id("tbUserId");
    //public static By enter_password = By.id("tbPass");
    //public static By logsignin = By.id("btnSignIn");
    //public static By background_revoke_no_radiobutton = By.id("ctl00_Content_rdoRevokedNo");
    //public static By background_felony_no_radiobutton = By.id("ctl00_Content_rdoFelonyNo");
    //public static By background_mental_no_radiobutton = By.id("ctl00_Content_rdoMentalNo");
    //public static By background_accept_button = By.id("ctl00_Content_btnAccept");
    //public static By important_notice_dialog = By.id("notificationdialog");
    //public static By important_notice_dialog_deadline = By.id("cb_notification_0");
    //public static By important_notice_dialog_updateprofile = By.xpath("//*[@id='cb_notification_1']");
    //public static By important_notice_dialog_completeprofile = By.cssSelector("[id='cb_notification_2']");
    //public static By important_notice_acknowledge = By.cssSelector("[id='btn_Primary_1']");//xpath("//*[@id='btn_Primary_1']");  //button[@id='btn_Primary_1']");
    //public static By important_notice_acknowledgeonly = By.xpath("//button[@id='btn_Primary_0']");
    //public static By link_dashboard = By.id("home");
    //public static By code_signout = By.cssSelector("[id='lnkHeaderSignOut']");
    //public static By pagetitle=By.xpath("//div/h1/span");
WebDriver driver;

    public SigninPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='identifierId']")
    WebElement email;

    @FindBy(css = "#identifierNext > div > button > span")
    WebElement NextButton;

    @FindBy(id = "providerName")
    WebElement rollselrection_pa;

    @FindBy(id = "tbUserId")
    WebElement enter_userid;

    @FindBy(id = "tbPass")
    WebElement enter_password;

    @FindBy(id = "btnSignIn")
    WebElement logsignin;

    @FindBy(id = "ctl00_Content_rdoRevokedNo")
    WebElement background_revoke_no_radiobutton;

    @FindBy(id = "ctl00_Content_rdoFelonyNo")
    WebElement background_felony_no_radiobutton;

    @FindBy(id = "ctl00_Content_rdoMentalNo")
    WebElement background_mental_no_radiobutton;

    @FindBy(id = "ctl00_Content_btnAccept")
    WebElement background_accept_button;

    @FindBy(id = "notificationdialog")
    WebElement important_notice_dialog;

    @FindBy(id = "cb_notification_0")
    WebElement important_notice_dialog_deadline;

    @FindBy(xpath = "//*[@id='cb_notification_1']")
    WebElement important_notice_dialog_updateprofile;

    @FindBy(css = "[id='cb_notification_2']")
    WebElement important_notice_dialog_completeprofile;

    @FindBy(css = "[id='btn_Primary_1']")
    WebElement important_notice_acknowledge;

    @FindBy(xpath = "//button[@id='btn_Primary_0']")
    WebElement important_notice_acknowledgeonly;

    @FindBy(id = "app")
    WebElement link_dashboard;

    @FindBy(css = "[id='lnkHeaderSignOut']")
    WebElement code_signout;

    @FindBy(xpath = "//div/h1/span")
    WebElement pagetitle;

    public void enter_userid(String userid) {
        enter_userid.sendKeys(userid);
        System.out.println("ok");
    }

    public void enter_password(String passward){
     enter_password.sendKeys(passward);
    }

    public void click_logsignin(){
        logsignin.click();

    }


    public boolean checkVisibility_important_notice_dialog() {
        return important_notice_dialog.isDisplayed();

    }

    public void click_important_notice_dialog_deadline() {
        important_notice_dialog_deadline.click();
    }

    public boolean checkVisibility_important_notice_dialog_updateprofile() {
        return important_notice_dialog_updateprofile.isDisplayed();
    }

    public void click_important_notice_dialog_updateprofile() {
        important_notice_dialog_updateprofile.click();
    }

    public void click_important_notice_acknowledge() {
        important_notice_acknowledge.click();
    }

    public void click_important_notice_acknowledgeonly() {
        important_notice_acknowledgeonly.click();
    }

    public boolean checkVisibility_important_notice_acknowledgeonly() {
        return important_notice_acknowledgeonly.isDisplayed();
    }

    public boolean checkVisibility_important_notice_acknowledge() {
        return important_notice_acknowledge.isDisplayed();
    }

    public void click_important_notice_dialog_completeprofile() {
        important_notice_dialog_completeprofile.click();
    }

    public boolean checkVisibility_important_notice_dialog_completeprofil() {
        return important_notice_dialog_completeprofile.isDisplayed();
    }

    public void visibility_code_signout() throws InterruptedException {
        Thread.sleep( 5000);
        if(code_signout.isDisplayed())
            code_signout.click();
    }

    public String Verifytext() {
     return   driver.getTitle();
//        link_dashboard.getText();
    }
}
