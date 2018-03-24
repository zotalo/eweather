package forecast.info;

import currentweather.CoordInfo;

public class CityInfo {

	private Integer id;
	private String name;
	private CoordInfo coord;
	private String country;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CoordInfo getCoord() {
		return coord;
	}

	public void setCoord(CoordInfo coord) {
		this.coord = coord;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
