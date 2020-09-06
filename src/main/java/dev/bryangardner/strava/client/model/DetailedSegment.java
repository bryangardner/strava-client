/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package dev.bryangardner.strava.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import dev.bryangardner.strava.client.model.LatLng;
import dev.bryangardner.strava.client.model.PolylineMap;
import dev.bryangardner.strava.client.model.SummaryPRSegmentEffort;
import dev.bryangardner.strava.client.model.SummarySegment;
import dev.bryangardner.strava.client.model.SummarySegmentEffort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * DetailedSegment
 */




public class DetailedSegment extends SummarySegment {
  @JsonProperty("created_at")
  private OffsetDateTime createdAt = null;

  @JsonProperty("updated_at")
  private OffsetDateTime updatedAt = null;

  @JsonProperty("total_elevation_gain")
  private Float totalElevationGain = null;

  @JsonProperty("map")
  private PolylineMap map = null;

  @JsonProperty("effort_count")
  private Integer effortCount = null;

  @JsonProperty("athlete_count")
  private Integer athleteCount = null;

  @JsonProperty("hazardous")
  private Boolean hazardous = null;

  @JsonProperty("star_count")
  private Integer starCount = null;

  public DetailedSegment createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time at which the segment was created.
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time at which the segment was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DetailedSegment updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time at which the segment was last updated.
   * @return updatedAt
  **/
  @ApiModelProperty(value = "The time at which the segment was last updated.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public DetailedSegment totalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
    return this;
  }

   /**
   * The segment&#39;s total elevation gain.
   * @return totalElevationGain
  **/
  @ApiModelProperty(value = "The segment's total elevation gain.")
  public Float getTotalElevationGain() {
    return totalElevationGain;
  }

  public void setTotalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
  }

  public DetailedSegment map(PolylineMap map) {
    this.map = map;
    return this;
  }

   /**
   * Get map
   * @return map
  **/
  @ApiModelProperty(value = "")
  public PolylineMap getMap() {
    return map;
  }

  public void setMap(PolylineMap map) {
    this.map = map;
  }

  public DetailedSegment effortCount(Integer effortCount) {
    this.effortCount = effortCount;
    return this;
  }

   /**
   * The total number of efforts for this segment
   * @return effortCount
  **/
  @ApiModelProperty(value = "The total number of efforts for this segment")
  public Integer getEffortCount() {
    return effortCount;
  }

  public void setEffortCount(Integer effortCount) {
    this.effortCount = effortCount;
  }

  public DetailedSegment athleteCount(Integer athleteCount) {
    this.athleteCount = athleteCount;
    return this;
  }

   /**
   * The number of unique athletes who have an effort for this segment
   * @return athleteCount
  **/
  @ApiModelProperty(value = "The number of unique athletes who have an effort for this segment")
  public Integer getAthleteCount() {
    return athleteCount;
  }

  public void setAthleteCount(Integer athleteCount) {
    this.athleteCount = athleteCount;
  }

  public DetailedSegment hazardous(Boolean hazardous) {
    this.hazardous = hazardous;
    return this;
  }

   /**
   * Whether this segment is considered hazardous
   * @return hazardous
  **/
  @ApiModelProperty(value = "Whether this segment is considered hazardous")
  public Boolean isHazardous() {
    return hazardous;
  }

  public void setHazardous(Boolean hazardous) {
    this.hazardous = hazardous;
  }

  public DetailedSegment starCount(Integer starCount) {
    this.starCount = starCount;
    return this;
  }

   /**
   * The number of stars for this segment
   * @return starCount
  **/
  @ApiModelProperty(value = "The number of stars for this segment")
  public Integer getStarCount() {
    return starCount;
  }

  public void setStarCount(Integer starCount) {
    this.starCount = starCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedSegment detailedSegment = (DetailedSegment) o;
    return Objects.equals(this.createdAt, detailedSegment.createdAt) &&
        Objects.equals(this.updatedAt, detailedSegment.updatedAt) &&
        Objects.equals(this.totalElevationGain, detailedSegment.totalElevationGain) &&
        Objects.equals(this.map, detailedSegment.map) &&
        Objects.equals(this.effortCount, detailedSegment.effortCount) &&
        Objects.equals(this.athleteCount, detailedSegment.athleteCount) &&
        Objects.equals(this.hazardous, detailedSegment.hazardous) &&
        Objects.equals(this.starCount, detailedSegment.starCount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, totalElevationGain, map, effortCount, athleteCount, hazardous, starCount, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedSegment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    totalElevationGain: ").append(toIndentedString(totalElevationGain)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    effortCount: ").append(toIndentedString(effortCount)).append("\n");
    sb.append("    athleteCount: ").append(toIndentedString(athleteCount)).append("\n");
    sb.append("    hazardous: ").append(toIndentedString(hazardous)).append("\n");
    sb.append("    starCount: ").append(toIndentedString(starCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

