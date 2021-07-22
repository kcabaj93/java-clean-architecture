package io.github.mat3e.task;

import org.springframework.data.repository.Repository;

interface SqlTaskRepositories extends TaskRepository, Repository<Task, Integer> {
}

interface SqlTaskQueryRepositories extends TaskQueryRepository, Repository<Task, Integer> {

}