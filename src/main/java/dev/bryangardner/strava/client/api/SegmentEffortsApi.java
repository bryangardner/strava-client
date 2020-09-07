package dev.bryangardner.strava.client.api;

import dev.bryangardner.strava.client.ApiClient;

import dev.bryangardner.strava.client.model.DetailedSegmentEffort;
import dev.bryangardner.strava.client.model.Fault;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;


@Component("dev.bryangardner.strava.client.api.SegmentEffortsApi")
public class SegmentEffortsApi {
    private ApiClient apiClient;

    public SegmentEffortsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SegmentEffortsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List Segment Efforts
     * Returns a set of the authenticated athlete&#39;s segment efforts for a given segment.  Requires subscription.
     * <p><b>200</b> - List of segment efforts.
     * <p><b>0</b> - Unexpected error.
     * @param segmentId The identifier of the segment. (required)
     * @param startDateLocal ISO 8601 formatted date time. (optional)
     * @param endDateLocal ISO 8601 formatted date time. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;DetailedSegmentEffort&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DetailedSegmentEffort> getEffortsBySegmentId(Integer segmentId, OffsetDateTime startDateLocal, OffsetDateTime endDateLocal, Integer perPage) throws RestClientException {
        return getEffortsBySegmentIdWithHttpInfo(segmentId, startDateLocal, endDateLocal, perPage).getBody();
    }

    /**
     * List Segment Efforts
     * Returns a set of the authenticated athlete&#39;s segment efforts for a given segment.  Requires subscription.
     * <p><b>200</b> - List of segment efforts.
     * <p><b>0</b> - Unexpected error.
     * @param segmentId The identifier of the segment. (required)
     * @param startDateLocal ISO 8601 formatted date time. (optional)
     * @param endDateLocal ISO 8601 formatted date time. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;DetailedSegmentEffort&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DetailedSegmentEffort>> getEffortsBySegmentIdWithHttpInfo(Integer segmentId, OffsetDateTime startDateLocal, OffsetDateTime endDateLocal, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'segmentId' is set
        if (segmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'segmentId' when calling getEffortsBySegmentId");
        }
        
        String path = UriComponentsBuilder.fromPath("/segment_efforts").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "segment_id", segmentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date_local", startDateLocal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date_local", endDateLocal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<DetailedSegmentEffort>> returnType = new ParameterizedTypeReference<List<DetailedSegmentEffort>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Segment Effort
     * Returns a segment effort from an activity that is owned by the authenticated athlete. Requires subscription.
     * <p><b>200</b> - Representation of a segment effort.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment effort. (required)
     * @return DetailedSegmentEffort
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedSegmentEffort getSegmentEffortById(Long id) throws RestClientException {
        return getSegmentEffortByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Segment Effort
     * Returns a segment effort from an activity that is owned by the authenticated athlete. Requires subscription.
     * <p><b>200</b> - Representation of a segment effort.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment effort. (required)
     * @return ResponseEntity&lt;DetailedSegmentEffort&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedSegmentEffort> getSegmentEffortByIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSegmentEffortById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/segment_efforts/{id}").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedSegmentEffort> returnType = new ParameterizedTypeReference<DetailedSegmentEffort>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
