package com.tekion.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchControllerAPI {
    @GetMapping("/start-match/{overs}/{matches}")
    public String startMatch(@PathVariable int overs, @PathVariable int matches) {
        // Logic to start a match or series for a given overs and matches
    	return null;
    }
    
    @GetMapping("/player-details/{matchId}/{playerId}")
    public String getPlayerDetails(@PathVariable int matchId, @PathVariable int playerId) {
        // Logic to fetch the details of a player in a given match
    	return null;
    }
    
    @GetMapping("/match-details/{matchId}/{seriesId}")
    public String getMatchDetails(@PathVariable int matchId, @PathVariable int seriesId) {
        // Logic to fetch the details of a given match and series
    	return null;
    }
}