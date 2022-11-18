package BerlinClock;

import java.util.stream.Stream;

public class BerlinClock 
{

	public String[] Clock (String time) {
		
		int[] parts = Stream.of(time.split(":")).mapToInt(Integer::parseInt).toArray();
		return new String [] {
				getSeconds(parts[2]),
				getTopHours(parts[0]),
				getBotHours(parts[0]),
				getTopMinutes(parts[1]),
				getBotMinutes(parts[1])
		};
	}
	
	protected String getSeconds(int number) {
		if( number % 2 == 0) {
			return "Y";
		}
		else return "O";
	}
	
	
	protected String getTopMinutes(int number) {
		return getOnOff(11, getTopNumberOfOnLights(number), "Y").replaceAll("YY", "YYR");
	}
	
	
	protected String getBotMinutes(int number) {
		return  getOnOff(4,number % 5,"Y");
	}
	
	protected String getTopHours(int number) {
		return getOnOff(4, getTopNumberOfOnLights(number),"");
	}
	
	
	protected String getBotHours(int number) {
		return getOnOff(4, number%5,"");
	}
	
	private String getLightStatus(int light, int lightsOn, String lightOn) {
		return getLightStatus(light, lightsOn, "R");
	}
	
	private String getOnOff(int lamps, int lightsOn, String lightOn) {
		String out ="";
		for(int i =0;i<lightsOn;i++) {
			out +=lightsOn;
		}
		for(int i =0;i<(lamps -lightsOn);i++) {
			out +="O";
		}
		return out;
	}
	private int getTopNumberOfOnLights(int number) {
		return (number -(number %5)) /5;
	}
	
}
