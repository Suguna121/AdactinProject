$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/AdactinLogin.feature");
formatter.feature({
  "name": "To book the hotel from AdactinHotel app and then get the order id",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "To book a hotel from Adactin hotel app",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_in_adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid username and password and click login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userEnterValidUsernameAndPasswordAndClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select location, hotels, room type, number of rooms, Indate, Outdate, adult room, child room and click search button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userSelectLocationHotelsRoomTypeNumberOfRoomsIndateOutdateAdultRoomChildRoomAndClickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select radio button and click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userSelectRadioButtonAndClickContinueButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter first name, last name, address, creditcard number, creditcard type, month, year, cvv number and click booknow button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userEnterFirstNameLastNameAddressCreditcardNumberCreditcardTypeMonthYearCvvNumberAndClickBooknowButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User must get the order id",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.userMustGetTheOrderId()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});