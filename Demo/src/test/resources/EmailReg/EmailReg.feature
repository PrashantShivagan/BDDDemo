#Author: Prashant
Feature: 

Scenario: check the heading of the Email page
Given user is on Email Reg page
Then check the heading of the page

Scenario: Successful login with valid data
Description: to login user needs to enter his  username, password
Given user is on Email Reg page
When user enters  username,  password
And enter same password in conform password
Then navigate to Success

Scenario: Unsuccessful Login due to incorrect username or password or conform password
Given user is on Email Reg page
When user enters incorrect username or password or confirm password
Then display login failed message

Scenario: Verify Submit booking button
Given user is on Email Reg page
When user clicks on confirm booking button
Then navigate to booking successful