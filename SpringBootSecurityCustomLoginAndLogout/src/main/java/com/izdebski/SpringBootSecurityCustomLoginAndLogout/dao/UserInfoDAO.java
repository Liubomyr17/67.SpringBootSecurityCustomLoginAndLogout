package com.izdebski.SpringBootSecurityCustomLoginAndLogout.dao;

import com.izdebski.SpringBootSecurityCustomLoginAndLogout.entity.UserInfo;

public interface UserInfoDAO {
    public abstract UserInfo getActiveUser(String userName);
}