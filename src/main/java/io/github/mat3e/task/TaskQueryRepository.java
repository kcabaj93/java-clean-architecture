package io.github.mat3e.task;

import io.github.mat3e.task.dto.TaskDto;
import io.github.mat3e.task.dto.TaskWithChangesDto;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface TaskQueryRepository extends Repository<Task, Integer> {
    int count();

    boolean existsByDoneIsFalseAndProjectId(int id);

    Optional<TaskDto> findDtoById(int id);

    List<TaskDto> findAllBy();

    List<TaskWithChangesDto> findAllWithChangesBy();

    <T> Set<T> findBy(Class<T> type);
}
