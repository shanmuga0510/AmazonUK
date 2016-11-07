Feature: CcucumberJava

Scenario: Amazon_Place_IPhone_Order

Given I am a customer on Amazon 
When I search for Iphone in Amazon
And I Select Iphone link in plp page
And see PIP Page
And select 3 qty in pip page 
When I click add to cart button from pip page 
And Proceed checkout
And enter valid regsiter details to login
Then I click delivery address
