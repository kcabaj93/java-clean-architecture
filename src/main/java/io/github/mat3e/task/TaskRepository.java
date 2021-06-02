package io.github.mat3e.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {
    boolean existsByAllByDoneIsFalseProjectId(int id);
}
