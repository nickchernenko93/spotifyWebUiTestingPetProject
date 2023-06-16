package login;

import org.junit.Before;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;

public abstract class DriverManager {
    protected static final String SPOTIFY_URL = "https://www.spotify.com/ua-en/signup?forward_url=https%3A%2F%2Fopen.spotify.com%2F%23_%3D_";

    @Before
    public void initDriver() {
        baseUrl = SPOTIFY_URL;
        browser = "chrome";
    }
}
