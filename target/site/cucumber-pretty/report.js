$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("darksky.feature");
formatter.feature({
  "line": 2,
  "name": "Darksky feature",
  "description": "",
  "id": "darksky-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@darksky"
    }
  ]
});
formatter.before({
  "duration": 22931750550,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkskySD.iAmOnDarkskyHomePage()"
});
formatter.result({
  "duration": 1190049365,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify invalid signup error message",
  "description": "",
  "id": "darksky-feature;verify-invalid-signup-error-message",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@darksky-1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the darksky Register page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on Register button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I verify error message \"please fill out this field\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkskySD.iAmOnRegisterPage()"
});
formatter.result({
  "duration": 1230690972,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 236011157,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.iAmOnRegisterPageAfterClick()"
});
formatter.result({
  "duration": 26043320,
  "status": "passed"
});
formatter.after({
  "duration": 551493386,
  "status": "passed"
});
});