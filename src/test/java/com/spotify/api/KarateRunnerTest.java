package com.spotify.api;
import com.intuit.karate.junit5.Karate;

public class KarateRunnerTest {
    @Karate.Test
    Karate getMyProfileDataAndVerifyUserName() {
        return Karate.run("profiledata").relativeTo(getClass());
    }
}
