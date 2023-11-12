package com.spotify.api;
import com.intuit.karate.junit5.Karate;

public class KarateTestRunner {
    @Karate.Test
    Karate getMyProfileDataAndVerifyUserName() {
        return Karate.run("profileData").relativeTo(getClass());
    }
}
