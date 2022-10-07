package Domain;

import org.apache.tomcat.jni.Local;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Calender {
	
	
	//Calendar(String locationID, String Day, LocalTime cutOffTime)
	
	private String locationID;
	private String Day;
	private Local cuttOffTime;
	

}
