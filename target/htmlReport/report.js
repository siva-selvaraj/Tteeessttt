$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/LoginFeature/Login.feature");
formatter.feature({
  "name": "To validate the login function",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to validate the login functionality with invalid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user should be in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.the_user_should_be_in_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user has to fill the username and password detail",
  "rows": [
    {
      "cells": [
        "agilan05@gmail.com",
        "785496321"
      ]
    },
    {
      "cells": [
        "surya045@gmail.com",
        "124578963"
      ]
    },
    {
      "cells": [
        "kadhir44@gmail.com",
        "124578977"
      ]
    },
    {
      "cells": [
        "naveen77@gmail.com",
        "124578978"
      ]
    },
    {
      "cells": [
        "santhana47859@gmail.com",
        "12457789963"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_fill_the_username_and_password_detail(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user has to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.the_user_has_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should navigate to invalid login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_user_should_navigate_to_invalid_login_page()"
});
formatter.result({
  "status": "passed"
});
});