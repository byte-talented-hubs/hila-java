package com.vaadin.flow.spring.fusionsecurity.endpoints;

import javax.annotation.Nullable;

import com.vaadin.flow.server.connect.Endpoint;
import com.vaadin.flow.server.connect.auth.AnonymousAllowed;
import com.vaadin.flow.spring.fusionsecurity.SecurityUtils;
import com.vaadin.flow.spring.fusionsecurity.data.UserInfo;

import org.springframework.beans.factory.annotation.Autowired;

@Endpoint
@AnonymousAllowed
public class UserInfoEndpoint {

    @Autowired
    private SecurityUtils utils;

    @Nullable
    public UserInfo getUserInfo() {
        return utils.getAuthenticatedUserInfo();
    }
}
