package stravajava.api.v3.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * @author dshannon
 *
 */
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class StravaMapPoint {
	private Float latitude;
	private Float longitude;

	public StravaMapPoint(Float latitude, Float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Float[] getValue() {
		return new Float[]{this.latitude,this.longitude};
	}
	
	public StravaMapPoint create(Float[] latlng) {
		return new StravaMapPoint(latlng[0],latlng[1]);
	}

}
