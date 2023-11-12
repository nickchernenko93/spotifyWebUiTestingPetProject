Feature: ProfileData

  # You should add SPOTIFY_PROFILE_ID as system variable
  Background:
    * def AccessTokenManager = Java.type('com.spotify.data.access_token.AccessTokenManager')
    * def generatedAccessToken = AccessTokenManager.generateAccessToken()
    * def SPOTIFY_PROFILE_ID = Java.type('java.lang.System').getenv('SPOTIFY_PROFILE_ID')
    * karate.set('SPOTIFY_PROFILE_ID', SPOTIFY_PROFILE_ID)

  Scenario: Get current profile data
    * print generatedAccessToken
    * assert generatedAccessToken != null
    Given header Authorization = 'Bearer ' + generatedAccessToken
    Given url 'https://api.spotify.com/v1/users/' + SPOTIFY_PROFILE_ID
    When method GET
    Then status 200
    Then match response.display_name == 'Mykola Chernenko'
    * print response
