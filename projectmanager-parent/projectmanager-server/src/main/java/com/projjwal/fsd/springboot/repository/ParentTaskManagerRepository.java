package com.projjwal.fsd.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projjwal.fsd.springboot.entity.ParentTask;

@Repository
public interface ParentTaskManagerRepository extends JpaRepository<ParentTask,Long>{

	@Query("SELECT pt FROM ParentTask pt where pt.projectId = ?1")
	public List<ParentTask> findAllParentTaskByProjectId(String projectId);
}

