Feature: Auth token
  Background:
    * def AccessTokenManager = Java.type('com.spotify.data.access_token.AccessTokenManager')
    * def generatedAccessToken = AccessTokenManager.generateAccessToken()




  Scenario: Get current profile data

    Given url 'https://api.spotify.com/v1/me'
    And header Authorization = 'Bearer ' + generatedAccessToken
    When method GET
    Then status 200


