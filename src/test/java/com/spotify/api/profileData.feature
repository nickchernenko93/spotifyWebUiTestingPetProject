Feature: ProfileData

  Background:
    * def AccessTokenManager = Java.type('com.spotify.data.access_token.AccessTokenManager')
    * def generatedAccessToken = AccessTokenManager.generateAccessToken()


  Scenario: Get current profile data
    * print generatedAccessToken
    * assert generatedAccessToken != null
    Given header Authorization = 'Bearer ' + generatedAccessToken
    Given url 'https://api.spotify.com/v1/users/31ahzzvdupzu7i2h3nyrdf3fhjfe'
    When method GET
    Then status 200
    Then match response.display_name == 'Mykola Chernenko'
    * print response
