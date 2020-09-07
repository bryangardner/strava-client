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
import dev.bryangardner.strava.client.model.AltitudeStream;
import dev.bryangardner.strava.client.model.CadenceStream;
import dev.bryangardner.strava.client.model.DistanceStream;
import dev.bryangardner.strava.client.model.HeartrateStream;
import dev.bryangardner.strava.client.model.LatLngStream;
import dev.bryangardner.strava.client.model.MovingStream;
import dev.bryangardner.strava.client.model.PowerStream;
import dev.bryangardner.strava.client.model.SmoothGradeStream;
import dev.bryangardner.strava.client.model.SmoothVelocityStream;
import dev.bryangardner.strava.client.model.TemperatureStream;
import dev.bryangardner.strava.client.model.TimeStream;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * StreamSet
 */




public class StreamSet {
  @JsonProperty("time")
  private TimeStream time = null;

  @JsonProperty("distance")
  private DistanceStream distance = null;

  @JsonProperty("latlng")
  private LatLngStream latlng = null;

  @JsonProperty("altitude")
  private AltitudeStream altitude = null;

  @JsonProperty("velocity_smooth")
  private SmoothVelocityStream velocitySmooth = null;

  @JsonProperty("heartrate")
  private HeartrateStream heartrate = null;

  @JsonProperty("cadence")
  private CadenceStream cadence = null;

  @JsonProperty("watts")
  private PowerStream watts = null;

  @JsonProperty("temp")
  private TemperatureStream temp = null;

  @JsonProperty("moving")
  private MovingStream moving = null;

  @JsonProperty("grade_smooth")
  private SmoothGradeStream gradeSmooth = null;

  public StreamSet time(TimeStream time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")
  public TimeStream getTime() {
    return time;
  }

  public void setTime(TimeStream time) {
    this.time = time;
  }

  public StreamSet distance(DistanceStream distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(value = "")
  public DistanceStream getDistance() {
    return distance;
  }

  public void setDistance(DistanceStream distance) {
    this.distance = distance;
  }

  public StreamSet latlng(LatLngStream latlng) {
    this.latlng = latlng;
    return this;
  }

   /**
   * Get latlng
   * @return latlng
  **/
  @ApiModelProperty(value = "")
  public LatLngStream getLatlng() {
    return latlng;
  }

  public void setLatlng(LatLngStream latlng) {
    this.latlng = latlng;
  }

  public StreamSet altitude(AltitudeStream altitude) {
    this.altitude = altitude;
    return this;
  }

   /**
   * Get altitude
   * @return altitude
  **/
  @ApiModelProperty(value = "")
  public AltitudeStream getAltitude() {
    return altitude;
  }

  public void setAltitude(AltitudeStream altitude) {
    this.altitude = altitude;
  }

  public StreamSet velocitySmooth(SmoothVelocityStream velocitySmooth) {
    this.velocitySmooth = velocitySmooth;
    return this;
  }

   /**
   * Get velocitySmooth
   * @return velocitySmooth
  **/
  @ApiModelProperty(value = "")
  public SmoothVelocityStream getVelocitySmooth() {
    return velocitySmooth;
  }

  public void setVelocitySmooth(SmoothVelocityStream velocitySmooth) {
    this.velocitySmooth = velocitySmooth;
  }

  public StreamSet heartrate(HeartrateStream heartrate) {
    this.heartrate = heartrate;
    return this;
  }

   /**
   * Get heartrate
   * @return heartrate
  **/
  @ApiModelProperty(value = "")
  public HeartrateStream getHeartrate() {
    return heartrate;
  }

  public void setHeartrate(HeartrateStream heartrate) {
    this.heartrate = heartrate;
  }

  public StreamSet cadence(CadenceStream cadence) {
    this.cadence = cadence;
    return this;
  }

   /**
   * Get cadence
   * @return cadence
  **/
  @ApiModelProperty(value = "")
  public CadenceStream getCadence() {
    return cadence;
  }

  public void setCadence(CadenceStream cadence) {
    this.cadence = cadence;
  }

  public StreamSet watts(PowerStream watts) {
    this.watts = watts;
    return this;
  }

   /**
   * Get watts
   * @return watts
  **/
  @ApiModelProperty(value = "")
  public PowerStream getWatts() {
    return watts;
  }

  public void setWatts(PowerStream watts) {
    this.watts = watts;
  }

  public StreamSet temp(TemperatureStream temp) {
    this.temp = temp;
    return this;
  }

   /**
   * Get temp
   * @return temp
  **/
  @ApiModelProperty(value = "")
  public TemperatureStream getTemp() {
    return temp;
  }

  public void setTemp(TemperatureStream temp) {
    this.temp = temp;
  }

  public StreamSet moving(MovingStream moving) {
    this.moving = moving;
    return this;
  }

   /**
   * Get moving
   * @return moving
  **/
  @ApiModelProperty(value = "")
  public MovingStream getMoving() {
    return moving;
  }

  public void setMoving(MovingStream moving) {
    this.moving = moving;
  }

  public StreamSet gradeSmooth(SmoothGradeStream gradeSmooth) {
    this.gradeSmooth = gradeSmooth;
    return this;
  }

   /**
   * Get gradeSmooth
   * @return gradeSmooth
  **/
  @ApiModelProperty(value = "")
  public SmoothGradeStream getGradeSmooth() {
    return gradeSmooth;
  }

  public void setGradeSmooth(SmoothGradeStream gradeSmooth) {
    this.gradeSmooth = gradeSmooth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamSet streamSet = (StreamSet) o;
    return Objects.equals(this.time, streamSet.time) &&
        Objects.equals(this.distance, streamSet.distance) &&
        Objects.equals(this.latlng, streamSet.latlng) &&
        Objects.equals(this.altitude, streamSet.altitude) &&
        Objects.equals(this.velocitySmooth, streamSet.velocitySmooth) &&
        Objects.equals(this.heartrate, streamSet.heartrate) &&
        Objects.equals(this.cadence, streamSet.cadence) &&
        Objects.equals(this.watts, streamSet.watts) &&
        Objects.equals(this.temp, streamSet.temp) &&
        Objects.equals(this.moving, streamSet.moving) &&
        Objects.equals(this.gradeSmooth, streamSet.gradeSmooth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, distance, latlng, altitude, velocitySmooth, heartrate, cadence, watts, temp, moving, gradeSmooth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamSet {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    latlng: ").append(toIndentedString(latlng)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    velocitySmooth: ").append(toIndentedString(velocitySmooth)).append("\n");
    sb.append("    heartrate: ").append(toIndentedString(heartrate)).append("\n");
    sb.append("    cadence: ").append(toIndentedString(cadence)).append("\n");
    sb.append("    watts: ").append(toIndentedString(watts)).append("\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    moving: ").append(toIndentedString(moving)).append("\n");
    sb.append("    gradeSmooth: ").append(toIndentedString(gradeSmooth)).append("\n");
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

