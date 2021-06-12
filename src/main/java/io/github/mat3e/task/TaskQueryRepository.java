package io.github.mat3e.task;

import org.springframework.data.repository.Repository;

import java.util.List;

interface TaskQueryRepository extends Repository<Task, Integer> {
    int count();

    boolean existsByDoneIsFalseAndProjectId(int id);

    List<Task> findAll();
}
