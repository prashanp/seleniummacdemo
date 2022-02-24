package ncCucumber.stepDefinitions;

import com.nc.SanveoBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ro.Si;
import nc.pages.SigninHelper;
import nc.pages.SigninPage;
import nc.util.PASql;
import nc.util.TestUtil;
import org.openqa.selenium.WebDriver;

import javax.xml.transform.Result;
import java.sql.ResultSet;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SigninSteps extends SanveoBase {
WebDriver driver;


    SigninHelper signpagehelper = new SigninHelper();

    @When("^i enter \"(.*?)\" (.*) on the Home Page$")
    public void i_enter_on_the_Home_Page(String pageToNavigate,String loginId) throws Throwable {
        if (pageToNavigate.equals("UserName")) {
            System.out.println(loginId);
            //String un=executesqlQuery(DBCall.testsql("a1"));
            //un = un.replaceAll("[\\[\\](){}]","");
            signpagehelper.enterUserName("1034225");
            System.out.println("1034225");
        }
    }

    @When("^i enter Insured \"(.*?)\" (.*) on the Home Page$")
    public void i_enter_Insured_User_on_the_Home_Page(String pageToNavigate,String loginId) throws Throwable {
        if (pageToNavigate.equals("UserName")) {
            System.out.println(loginId);
            //String un=executesqlQuery(DBCall.testsql("b1"));
            //un = un.replaceAll("[\\[\\](){}]","");
            //Reporter.log("Username="+un);
            signpagehelper.enterUserName("1034225");
            System.out.println("1034225");

        }
    }

    @When("^i click on \"(.*?)\" button$")
    public void i_click_on_the_Next_Button(String pageToNavigate) throws Throwable {
        if (pageToNavigate.equals("Next")) {
            signpagehelper.clickNextButton();
        }
    }



    @When("^I run query \"([^\"]*)\" (.*) to get list of users in record set$")
    public void I_run_query_to_get_list_of_users_in_record_set(String pageToNavigate, String loginId) throws Throwable {
        //executesqlQuery(DBCall.testsql("a1"));
        //System.out.println(executesqlQuery(DBCall.testsql("a1")));

        //executesqlQuery(DBCall.testInsuredsql(loginId));
        //System.out.println(executesqlQuery(DBCall.testInsuredsql(loginId)));

    }

    @Given("^Go to nccpa sign in page$")
    public void Go_to_nccpa_signin_page() throws Throwable

    {
         driver = initialization();
    }

    //@When("^User is in signin page$")
    //public void User_is_in_signin_page() throws Throwable {
    // 	commonpagehelper.check_pagetitle("NCCPA: Sign In");
    //}

    @When("^User is in signin page$")
    public void User_is_in_signin_page() throws Throwable {
        //String actualTitle=commonpagehelper.Verify_pagetitle();
        //LOG.info("Testing :" +commonpagehelper.Verify_pagetitle());
        //assertThat(actualTitle.equalsIgnoreCase("Sign in"));
        //String Title= signpagehelper.get_PageTitle();
        //LOG.info("TestingPageTitle :" +signpagehelper.get_PageTitle());
        //assertThat(Title.equalsIgnoreCase("NCCPA: Sign In"));
        Thread.sleep(5000);

    }


    @Then("^User should see the role from the select role dropdown list$")
    public void User_should_see_the_role() throws Throwable {
        Thread.sleep(5000);
        //signpagehelper.enter_rollselrectionpa.click();
        //signpagehelper.enter_rollselrection_pa();
    }

    @Then("^Enters a valid userid \"([^\"]*)\"$")
    public void Enters_a_valid_userid(String userid) throws Throwable
    {
        //String paid = executesqlQuery(DBCall.querryexecuter("cm"));
        //String un = paid.replaceAll("[\\[\\](){}]","");
        //System.out.println(un);
        //Reporter.log("Userid="+un);
        ResultSet data = TestUtil.SqlConnection(PASql.querryexecuter(userid));
        while (data.next()){
            System.out.println(data.getString(1));
            new SigninPage(driver).enter_userid(data.getString(1));
        }
    }

    @Then("^Enters a valid password \"([^\"]*)\"$")
    public void Enters_a_valid_password(String password) throws Throwable
    {
        new SigninPage(driver).enter_password(password);
    }

    @Then("^Click on Signin button$")
    public void Click_on_Signin_button() throws Throwable
    {
        new SigninPage(driver).click_logsignin();
        Thread.sleep(5000);
    }

    @Then("^Check background Questions$")
    public void Check_background_Questions() throws Throwable {
        try {
            System.out.println("Checking for Background Questions: ");
            String url = signpagehelper.get_CurrentUrl();

            if (url.contains("Background")) {
                Thread.sleep(1000);
                try {
                    if (signpagehelper.checkVisibility_background_revoke_no_radiobutton()) {
                        System.out.println("Background Questions: No to License Revoked");
                        signpagehelper.click_background_revoke_no_radiobutton();
                    }
                    if (signpagehelper.checkVisibility_background_felony_no_radiobutton()) {
                        System.out.println("Background Questions: No to Convicted Felon");
                        signpagehelper.click_background_felony_no_radiobutton();

                    }
                    if (signpagehelper.checkVisibility_background_mental_no_radiobutton()) {
                        System.out.println("Background Questions: No to Mentally Incompetent");
                        signpagehelper.click_background_mental_no_radiobutton();
                    }
                    if (signpagehelper.checkVisibility_background_accept_button()) {
                        System.out.println("Background Questions: Submitted");
                        signpagehelper.click_background_accept_button();
                    }
                } catch (Exception e) {
                }
            } else {
                System.out.println("Background Questions not found.");
            }
        } catch (Exception e) {
        }
    }


    @Then("^validate login is successful$")
    public void validate_login_is_successful() throws Throwable
    {
        //commonpagehelper.check_pagetitle("NCCPA: Dashboard");
    }

    /*
    @Then("^Check Important Notice Dialog$")
    public void Check_Important_Notice_Dialog() throws Throwable
    {
             try{
                 System.out.println("Check Important Notice Dialog: ");
                 commonpagehelper.click_important_notice_dialog();
                 commonpagehelper.click_important_notice_dialog_updateprofile();
                 commonpagehelper.click_important_notice_dialog_completeprofile();
                 commonpagehelper.click_important_notice_acknowledgeonly();

             }
             catch(Exception e)
             {
                 System.out.println("Error Found"+e);
             }
    }*/

    @Then("^Check Important Notice Dialogs$")
    public void Check_Important_Notice_Dialogs() throws Throwable
    {
        SigninPage signinPage = new SigninPage(driver);
        if(signinPage.checkVisibility_important_notice_dialog()){
            signinPage.click_important_notice_acknowledge();
        }


    }

    @Then("^Check Important Notice Dialog$")
    public void Check_Important_Notice_Dialog() throws Throwable
    {

        SigninPage signinPage = new SigninPage(driver);
        try{

            //if(commonpagehelper.checkVisibility_important_notice_acknowledge())
            if(signinPage.checkVisibility_important_notice_dialog());

            {
//                boolean ex=signinPage.checkVisibility_important_notice_dialog();
//                {
//                    if (ex==true)
//                    {
//                        System.out.println("deadline found");
//                        signinPage.click_important_notice_dialog_deadline();
//                    }
//                }
                boolean ec=signinPage.checkVisibility_important_notice_dialog_updateprofile();
                {
                    if (ec==true)
                    {
                        System.out.println("update profile found");
                        signinPage.click_important_notice_dialog_updateprofile();

                        System.out.println("acknowledge button 1 found");
                        signinPage.click_important_notice_acknowledge();
                        Thread.sleep(1000);

                    }
                }
                boolean eg=signinPage.checkVisibility_important_notice_dialog_completeprofil();
                {
                    if (eg==true)
                    {
                        System.out.println("third checkbox profile found");
                        signinPage.click_important_notice_dialog_completeprofile();
                    }
                }

                boolean ext=signinPage.checkVisibility_important_notice_acknowledge();
                {
                    if (ext==true)
                    {
                        System.out.println("acknowledge button 1 found");
                        Thread.sleep(1000);
                        signinPage.click_important_notice_acknowledge();
                        Thread.sleep(1000);
                    }
                    else
                    {
                        boolean exl=signinPage.checkVisibility_important_notice_acknowledgeonly();

                        {
                            if (exl==true)
                            {
                                System.out.println("acknowledge button 0 found");
                                signinPage.click_important_notice_acknowledgeonly();
                                Thread.sleep(1000);
                            }
                        }
                    }
                }
            }
            Thread.sleep(2000);
        } catch (Exception error) {}
    }

    @Then("^Dashboard menu item dispaly is display$")
    public void Dashboard_menu_item_dispaly() throws Throwable
    {
        //    commonpagehelper.Verifytext("Dashboard");
        //String Title=signpagehelper.get_PageTitle();
        //LOG.info("TestingPageTitle :" +signpagehelper.get_PageTitle());
        //assertThat(Title.equalsIgnoreCase("NCCPA: Dashboard"));
    }

    @Then("^Verify the signout button is visible$")
    public void Verify_the_signout_button_is_visible() throws Throwable
    {
        new SigninPage(driver).visibility_code_signout();

        //commonpageobject.elementToBeClickable(CommonPage.code_signout)
    }

    @Then("^Clicks on signout to leave the Dashboard page$")
    public void Clicks_on_signout_to_leave_the_Dashboard_page() throws Throwable
    {

        signpagehelper.click_code_signout();
    }

    @Then("^Verifies the signout is successful$")
    public void Verifies_the_signout_is_successful() throws Throwable
    {

       assertThat(new SigninPage(driver).Verifytext(),is("NCCPA: Sign In"));
        System.out.println("ok");
    }
}
