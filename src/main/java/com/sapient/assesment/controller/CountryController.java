package com.sapient.assesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sapient.assesment.Constants.FootBallConstants;
import com.sapient.assesment.dto.CountryDto;
import com.sapient.assesment.exception.ResourceNotFoundException;
import com.sapient.assesment.util.UrlFactory;

@RestController
@RequestMapping("/api/v1")
public class CountryController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private UrlFactory urlFactory;

	@GetMapping("/countries")
	public ResponseEntity<CountryDto[]> getAll() throws ResourceNotFoundException {

		ResponseEntity<CountryDto[]> response = restTemplate
				.getForEntity(urlFactory.urlBuilder(FootBallConstants.COUNTRY, null, null), CountryDto[].class);
		if (response.getStatusCode().equals(HttpStatus.NOT_FOUND)) {
			throw new ResourceNotFoundException("Positon not found");
		}
		return response;
	}

}
