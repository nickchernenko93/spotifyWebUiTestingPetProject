package com.spotify.data.access_token;

import io.qameta.allure.Step;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * You should add your client secret and client id as a system variable
 **/
public class AccessTokenManager {
    private final static String CLIENT_SECRET = System.getenv("SPOTIFY_CLIENT_SECRET");
    private final static String CLIENT_ID = System.getenv("SPOTIFY_CLIENT_ID");
    private static final OkHttpClient client = new OkHttpClient();

    @Step
    public static String generateAccessToken() {
        FormBody formBody = new FormBody.Builder()
                .add("grant_type", "client_credentials")
                .add("client_id", CLIENT_ID)
                .add("client_secret", CLIENT_SECRET)
                .build();

        Request request = new Request.Builder()
                .url("https://accounts.spotify.com/api/token")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .post(formBody)
                .build();

        Response response;
        try {
            response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
