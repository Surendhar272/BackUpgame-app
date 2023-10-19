package com.tekion.main.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


/*
 * The Team class represents a team in the cricket game. 
 * It contains a list of Player objects representing the players in the team.
 */

@Entity
@Table(name="TEAM_TABLE")
public class Team {
	
	@Id
	@Column(name="team_Id")
	private Long teamId;
	
	@Column(name="Team_Name")
	private String teamname;
	
	@Column(name="Players")
	private List<Player> players;
	
	@ManyToOne
    @JoinColumn(name = "mt_fk")
	private Matchentity match;
	

	public Team() {
		
	}
	

	public Team(Long teamId, String teamname, List<Player> players, Matchentity match) {
		super();
		this.teamId = teamId;
		this.teamname = teamname;
		this.players = players;
		this.match = match;
	}


	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getTeamname() {
		return teamname;
	}
	
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	
	
	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Matchentity getMatch() {
		return match;
	}

	public void setMatch(Matchentity match) {
		this.match = match;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamname=" + teamname + ", players=" + players + "]";
	}
	

	
}
