package com.sapient.assesment.dto;

public class LeagueDto {

	private String league_id;

	private String league_name;

	public String getLeague_id() {
		return league_id;
	}

	public void setLeague_id(String league_id) {
		this.league_id = league_id;
	}

	public String getLeague_name() {
		return league_name;
	}

	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}

	@Override
	public String toString() {
		return "LeagueDto [league_id=" + league_id + ", league_name=" + league_name + "]";
	}

}
