package com.ltts.Team.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.Team.model.Team;



@Repository
public class TeamDao {
	public List<Team> getAllTeams()
	{
		List<Team> li=new ArrayList<Team>();
		li.add(new Team(1,"CSK","Dhoni"));
		li.add(new Team(2,"RCB","Virat"));
		return li;
		
	}


}