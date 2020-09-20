package com.examle.sweater.repos;

import com.examle.sweater.domen.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepos extends CrudRepository<Message, Integer> {
}
