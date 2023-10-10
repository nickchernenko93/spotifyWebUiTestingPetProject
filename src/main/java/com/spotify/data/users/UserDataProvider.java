package com.spotify.data.users;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserDataProvider {

    private Properties properties;

    public UserDataProvider() {
        properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream("users.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getValidUserName() {
        return properties.getProperty(UserList.VALID_USER_NAME);
    }

    public String getValidUserPassword() {
        return properties.getProperty(UserList.VALID_USER_PASSWORD);
    }

    public String getInvalidUserName() {
        return properties.getProperty(UserList.INVALID_USER_NAME);
    }

    public String getInvalidUserPassword() {
        return properties.getProperty(UserList.INVALID_USER_PASSWORD);
    }

    public String[] getAllUsernames() {
        return properties.keySet().toArray(new String[0]);
    }
}
