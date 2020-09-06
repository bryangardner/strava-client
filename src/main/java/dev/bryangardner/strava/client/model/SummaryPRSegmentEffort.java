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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * SummaryPRSegmentEffort
 */




public class SummaryPRSegmentEffort {
  @JsonProperty("pr_activity_id")
  private Long prActivityId = null;

  @JsonProperty("pr_elapsed_time")
  private Integer prElapsedTime = null;

  @JsonProperty("pr_date")
  private OffsetDateTime prDate = null;

  @JsonProperty("effort_count")
  private Integer effortCount = null;

  public SummaryPRSegmentEffort prActivityId(Long prActivityId) {
    this.prActivityId = prActivityId;
    return this;
  }

   /**
   * The unique identifier of the activity related to the PR effort.
   * @return prActivityId
  **/
  @ApiModelProperty(value = "The unique identifier of the activity related to the PR effort.")
  public Long getPrActivityId() {
    return prActivityId;
  }

  public void setPrActivityId(Long prActivityId) {
    this.prActivityId = prActivityId;
  }

  public SummaryPRSegmentEffort prElapsedTime(Integer prElapsedTime) {
    this.prElapsedTime = prElapsedTime;
    return this;
  }

   /**
   * The elapsed time ot the PR effort.
   * @return prElapsedTime
  **/
  @ApiModelProperty(value = "The elapsed time ot the PR effort.")
  public Integer getPrElapsedTime() {
    return prElapsedTime;
  }

  public void setPrElapsedTime(Integer prElapsedTime) {
    this.prElapsedTime = prElapsedTime;
  }

  public SummaryPRSegmentEffort prDate(OffsetDateTime prDate) {
    this.prDate = prDate;
    return this;
  }

   /**
   * The time at which the PR effort was started.
   * @return prDate
  **/
  @ApiModelProperty(value = "The time at which the PR effort was started.")
  public OffsetDateTime getPrDate() {
    return prDate;
  }

  public void setPrDate(OffsetDateTime prDate) {
    this.prDate = prDate;
  }

  public SummaryPRSegmentEffort effortCount(Integer effortCount) {
    this.effortCount = effortCount;
    return this;
  }

   /**
   * Number of efforts by the authenticated athlete on this segment.
   * @return effortCount
  **/
  @ApiModelProperty(value = "Number of efforts by the authenticated athlete on this segment.")
  public Integer getEffortCount() {
    return effortCount;
  }

  public void setEffortCount(Integer effortCount) {
    this.effortCount = effortCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryPRSegmentEffort summaryPRSegmentEffort = (SummaryPRSegmentEffort) o;
    return Objects.equals(this.prActivityId, summaryPRSegmentEffort.prActivityId) &&
        Objects.equals(this.prElapsedTime, summaryPRSegmentEffort.prElapsedTime) &&
        Objects.equals(this.prDate, summaryPRSegmentEffort.prDate) &&
        Objects.equals(this.effortCount, summaryPRSegmentEffort.effortCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prActivityId, prElapsedTime, prDate, effortCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryPRSegmentEffort {\n");
    
    sb.append("    prActivityId: ").append(toIndentedString(prActivityId)).append("\n");
    sb.append("    prElapsedTime: ").append(toIndentedString(prElapsedTime)).append("\n");
    sb.append("    prDate: ").append(toIndentedString(prDate)).append("\n");
    sb.append("    effortCount: ").append(toIndentedString(effortCount)).append("\n");
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
