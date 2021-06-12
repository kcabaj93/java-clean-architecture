package io.github.mat3e.task;

import io.github.mat3e.task.dto.TaskWithChangesDto;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Set;

interface TaskQueryRepository extends Repository<Task, Integer> {
    int count();

    boolean existsByDoneIsFalseAndProjectId(int id);

    List<Task> findAll();

    List<TaskWithChangesDto> findAllWithChangesBy();

    <T> Set<T> findBy(Class<T> type);
}
