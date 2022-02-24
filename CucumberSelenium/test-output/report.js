$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/SeleniumCucumber/CucumberSelenium/src/main/java/ncCucumber/features/Signin.feature");
formatter.feature({
  "line": 1,
  "name": "Sign in feature",
  "description": "",
  "id": "sign-in-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "SIGNIN : ##0001: Sign In / Sign Out",
  "description": "",
  "id": "sign-in-feature;signin-:-##0001:-sign-in-/-sign-out",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User should see the role from the select role dropdown list",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enters a valid userid \"\u003cuserid\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enters a valid password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Signin button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Check background Questions",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "validate login is successful",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Check Important Notice Dialog",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Dashboard menu item dispaly is display",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify the signout button is visible",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Clicks on signout to leave the Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verifies the signout is successful",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "sign-in-feature;signin-:-##0001:-sign-in-/-sign-out;",
  "rows": [
    {
      "cells": [
        "role",
        "userid",
        "password",
        "test"
      ],
      "line": 21,
      "id": "sign-in-feature;signin-:-##0001:-sign-in-/-sign-out;;1"
    },
    {
      "cells": [
        "Portal (1)",
        "cm",
        "Password1*",
        "1015"
      ],
      "line": 22,
      "id": "sign-in-feature;signin-:-##0001:-sign-in-/-sign-out;;2"
    },
    {
      "cells": [
        "Portal (2)",
        "cr",
        "Password1*",
        "1016"
      ],
      "line": 23,
      "id": "sign-in-feature;signin-:-##0001:-sign-in-/-sign-out;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2712091900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Go to nccpa sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is in signin page",
  "keyword": "When "
});
formatter.match({
  "location": "SigninSteps.Go_to_nccpa_signin_page()"
});
formatter.result({
  "duration": 2179348200,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.User_is_in_signin_page()"
});
formatter.result({
  "duration": 5011191300,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "SIGNIN : ##0001: Sign In / Sign Out",
  "description": "",
  "id": "sign-in-feature;signin-:-##0001:-sign-in-/-sign-out;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User should see the role from the select role dropdown list",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enters a valid userid \"cm\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enters a valid password \"Password1*\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Signin button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Check background Questions",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "validate login is successful",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Check Important Notice Dialog",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Dashboard menu item dispaly is display",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify the signout button is visible",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Clicks on signout to leave the Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verifies the signout is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninSteps.User_should_see_the_role()"
});
formatter.result({
  "duration": 5008971300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cm",
      "offset": 23
    }
  ],
  "location": "SigninSteps.Enters_a_valid_userid(String)"
});
formatter.result({
  "duration": 896284900,
  "error_message": "java.lang.NullPointerException\r\n\tat nc.pages.SigninHelper.enter_userid(SigninHelper.java:29)\r\n\tat ncCucumber.stepDefinitions.SigninSteps.Enters_a_valid_userid(SigninSteps.java:104)\r\n\tat ✽.And Enters a valid userid \"cm\"(C:/SeleniumCucumber/CucumberSelenium/src/main/java/ncCucumber/features/Signin.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password1*",
      "offset": 25
    }
  ],
  "location": "SigninSteps.Enters_a_valid_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Click_on_Signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Check_background_Questions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.validate_login_is_successful()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Check_Important_Notice_Dialog()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Dashboard_menu_item_dispaly()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Verify_the_signout_button_is_visible(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Clicks_on_signout_to_leave_the_Dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Verifies_the_signout_is_successful()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 564336600,
  "status": "passed"
});
formatter.before({
  "duration": 2094189500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Go to nccpa sign in page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is in signin page",
  "keyword": "When "
});
formatter.match({
  "location": "SigninSteps.Go_to_nccpa_signin_page()"
});
formatter.result({
  "duration": 2079701600,
  "status": "passed"
});
formatter.match({
  "location": "SigninSteps.User_is_in_signin_page()"
});
formatter.result({
  "duration": 5000297700,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "SIGNIN : ##0001: Sign In / Sign Out",
  "description": "",
  "id": "sign-in-feature;signin-:-##0001:-sign-in-/-sign-out;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User should see the role from the select role dropdown list",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enters a valid userid \"cr\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enters a valid password \"Password1*\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Signin button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Check background Questions",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "validate login is successful",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Check Important Notice Dialog",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Dashboard menu item dispaly is display",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify the signout button is visible",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Clicks on signout to leave the Dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verifies the signout is successful",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninSteps.User_should_see_the_role()"
});
formatter.result({
  "duration": 5001275800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cr",
      "offset": 23
    }
  ],
  "location": "SigninSteps.Enters_a_valid_userid(String)"
});
formatter.result({
  "duration": 231404400,
  "error_message": "java.lang.NullPointerException\r\n\tat nc.pages.SigninHelper.enter_userid(SigninHelper.java:29)\r\n\tat ncCucumber.stepDefinitions.SigninSteps.Enters_a_valid_userid(SigninSteps.java:104)\r\n\tat ✽.And Enters a valid userid \"cr\"(C:/SeleniumCucumber/CucumberSelenium/src/main/java/ncCucumber/features/Signin.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password1*",
      "offset": 25
    }
  ],
  "location": "SigninSteps.Enters_a_valid_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Click_on_Signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Check_background_Questions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.validate_login_is_successful()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Check_Important_Notice_Dialog()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Dashboard_menu_item_dispaly()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Verify_the_signout_button_is_visible(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Clicks_on_signout_to_leave_the_Dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninSteps.Verifies_the_signout_is_successful()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 574568700,
  "status": "passed"
});
});