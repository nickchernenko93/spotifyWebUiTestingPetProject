package com.spotify.data.users;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserList {
    public static final String REGISTER_USER_NAME = "valid_username";
    public static final String REGISTER_USER_PASSWORD = "valid_password";
    public static final String NOT_REGISTER_USER_NAME = "invalid_username";
    public static final String NOT_REGISTER_USER_PASSWORD = "invalid_password";

}
