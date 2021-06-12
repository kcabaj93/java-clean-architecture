package io.github.mat3e.project;

import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface ProjectQueryRepository extends Repository<Project, Integer> {
    Optional<Project> findById(Integer id);

    List<Project> findAll();

    long count();
}
