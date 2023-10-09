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

    public String getRegisterUserName() {
        return properties.getProperty(UserList.REGISTER_USER_NAME);

    }

    public String getRegisterUserPassword() {
        return properties.getProperty(UserList.REGISTER_USER_PASSWORD);
    }

    public String[] getAllUsernames() {
        return properties.keySet().toArray(new String[0]);
    }
}
