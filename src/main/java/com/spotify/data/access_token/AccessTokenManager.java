package com.spotify.data.access_token;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Step;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class AccessTokenManager {
    private static final String CLIENT_SECRET = System.getenv("SPOTIFY_CLIENT_SECRET");
    private static final String CLIENT_ID = System.getenv("SPOTIFY_CLIENT_ID");
    private static final OkHttpClient client = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();

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

        try (Response response = client.newCall(request).execute()) {
            String responseBody = response.body().string();
            return parseAccessToken(responseBody);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String parseAccessToken(String jsonResponse) {
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonResponse);
            return jsonNode.get("access_token").asText();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
