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
  "duration": 14190735399,
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
  "duration": 798329429,
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
  "duration": 854676777,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 92949267,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.iAmOnRegisterPageAfterClick()"
});
formatter.result({
  "duration": 6208822,
  "status": "passed"
});
formatter.after({
  "duration": 420952554,
  "status": "passed"
});
formatter.before({
  "duration": 6914243353,
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
  "duration": 53567642,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify Current Temperature should not be greater or less than",
  "description": "        the Temperature from Daily Timeline",
  "id": "darksky-feature;verify-current-temperature-should-not-be-greater-or-less-than",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@darksky-2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I verify current temp is not greater or less then temps from daily timeline",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkskySD.iAmOnDarkskyHomePage()"
});
formatter.result({
  "duration": 91496184,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.verifyCurrentTemp()"
});
formatter.result({
  "duration": 216519640,
  "status": "passed"
});
formatter.after({
  "duration": 610933070,
  "status": "passed"
});
formatter.before({
  "duration": 5446789767,
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
  "duration": 50133003,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify individual day temp timeline",
  "description": "",
  "id": "darksky-feature;verify-individual-day-temp-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@darksky-3"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I expand todays timeline",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I verify lowest and highest temp is displayed correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkskySD.iAmOnDarkskyHomePage()"
});
formatter.result({
  "duration": 81472495,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.clickOnTodaysTimeline()"
});
formatter.result({
  "duration": 636005098,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.lowHighTempDispelCorrect()"
});
formatter.result({
  "duration": 127531856,
  "status": "passed"
});
formatter.after({
  "duration": 510495427,
  "status": "passed"
});
formatter.before({
  "duration": 6300674463,
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
  "duration": 47005188,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Verify timline is displayed in correct format",
  "description": "",
  "id": "darksky-feature;verify-timline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@darksky-4"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "I am on Darksky Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I verify timeline is displayed with two hours incremented",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkskySD.iAmOnDarkskyHomePage()"
});
formatter.result({
  "duration": 94670632,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.timelineDisplayedTwoHours()"
});
formatter.result({
  "duration": 666341126,
  "status": "passed"
});
formatter.after({
  "duration": 515425766,
  "status": "passed"
});
});