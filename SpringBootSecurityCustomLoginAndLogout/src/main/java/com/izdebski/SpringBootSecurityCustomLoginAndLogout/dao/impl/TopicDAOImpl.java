package com.izdebski.SpringBootSecurityCustomLoginAndLogout.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.izdebski.SpringBootSecurityCustomLoginAndLogout.dao.TopicDAO;
import com.izdebski.SpringBootSecurityCustomLoginAndLogout.entity.Topic;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class TopicDAOImpl implements TopicDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Topic> getAllTopics() {
        String HQL = "FROM Topic as t ORDER BY t.topicId";
        return (List<Topic>) entityManager.createQuery(HQL).getResultList();
    }
}