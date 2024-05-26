
Feature: Application login

Scenario: Admin page default login

Given User is on Net Banking login page
When User login to the application with username "admin" and password "1234"
Then Home page is displayed
And Cards are displayed

#Reusable

Scenario: User page default login

Given User is on Net Banking login page
When User login to the application with username "user" and password "5678"
Then Home page is displayed
And Cards are displayed



