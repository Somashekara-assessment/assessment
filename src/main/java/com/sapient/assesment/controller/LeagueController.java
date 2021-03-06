package com.sapient.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sapient.assesment.Constants.FootBallConstants;
import com.sapient.assesment.dto.LeagueDto;
import com.sapient.assesment.exception.ResourceNotFoundException;
import com.sapient.assesment.util.UrlFactory;

@RestController
@RequestMapping("/api/v1")
public class LeagueController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private UrlFactory urlFactory;

	@GetMapping("/leagues/{countryId}")
	public ResponseEntity<LeagueDto[]> getLeagues(@PathVariable("countryId") String countryId)
			throws ResourceNotFoundException {

		ResponseEntity<LeagueDto[]> response = restTemplate
				.getForEntity(urlFactory.urlBuilder(FootBallConstants.LEAGUE, countryId, null), LeagueDto[].class);

		if (response.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
			throw new ResourceNotFoundException("Positon not found for country " + countryId);
		}
		return response;
	}

}
