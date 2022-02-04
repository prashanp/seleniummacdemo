$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/various/eclipse-workspace/CucumberSelenium/src/main/java/sanveoCucumber/features/LoginPage.feature");
formatter.feature({
  "line": 1,
  "name": "As a user i should be able to login into the application",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-login-into-the-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "As a user I am able to login into the application with my credentials",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-login-into-the-application;as-a-user-i-am-able-to-login-into-the-application-with-my-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "URL of the application should be open.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The user navigates to the login page.",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The user enters his credentials username - \"hammamiehfiras34@gmail.com\" and Password - \"Firas@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "The user should be logged in.",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.url_of_the_application_should_be_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.the_user_navigates_to_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "hammamiehfiras34@gmail.com",
      "offset": 44
    },
    {
      "val": "Firas@123",
      "offset": 88
    }
  ],
  "location": "LoginPageSteps.the_user_enters_his_credentials_username_and_Password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.the_user_should_be_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "As a user I am not able to login into the application with my credentials",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-login-into-the-application;as-a-user-i-am-not-able-to-login-into-the-application-with-my-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "URL of the application should be open.",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "The user navigates to the login page.",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "The user enters his credentials username - \"smith\" and Password - \"Random\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "The user should be logged in.",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.url_of_the_application_should_be_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.the_user_navigates_to_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "smith",
      "offset": 44
    },
    {
      "val": "Random",
      "offset": 67
    }
  ],
  "location": "LoginPageSteps.the_user_enters_his_credentials_username_and_Password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.the_user_should_be_logged_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 19,
  "name": "As a user I am not able to login into the application with my credentials",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-login-into-the-application;as-a-user-i-am-not-able-to-login-into-the-application-with-my-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "URL of the application should be open.",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "The user navigates to the login page.",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "The user enters his credentials username - \"hammamiehfiras34@gmail.com\" and Password - \"Random\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "The user should be logged in.",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.url_of_the_application_should_be_open()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.the_user_navigates_to_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "hammamiehfiras34@gmail.com",
      "offset": 44
    },
    {
      "val": "Random",
      "offset": 88
    }
  ],
  "location": "LoginPageSteps.the_user_enters_his_credentials_username_and_Password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPageSteps.the_user_should_be_logged_in()"
});
formatter.result({
  "status": "skipped"
});
});