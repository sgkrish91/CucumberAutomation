
Feature: Application login

Background:
When User launches the browser
And User hits the homepage url of banking site

@RegressionTest @NetBanking
Scenario: User page default login

Given User is on Net Banking login page
When User login to the application with username "user" and password "5678"
Then Home page is displayed
And Cards are displayed

@SmokeTest @RegressionTest @Mortgage
Scenario Outline: Mortgage User page defalut login

Given User is on Net Banking login page
When User login to the application with username "<Username>" and password "<Password>"
Then Home page is displayed
And Cards are displayed

Examples:
	|	Username	|	|	Password	|
	|	creditusr	|	|	abc123		|
	|	debitusr	|	|	hello12		|




