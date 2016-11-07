$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CucumberJava.feature");
formatter.feature({
  "line": 1,
  "name": "CcucumberJava",
  "description": "",
  "id": "ccucumberjava",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Amazon_Place_IPhone_Order",
  "description": "",
  "id": "ccucumberjava;amazon-place-iphone-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am a customer on Amazon",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for Iphone in Amazon",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I Select Iphone link in plp page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "see PIP Page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "select 3 qty in pip page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click add to cart button from pip page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Proceed checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "enter valid regsiter details to login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click delivery address",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePagestepdefn.I_have_open_the_browser()"
});
formatter.result({
  "duration": 5661914014,
  "status": "passed"
});
formatter.match({
  "location": "searchresultstedefn.I_search_for_Iphone_in_Amazon()"
});
formatter.result({
  "duration": 4317255126,
  "status": "passed"
});
formatter.match({
  "location": "searchresultstedefn.I_see_Products_listing_in_PLP_Page()"
});
formatter.result({
  "duration": 4050791371,
  "status": "passed"
});
formatter.match({
  "location": "PipPagestedefn.see_PIP_Page()"
});
formatter.result({
  "duration": 940389910,
  "status": "passed"
});
formatter.match({
  "location": "PipPagestedefn.select_qty_in_pip_page()"
});
formatter.result({
  "duration": 191519034,
  "status": "passed"
});
formatter.match({
  "location": "PipPagestedefn.i_click_add_to_cart_button_from_pip_page()"
});
formatter.result({
  "duration": 2141105923,
  "status": "passed"
});
formatter.match({
  "location": "PipPagestedefn.Proceed_checkout()"
});
formatter.result({
  "duration": 1656839906,
  "status": "passed"
});
formatter.match({
  "location": "LoginPagestepDefn.see_login_register_page()"
});
formatter.result({
  "duration": 638739840,
  "status": "passed"
});
formatter.match({
  "location": "LoginPagestepDefn.enter_valid_address_and_make_payment()"
});
formatter.result({
  "duration": 5209993449,
  "status": "passed"
});
});