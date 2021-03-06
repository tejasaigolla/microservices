package com.ltts.Team.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Team.Dao.TeamDao;
import com.ltts.Team.model.Team;



@RestController
public class TeamController {
	@Autowired
	TeamDao td;
	@GetMapping("/teams")
	public List<Team> getTeams()
	{
		return td.getAllTeams();
	}
	
	
}