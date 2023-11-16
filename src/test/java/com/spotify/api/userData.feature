Feature: ProfileData

  # You should add SPOTIFY_PROFILE_ID as system variable

  Scenario: Get specific data by user
#    need to implement method for access token with different spotify auth flow to retrieve user data
    Given header Authorization = 'Bearer '
    Given url 'https://api.spotify.com/v1/me/top/tracks'
    When method GET
    Then status 200
    * print response
