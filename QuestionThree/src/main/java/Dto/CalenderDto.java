package Dto;

import java.time.LocalDate;

import org.apache.tomcat.jni.Local;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CalenderDto {
	
	
	private String storeID;
	private Local requestDate;
	
			
	

}
