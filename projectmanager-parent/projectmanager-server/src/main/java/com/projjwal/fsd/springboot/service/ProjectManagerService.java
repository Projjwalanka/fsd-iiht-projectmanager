package com.projjwal.fsd.springboot.service;

import java.util.List;

import com.projjwal.fsd.springboot.bo.ParentTaskVO;
import com.projjwal.fsd.springboot.bo.ProjectVO;
import com.projjwal.fsd.springboot.bo.TaskVO;
import com.projjwal.fsd.springboot.bo.UserVO;

public interface ProjectManagerService {
	
	public List<TaskVO> retriveTasks();
	public void updateTask(TaskVO task);
	
	public List<ParentTaskVO> retriveParentTasks();
	public List<ParentTaskVO> retriveParentTasksForProjectId(String projectId);
	public void updateParentTask(ParentTaskVO parentTask);
	
	public List<ProjectVO> retriveProjects();
	public void updateProject(ProjectVO project);
	
	public List<UserVO> retriveUsers();
	public void updateUser(UserVO user);

}
