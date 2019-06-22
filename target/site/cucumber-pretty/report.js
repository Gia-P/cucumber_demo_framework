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
  "duration": 15867827853,
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
  "duration": 1029715024,
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
  "name": "I enter city into search text field on home screen",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I verify city\u0027s time zone",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I verify timeline is displayed with two hours incremented",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkskySD.iAmOnDarkskyHomePage()"
});
formatter.result({
  "duration": 29081723,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.setCityTextField()"
});
formatter.result({
  "duration": 350918206,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.timezone()"
});
formatter.result({
  "duration": 126965,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.timelineDisplayedTwoHours()"
});
formatter.result({
  "duration": 1747003002,
  "status": "passed"
});
formatter.after({
  "duration": 409754982,
  "status": "passed"
});
});