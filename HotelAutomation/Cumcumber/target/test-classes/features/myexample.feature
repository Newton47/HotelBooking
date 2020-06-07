@macroFilter
Feature: Application login

Scenario: Default home page login

Given User is on Home page
When User is logging in with username and password
Then Home page is populated
