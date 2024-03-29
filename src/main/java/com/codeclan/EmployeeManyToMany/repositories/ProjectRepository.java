package com.codeclan.EmployeeManyToMany.repositories;

import com.codeclan.EmployeeManyToMany.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
