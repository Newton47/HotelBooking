$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotelBooking.feature");
formatter.feature({
  "line": 1,
  "name": "Hotelbooking login",
  "description": "",
  "id": "hotelbooking-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful homepage login and validation",
  "description": "",
  "id": "hotelbooking-login;successful-homepage-login-and-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launches the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User validates the title of the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "User clicks on the Login button without entering username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User verifies username error message is thrown",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User enters the username",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "clicks on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User verifies password error message is thrown",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User enter the password",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "clicks on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the user is successfully logged into HotelBookingForm page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User validates error by clicking the ConfirmBooking button without entering firstName",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User enters the firstName",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User validates error on clicking the ConfirmBooking button without entering lastName",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User enters the lastName",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User validates error on clicking the ConfirmBooking button entering improper email",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User enter proper email",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User validates error on clicking the ConfirmBooking button without entering mobile number",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User validates error on clicking the ConfirmBooking button entering improper mobile number",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User enters the mobile number",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "User enters address",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User clicks on ConfirmBooking button without entering city page throws error",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User enters city",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User clicks on ConfirmBooking button without entering state page throws error",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User enters state",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User enters number of guests",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "User clicks on ConfirmBooking button without entering card holder name page throws error",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "User enters card holder name",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "User clicks on ConfirmBooking button without entering debit card number page throws error",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User enters debit card number",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User enters CVV",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "User clicks on ConfirmBooking button without entering expiration month page throws error",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "User enters expiration month",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "User clicks on ConfirmBooking button without entering expiration year page throws error",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "User enters expiration year",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "User clicks on ConfirmBooking button",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "the BookingComplete is verified",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepDef.user_launches_the_browser()"
});
formatter.result({
  "duration": 7384770985,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_validates_the_title_of_the_home_page()"
});
formatter.result({
  "duration": 130091060,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_clicks_on_the_Login_button_without_entering_username()"
});
formatter.result({
  "duration": 70379444,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_verifies_username_error_message_is_thrown()"
});
formatter.result({
  "duration": 49642075,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_enters_the_username()"
});
formatter.result({
  "duration": 120384171,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.clicks_on_the_Login_button()"
});
formatter.result({
  "duration": 113406995,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_verifies_password_error_message_is_thrown()"
});
formatter.result({
  "duration": 55652324,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.user_enter_the_password()"
});
formatter.result({
  "duration": 81293602,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.clicks_on_the_Login_button()"
});
formatter.result({
  "duration": 126131840,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDef.the_user_is_successfully_logged_into_HotelBookingForm_page()"
});
formatter.result({
  "duration": 36350,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_validates_error_by_clicking_the_ConfirmBooking_button_without_entering_firstName()"
});
formatter.result({
  "duration": 128143952,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enters_the_firstName()"
});
formatter.result({
  "duration": 104536168,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_validates_error_on_clicking_the_ConfirmBooking_button_without_entering_lastName()"
});
formatter.result({
  "duration": 77343362,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enters_the_lastName()"
});
formatter.result({
  "duration": 110507929,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_validates_error_on_clicking_the_ConfirmBooking_button_entering_improper_email()"
});
formatter.result({
  "duration": 4378259098,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enter_proper_email()"
});
formatter.result({
  "duration": 323108839,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_validates_error_on_clicking_the_ConfirmBooking_button_without_entering_mobile_number()"
});
formatter.result({
  "duration": 2175056312,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_validates_error_on_clicking_the_ConfirmBooking_button_entering_improper_mobile_number()"
});
formatter.result({
  "duration": 8788895878,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enters_the_mobile_number()"
});
formatter.result({
  "duration": 112492671,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enters_address()"
});
formatter.result({
  "duration": 259464090,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_clicks_on_ConfirmBooking_button_without_entering_city_page_throws_error()"
});
formatter.result({
  "duration": 77292899,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enters_city()"
});
formatter.result({
  "duration": 167038226,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_clicks_on_ConfirmBooking_button_without_entering_state_page_throws_error()"
});
formatter.result({
  "duration": 79567591,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enters_state()"
});
formatter.result({
  "duration": 106066743,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enters_number_of_guests()"
});
formatter.result({
  "duration": 114598440,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_clicks_on_ConfirmBooking_button_without_entering_card_holder_name_page_throws_error()"
});
formatter.result({
  "duration": 76682637,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enters_card_holder_name()"
});
formatter.result({
  "duration": 150012038,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_clicks_on_ConfirmBooking_button_without_entering_debit_card_number_page_throws_error()"
});
formatter.result({
  "duration": 72735390,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enters_debit_card_number()"
});
formatter.result({
  "duration": 151911250,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enters_CVV()"
});
formatter.result({
  "duration": 102661334,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_clicks_on_ConfirmBooking_button_without_entering_expiration_month_page_throws_error()"
});
formatter.result({
  "duration": 83195380,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enters_expiration_month()"
});
formatter.result({
  "duration": 88773270,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_clicks_on_ConfirmBooking_button_without_entering_expiration_year_page_throws_error()"
});
formatter.result({
  "duration": 71780439,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_enters_expiration_year()"
});
formatter.result({
  "duration": 97963982,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.user_clicks_on_ConfirmBooking_button()"
});
formatter.result({
  "duration": 99938888,
  "status": "passed"
});
formatter.match({
  "location": "bookingStepDef.the_BookingComplete_is_verified()"
});
formatter.result({
  "duration": 167967092,
  "status": "passed"
});
});