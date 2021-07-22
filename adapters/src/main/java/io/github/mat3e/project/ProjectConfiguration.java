package io.github.mat3e.project;

import io.github.mat3e.task.TaskFacade;
import io.github.mat3e.task.TaskQueryRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
class ProjectConfiguration {
    @Bean
    ProjectFacade projectFacade(
            final ProjectRepository projectRepository,
            final ProjectStepRepository projectStepRepository,
            final TaskFacade taskFacade,
            final TaskQueryRepository taskQueryRepository
    ) {
        return new ProjectFacade(
                projectRepository,
                projectStepRepository,
                taskFacade,
                taskQueryRepository,
                new ProjectFactory()
        );
    }
}
