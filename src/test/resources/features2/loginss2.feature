Feature: this feature is for validate login functionality



Scenario: verify user login successfully 
Given launch "<URL>" for demo
Then click loginlink
Then enter username and password
Then click login button
Then verify user login successfully profile page 