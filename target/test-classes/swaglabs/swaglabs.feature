Feature: swaglabs End to End testing

  @SmokTest
  Scenario: swaglabs login functianality with invalid and valid credentials
    Given enter url of swaglabs login page
    Then verify login page
    When verify user name field
    Then enter user name
    When verify password field
    Then enter password
    When click on the login btn
    Then verify invalid crediantials errore massge
    When enter valid username
    Then enter valid password
    Then click on the login button
    Then verify products home page of swaglabs
    When click on the dropdown menu
    Then verify all list of dropdwen menu
    Then select A to Z in dropdown
    Then select Z to A in dropdown
    Then select price low to high
    Then select price high to low
    Then click on the product
    Then verify product details
    Then add to cart
    When click on the cart icon
    Then verify cart page
    Then verify product in cart
    Then lcick on the checkout btn
    Then verify checkout page
    Then fill the form
    Then click on the continue btn
    Then verify checkout overview page
    Then verify payment information
    Then verify shiping information
    Then verify total amount
    Then click on the finish btn
    Then verify finish page
    Then close the browser
