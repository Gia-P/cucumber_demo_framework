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
  "duration": 9958321210,
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
  "duration": 1024982366,
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
  "duration": 31285741,
  "status": "passed"
});
formatter.match({
  "location": "DarkskySD.verifyCurrentTemp()"
});
formatter.result({
  "duration": 645450529,
  "status": "passed"
});
formatter.after({
  "duration": 655771088,
  "status": "passed"
});
});