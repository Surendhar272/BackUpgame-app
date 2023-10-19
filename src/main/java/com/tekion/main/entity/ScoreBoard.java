package com.tekion.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



/*
 * The Scoreboard class is responsible for printing the scoreboard after every match. 
 * It will contain information about the overs completed, the batting team, the current batsman, and the runs scored.
 */



@Entity
@Table(name="SCORE")
public class ScoreBoard {
	
	 @Id
	 private int sid;
	 private int oversDone;
	 private Team battingTeam;
	 private Player currentBatsman;
	 private int runsOnCurrentBall;
	    
	 public void printScoreboard() {
	        // Logic to print the scoreboard
	 }
	
	private String result;
	
	public ScoreBoard() {

	}
	
	public ScoreBoard(Integer id, String result) {
		super();
		this.sid = id;
		this.result = result;
	}

	public Integer getId() {
		return sid;
	}

	public void setId(Integer id) {
		this.sid = id;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
