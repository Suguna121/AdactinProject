@login
Feature: To book the hotel from AdactinHotel app and then get the order id

Scenario: To book a hotel from Adactin hotel app
Given User is in adactin login page
When User enter valid username and password and click login button
And User select location, hotels, room type, number of rooms, Indate, Outdate, adult room, child room and click search button
And User select radio button and click continue button
And  User enter first name, last name, address, creditcard number, creditcard type, month, year, cvv number and click booknow button
Then User must get the order id

