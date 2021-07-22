package io.github.mat3e.task;

import org.springframework.context.annotation.Bean;

class TaskConfiguration {
    @Bean
    TaskFacade taskFacade(TaskRepository taskRepository) {
        return new TaskFacade(new TaskFactory(), taskRepository);
    }
}
