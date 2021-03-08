package com.izdebski.SpringBootSecurityCustomLoginAndLogout.service.impl;

import java.util.List;

import com.izdebski.SpringBootSecurityCustomLoginAndLogout.dao.TopicDAO;
import com.izdebski.SpringBootSecurityCustomLoginAndLogout.entity.Topic;
import com.izdebski.SpringBootSecurityCustomLoginAndLogout.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicDAO topicDAO;

    @Override
    public List<Topic> getAllTopics(){
        return topicDAO.getAllTopics();
    }
}