package com.spotify.data.access_token;

import java.awt.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;

public class SpotifyImplicitGrantFlow {
    private static final String CLIENT_ID = System.getenv("SPOTIFY_CLIENT_ID");

    public void runSpotifyImplicitGrantFlow() {
        String client_id = CLIENT_ID;
        String redirect_uri = "https://google.com/callback/";
        String state = generateRandomString(16);
        // TODO: need to add all the spotify auth scope
        String scope = "user-top-read";
//        String scope = "user-read-email";
//        String scope = "user-read-private";


        String url = "https://accounts.spotify.com/authorize" +
                "?response_type=token" +
                "&client_id=" + client_id +
                "&scope=" + encodeValue(scope) +
                "&redirect_uri=" + encodeValue(redirect_uri) +
                "&state=" + state;
        System.out.println("Opening browser for Spotify authentication...");

        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * chars.length());
            builder.append(chars.charAt(index));
        }
        return builder.toString();
    }

    private static String encodeValue(String value) {
        try {
            return URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error encoding value: " + e.getMessage(), e);
        }
    }
}
