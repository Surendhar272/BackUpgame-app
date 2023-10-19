package com.tekion.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
 * The Player class represents a player in the game. 
 * Each player has a name, role (batsman or bowler), and relevant statistics such as runs scored, wickets taken, etc.
 * 
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {
	
	@Id
	private int pid;
	private String name;
    private String role;
    private int runsScored;
    private int wicketsTaken;
    // Other relevant attributes and methods

}
