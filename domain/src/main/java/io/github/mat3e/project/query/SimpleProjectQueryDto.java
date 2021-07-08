package io.github.mat3e.project.query;

import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class SimpleProjectQueryDto {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @PersistenceConstructor
    protected SimpleProjectQueryDto() {

    }

    public SimpleProjectQueryDto(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
