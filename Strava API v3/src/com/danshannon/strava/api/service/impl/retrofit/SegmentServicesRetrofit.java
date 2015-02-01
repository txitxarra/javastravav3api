/**
 * 
 */
package com.danshannon.strava.api.service.impl.retrofit;

import java.util.Date;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

import com.danshannon.strava.api.model.Segment;
import com.danshannon.strava.api.model.SegmentEffort;
import com.danshannon.strava.api.model.SegmentExplorer;
import com.danshannon.strava.api.model.SegmentLeaderboard;
import com.danshannon.strava.api.model.reference.AgeGroup;
import com.danshannon.strava.api.model.reference.ClimbCategory;
import com.danshannon.strava.api.model.reference.Gender;
import com.danshannon.strava.api.model.reference.LeaderboardDateRange;
import com.danshannon.strava.api.model.reference.SegmentExplorerActivityType;
import com.danshannon.strava.api.model.reference.WeightClass;
import com.danshannon.strava.api.service.exception.NotFoundException;
import com.danshannon.strava.api.service.exception.UnauthorizedException;

/**
 * @author Dan Shannon
 *
 */
public interface SegmentServicesRetrofit {

	/**
	 * @see com.danshannon.strava.api.service.SegmentServices#getSegment(java.lang.Integer)
	 */
	@GET("/segments/{id}")
	public Segment getSegment(@Path("id") Integer id) throws NotFoundException, UnauthorizedException;

	/**
	 * @see com.danshannon.strava.api.service.SegmentServices#listAuthenticatedAthleteStarredSegments(java.lang.Integer, java.lang.Integer)
	 */
	@GET("/segments/starred")
	public Segment[] listAuthenticatedAthleteStarredSegments(@Query("page") Integer page, @Query("per_page") Integer perPage);

	/**
	 * @see com.danshannon.strava.api.service.SegmentServices#listStarredSegments(java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 */
	@GET("/athlete/{id}/segments/starred")
	public Segment[] listStarredSegments(@Path("id") Integer id, @Query("page") Integer page, @Query("per_page") Integer perPage) throws NotFoundException;

	/**
	 * @see com.danshannon.strava.api.service.SegmentServices#listSegmentEfforts(java.lang.Integer, java.lang.Integer, java.util.Calendar, java.util.Calendar, java.lang.Integer, java.lang.Integer)
	 */
	@GET("/segments/{id}/all_efforts")
	public SegmentEffort[] listSegmentEfforts(@Path("id") Integer id, @Query("athlete_id") Integer athleteId, @Query("start_date_local") Date startDateLocal,
			@Query("end_date_local") Date endDateLocal, @Query("page") Integer page, @Query("per_page") Integer perPage) throws NotFoundException;

	/**
	 * @see com.danshannon.strava.api.service.SegmentServices#getSegmentLeaderboard(java.lang.Integer, com.danshannon.strava.api.model.reference.Gender, com.danshannon.strava.api.model.reference.AgeGroup, com.danshannon.strava.api.model.reference.WeightClass, java.lang.Boolean, java.lang.Integer, com.danshannon.strava.api.model.reference.LeaderboardDateRange, java.lang.Integer, java.lang.Integer)
	 */
	@GET("/segments/{id}/leaderboard")
	public SegmentLeaderboard getSegmentLeaderboard(@Path("id") Integer id, @Query("gender") Gender gender, @Query("age_group") AgeGroup ageGroup,
			@Query("weight_class") WeightClass weightClass, @Query("following") Boolean following, @Query("club_id") Integer clubId, @Query("date_range") LeaderboardDateRange dateRange, @Query("page") Integer page,
			@Query("per_page") Integer perPage) throws NotFoundException;

	/**
	 * @see com.danshannon.strava.api.service.SegmentServices#segmentExplore(com.danshannon.strava.api.model.MapPoint, com.danshannon.strava.api.model.MapPoint, com.danshannon.strava.api.model.reference.SegmentExplorerActivityType, java.lang.Integer, java.lang.Integer)
	 */
	@GET("/segments/explore")
	public SegmentExplorer segmentExplore(@Query("bounds") String bounds,
			@Query("activity_type") SegmentExplorerActivityType activityType, @Query("min_cat") ClimbCategory minCategory, @Query("max_cat") ClimbCategory maxCategory);

}
