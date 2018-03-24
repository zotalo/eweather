package forecast.info;

import java.util.List;

import weather.info.CloudsInfo;
import weather.info.WeatherInfo;
import weather.info.WindInfo;

public class ListInfo {

	private Integer dt;
	private MainInfo main;
	private List<WeatherInfo> weather;
	private CloudsInfo clouds;
	private WindInfo wind;
	private RainInfo rain;
	private SysInfo sys;
	private String dt_txt;
	
	public Integer getDt() {
		return dt;
	}
	public void setDt(Integer dt) {
		this.dt = dt;
	}
	public MainInfo getMain() {
		return main;
	}
	public void setMain(MainInfo main) {
		this.main = main;
	}
	public List<WeatherInfo> getWeather() {
		return weather;
	}
	public void setWeather(List<WeatherInfo> weather) {
		this.weather = weather;
	}
	public CloudsInfo getClouds() {
		return clouds;
	}
	public void setClouds(CloudsInfo clouds) {
		this.clouds = clouds;
	}
	public WindInfo getWind() {
		return wind;
	}
	public void setWind(WindInfo wind) {
		this.wind = wind;
	}
	public RainInfo getRain() {
		return rain;
	}
	public void setRain(RainInfo rain) {
		this.rain = rain;
	}
	public SysInfo getSys() {
		return sys;
	}
	public void setSys(SysInfo sys) {
		this.sys = sys;
	}
	public String getDt_txt() {
		return dt_txt;
	}
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}
	
}
