package com.spotify.api;
import com.intuit.karate.junit5.Karate;

// TODO: uncomment pom dependencies
public class KarateRunnerTest {
    @Karate.Test
    Karate VerifyUserNameByProfileId() {
        return Karate.run("profileData").relativeTo(getClass());
    }

    @Karate.Test
    Karate verifySpecificUserData() {
        return Karate.run("userData").relativeTo(getClass());
}
}
