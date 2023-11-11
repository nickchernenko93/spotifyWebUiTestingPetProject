package com.spotify.api;
import com.intuit.karate.junit5.Karate;
import com.spotify.data.access_token.AccessTokenManager;

public class KarateRunner {
    @Karate.Test
    Karate testSample() {
        return Karate.run("AuthToken").relativeTo(getClass());
    }
}
