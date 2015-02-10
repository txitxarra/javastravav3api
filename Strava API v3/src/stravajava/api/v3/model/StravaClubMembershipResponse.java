package stravajava.api.v3.model;

import stravajava.api.v3.service.ClubServices;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>Container for response from club membership join and leave</p>
 * 
 * <p>See {@link ClubServices#joinClub(Integer)} and {@link ClubServices#leaveClub(Integer)}
 * 
 * @author Dan Shannon
 *
 */
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class StravaClubMembershipResponse {
	private Boolean success;
	private Boolean active;
}
