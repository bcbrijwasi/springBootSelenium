$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/googleFeatures.feature");
formatter.feature({
  "name": "Google search feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "google search demo scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Load google page",
  "keyword": "When "
});
formatter.step({
  "name": "Wait for google page to load",
  "keyword": "And "
});
formatter.step({
  "name": "Search for \"\u003ckeyword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Wait for search result page to load",
  "keyword": "And "
});
formatter.step({
  "name": "Verify search result count is \u003cresult\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "keyword",
        "result"
      ]
    },
    {
      "cells": [
        "spring boot",
        "3"
      ]
    },
    {
      "cells": [
        "selenium",
        "77"
      ]
    }
  ]
});
formatter.scenario({
  "name": "google search demo scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Load google page",
  "keyword": "When "
});
formatter.match({
  "location": "com.spring.springBootSelenium.bdd.GoogleSteps.loadGooglePage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Wait for google page to load",
  "keyword": "And "
});
formatter.match({
  "location": "com.spring.springBootSelenium.bdd.GoogleSteps.waitForGooglePageToLoad()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Search for \"spring boot\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.spring.springBootSelenium.bdd.GoogleSteps.search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Wait for search result page to load",
  "keyword": "And "
});
formatter.match({
  "location": "com.spring.springBootSelenium.bdd.GoogleSteps.waitForSearchResultPageToLoad()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Verify search result count is 3",
  "keyword": "Then "
});
formatter.match({
  "location": "com.spring.springBootSelenium.bdd.GoogleSteps.verifySearchResultCount(int)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "google search demo scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Load google page",
  "keyword": "When "
});
formatter.match({
  "location": "com.spring.springBootSelenium.bdd.GoogleSteps.loadGooglePage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Wait for google page to load",
  "keyword": "And "
});
formatter.match({
  "location": "com.spring.springBootSelenium.bdd.GoogleSteps.waitForGooglePageToLoad()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Search for \"selenium\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.spring.springBootSelenium.bdd.GoogleSteps.search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Wait for search result page to load",
  "keyword": "And "
});
formatter.match({
  "location": "com.spring.springBootSelenium.bdd.GoogleSteps.waitForSearchResultPageToLoad()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Verify search result count is 77",
  "keyword": "Then "
});
formatter.match({
  "location": "com.spring.springBootSelenium.bdd.GoogleSteps.verifySearchResultCount(int)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Current search result found expected [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:99)\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\n\tat org.testng.Assert.assertTrue(Assert.java:45)\n\tat com.spring.springBootSelenium.bdd.GoogleSteps.verifySearchResultCount(GoogleSteps.java:28)\n\tat ✽.Verify search result count is 77(classpath:features/googleFeatures.feature:8)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "google search demo scenario");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});