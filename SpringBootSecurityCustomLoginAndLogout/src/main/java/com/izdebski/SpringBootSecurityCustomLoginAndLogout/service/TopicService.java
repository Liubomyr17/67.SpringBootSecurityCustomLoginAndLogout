package com.izdebski.SpringBootSecurityCustomLoginAndLogout.service;

import java.util.List;

import com.izdebski.SpringBootSecurityCustomLoginAndLogout.entity.Topic;
import org.springframework.security.access.annotation.Secured;

public interface TopicService {
    @Secured ({"ROLE_ADMIN"})
    public abstract List<Topic> getAllTopics();
}