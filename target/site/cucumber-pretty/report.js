$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotels.feature");
formatter.feature({
  "line": 2,
  "name": "Hotels feature",
  "description": "",
  "id": "hotels-feature",
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
      "name": "@hotels"
    }
  ]
});
formatter.before({
  "duration": 11619906111,
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
  "name": "I am on Hotels Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelsSD.iAmOnHotelsHomePage()"
});
formatter.result({
  "duration": 1432287529,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "List of all of hotel within 10 miles radius of airport or downtown",
  "description": "",
  "id": "hotels-feature;list-of-all-of-hotel-within-10-miles-radius-of-airport-or-downtown",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@hotels-2"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I am on default locations search result screen",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "I verify system displays all hotels within 10 miles radius of airport",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I verify Hilton Hotel is within 10 miles radius of downtown",
  "keyword": "And "
});
formatter.match({
  "location": "HotelsSD.setCityTextField()"
});
formatter.result({
  "duration": 13498653582,
  "status": "passed"
});
formatter.match({
  "location": "HotelsSD.verifyDisplaysRadiusAirport()"
});
formatter.result({
  "duration": 7214668038,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hilton Hotel",
      "offset": 9
    }
  ],
  "location": "HotelsSD.verifyDisplaysRadiusDowntown(String)"
});
formatter.result({
  "duration": 10948707950,
  "error_message": "java.lang.AssertionError: System not displays all hotels within 10 miles radius of downtown expected [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:93)\n\tat org.testng.Assert.failNotEquals(Assert.java:512)\n\tat org.testng.Assert.assertTrue(Assert.java:41)\n\tat stepdefinition.HotelsSD.verifyDisplaysRadiusDowntown(HotelsSD.java:66)\n\tat ✽.And I verify Hilton Hotel is within 10 miles radius of downtown(hotels.feature:23)\n",
  "status": "failed"
});
formatter.after({
  "duration": 1382530990,
  "status": "passed"
});
});