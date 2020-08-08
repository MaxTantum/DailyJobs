$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "As a candidate I want a login page so that only authentic",
  "description": "candidate will be able to login",
  "id": "as-a-candidate-i-want-a-login-page-so-that-only-authentic",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Valid candidate should be able to login",
  "description": "",
  "id": "as-a-candidate-i-want-a-login-page-so-that-only-authentic;valid-candidate-should-be-able-to-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on daily.jobs site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"\u003cemail\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "as-a-candidate-i-want-a-login-page-so-that-only-authentic;valid-candidate-should-be-able-to-login;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 11,
      "id": "as-a-candidate-i-want-a-login-page-so-that-only-authentic;valid-candidate-should-be-able-to-login;;1"
    },
    {
      "cells": [
        "roustame4@gmail.com",
        "Qwerty7"
      ],
      "line": 12,
      "id": "as-a-candidate-i-want-a-login-page-so-that-only-authentic;valid-candidate-should-be-able-to-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Valid candidate should be able to login",
  "description": "",
  "id": "as-a-candidate-i-want-a-login-page-so-that-only-authentic;valid-candidate-should-be-able-to-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I am on daily.jobs site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter \"roustame4@gmail.com\" and \"Qwerty7\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_on_daily_jobs_site()"
});
formatter.result({
  "duration": 8929600900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "roustame4@gmail.com",
      "offset": 9
    },
    {
      "val": "Qwerty7",
      "offset": 35
    }
  ],
  "location": "LoginSteps.i_enter_and(String,String)"
});
formatter.result({
  "duration": 579153600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_Login_button()"
});
formatter.result({
  "duration": 82915600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_display()"
});
formatter.result({
  "duration": 4941535300,
  "status": "passed"
});
});