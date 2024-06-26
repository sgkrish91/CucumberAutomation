
Feature: Application login

Background:
Given Setup the entries in the database
When User launches the browser
And User hits the homepage url of banking site

@RegressionTest
Scenario: Admin page default login

Given User is on Net Banking login page
When User login to the application with username "admin" and password "1234"
Then Home page is displayed
And Cards are displayed

#Reusable

@RegressionTest
Scenario: User page default login

Given User is on Net Banking login page
When User login to the application with username "user" and password "5678"
Then Home page is displayed
And Cards are displayed

@SmokeTest @RegressionTest
Scenario Outline: Mortgage User page defalut login

Given User is on Net Banking login page
When User login to the application with username "<Username>" and password "<Password>"
Then Home page is displayed
And Cards are displayed

Examples:
	|	Username	|	|	Password	|
	|	creditusr	|	|	abc123		|
	|	debitusr	|	|	hello12		|

@RegressionTest	
Scenario: User default sign up

Given User is on the sign up page
When User sign up in to the application
	|	Hari	|
	|	Krishnan	|
	|	test@gmail.com	|
	|	8547309562	|
Then Home page is displayed
And Cards are displayed



