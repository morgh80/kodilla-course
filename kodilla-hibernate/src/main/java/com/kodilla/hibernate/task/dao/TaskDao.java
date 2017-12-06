package com.kodilla.hibernate.dao;

import com.kodilla.hibernate.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}