Feature: Test Facebook smoke scenario
  
    Scenario: Test login with valid credentials
        Given Open firefox and start application
        When  I enter valid user name and valid password    
        Then  user should be able to login successfully
        Then application should be closed
    
