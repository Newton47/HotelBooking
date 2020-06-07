Feature: Hotelbooking login

Scenario: Successful homepage login and validation
Given User launches the browser
Then User validates the title of the home page
When User clicks on the Login button without entering username
Then User verifies username error message is thrown
Then User enters the username
And clicks on the Login button
Then User verifies password error message is thrown
Then User enter the password
And clicks on the Login button
Then the user is successfully logged into HotelBookingForm page
Then User validates error by clicking the ConfirmBooking button without entering firstName 
Then User enters the firstName
Then User validates error on clicking the ConfirmBooking button without entering lastName
Then User enters the lastName
Then User validates error on clicking the ConfirmBooking button entering improper email
Then User enter proper email
Then User validates error on clicking the ConfirmBooking button without entering mobile number
Then User validates error on clicking the ConfirmBooking button entering improper mobile number  
Then User enters the mobile number
Then User enters address 
Then User clicks on ConfirmBooking button without entering city page throws error
Then User enters city
Then User clicks on ConfirmBooking button without entering state page throws error
Then User enters state
Then User enters number of guests
Then User clicks on ConfirmBooking button without entering card holder name page throws error
Then User enters card holder name
Then User clicks on ConfirmBooking button without entering debit card number page throws error
Then User enters debit card number
Then User enters CVV
Then User clicks on ConfirmBooking button without entering expiration month page throws error
Then User enters expiration month
Then User clicks on ConfirmBooking button without entering expiration year page throws error
Then User enters expiration year
Then User clicks on ConfirmBooking button
And the BookingComplete is verified	
 


