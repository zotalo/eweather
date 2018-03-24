package forecast.info;

import java.util.List;


public class ForecastInfo {

	private String cod;
	private Double message;
	private Integer cnt;
	private List<ListInfo> list;
	private CityInfo city;

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Double getMessage() {
		return message;
	}

	public void setMessage(Double message) {
		this.message = message;
	}

	public Integer getCnt() {
		return cnt;
	}

	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

	public List<ListInfo> getList() {
		return list;
	}

	public void setList(List<ListInfo> list) {
		this.list = list;
	}

	public CityInfo getCity() {
		return city;
	}

	public void setCity(CityInfo city) {
		this.city = city;
	}
}
