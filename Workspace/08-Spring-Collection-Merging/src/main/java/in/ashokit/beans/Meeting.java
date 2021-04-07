package in.ashokit.beans;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Meeting {
	
	

	public Meeting() {
		System.out.println("Metting Constructor");
	}
	private String meetingName;
	private List<String> participants;
}
