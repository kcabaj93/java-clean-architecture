package io.github.mat3e.project;

import org.springframework.data.repository.Repository;

import java.util.Optional;

interface ProjectRepository extends Repository<Project, Integer> {
    <S extends Project> S save(S entity);

    Optional<Project> findById(Integer id);
}
