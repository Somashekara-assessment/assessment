package com.sapient.assesment.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sapient.assesment.Constants.FootBallConstants;

@Component
public class UrlFactory {

	@Value("${football.url}")
	private String url;

	@Value("${apikey}")
	private String apikey;

	public String urlBuilder(String type, String countryId, String LeagueId) {

		String equals = "=";

		String and = "&";

		StringBuilder urlvalue = new StringBuilder(url);

		urlvalue.append(FootBallConstants.APIKEY + equals + apikey + and);

		if (FootBallConstants.COUNTRY.equals(type)) {
			urlvalue.append(FootBallConstants.ACTION + equals + FootBallConstants.COUNRTY_ACTION);

		} else if (FootBallConstants.LEAGUE.equals(type)) {
			urlvalue.append(FootBallConstants.ACTION + equals + FootBallConstants.LEAGUE_ACTION + and + "country_id="
					+ countryId);

		} else if (FootBallConstants.TEAM.equals(type)) {
			urlvalue.append(
					FootBallConstants.ACTION + equals + FootBallConstants.TEAM_ACTION + and + "league_id=" + LeagueId);
		} else if (FootBallConstants.POSITION.equals(type)) {
			urlvalue.append(FootBallConstants.ACTION + equals + FootBallConstants.POSITION_ACTION + and + "league_id="
					+ LeagueId);
		}

		return urlvalue.toString();
	}
}
