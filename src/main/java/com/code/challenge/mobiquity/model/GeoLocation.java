/**
 * 
 */
package com.code.challenge.mobiquity.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author NARESH
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoLocation {

	private String lat;
	private String lng;

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

}
