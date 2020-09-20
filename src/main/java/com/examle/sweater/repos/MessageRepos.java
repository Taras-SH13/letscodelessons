package com.examle.sweater.repos;

import com.examle.sweater.domen.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepos extends CrudRepository<Message, Integer> {
    List<Message>findByTag(String tag);
}
