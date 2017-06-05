$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 2,
  "name": "Search Item Test",
  "description": "Description: This feature is used to search for Nikkon Camera that contains a string (D3X) in the header details \r\nafter sorting from highest price to lowest",
  "id": "search-item-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Successful Search",
  "description": "",
  "id": "search-item-test;successful-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User has to be on amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enters the search for nikkon",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Clicks on the search button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User is on the search result page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User can select highest to lowest on the sort dropdown menu",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User should click on the header details of the second item in the result displayed",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User can confirm if the details header contains a string",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Browser should close",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchSteps.user_has_to_be_on_amazon_home_page()"
});
formatter.result({
  "duration": 19580880417,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_enters_the_search_for_nikkon()"
});
formatter.result({
  "duration": 1482412780,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.clicks_on_the_search_button()"
});
formatter.result({
  "duration": 826018262,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_is_on_the_search_result_page()"
});
formatter.result({
  "duration": 3875451,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_can_select_highest_to_lowest_on_the_sort_dropdown_menu()"
});
formatter.result({
  "duration": 8170899336,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_should_click_on_the_header_details_of_the_second_item_in_the_result_displayed()"
});
formatter.result({
  "duration": 3445793553,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_can_confirm_if_the_details_header_contains_a_string()"
});
formatter.result({
  "duration": 4518047548,
  "error_message": "java.lang.AssertionError: The Expected Name is not in \nExpected: a string containing \"DX3\"\n     but: was \"Nikon D4S 16.2 MP CMOS FX Digital SLR with Full 1080p HD Video (Body Only)\"\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat org.junit.Assert.assertThat(Assert.java:956)\r\n\tat stepdefinition.SearchSteps.user_can_confirm_if_the_details_header_contains_a_string(SearchSteps.java:62)\r\n\tat ✽.Then User can confirm if the details header contains a string(search.feature:14)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SearchSteps.browser_should_close()"
});
formatter.result({
  "status": "skipped"
});
});