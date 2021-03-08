package com.izdebski.SpringBootSecurityCustomLoginAndLogout.dao;

import com.izdebski.SpringBootSecurityCustomLoginAndLogout.entity.Topic;

import java.util.List;

public interface TopicDAO {
    public abstract List<Topic> getAllTopics();
}