$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mobile-menu.feature");
formatter.feature({
  "line": 2,
  "name": "Menu feature",
  "description": "",
  "id": "menu-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@mobile"
    },
    {
      "line": 1,
      "name": "@mobile-regression"
    },
    {
      "line": 1,
      "name": "@menu"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify sidebar validation",
  "description": "",
  "id": "menu-feature;verify-sidebar-validation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@menu-1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I tap on skip button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I tap on menu button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify sidebar menu is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileMenuSD.clickOnSkipButton()"
});
formatter.result({
  "duration": 38851993913,
  "status": "passed"
});
formatter.match({
  "location": "MobileMenuSD.clickOnMenuButton()"
});
formatter.result({
  "duration": 30535267889,
  "status": "passed"
});
formatter.match({
  "location": "MobileMenuSD.verifySidebarMenu()"
});
formatter.result({
  "duration": 2795844493,
  "status": "passed"
});
});