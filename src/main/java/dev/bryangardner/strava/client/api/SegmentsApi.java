package dev.bryangardner.strava.client.api;

import dev.bryangardner.strava.client.ApiClient;

import dev.bryangardner.strava.client.model.DetailedSegment;
import dev.bryangardner.strava.client.model.ExplorerResponse;
import dev.bryangardner.strava.client.model.Fault;
import dev.bryangardner.strava.client.model.SummarySegment;

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


@Component("dev.bryangardner.strava.client.api.SegmentsApi")
public class SegmentsApi {
    private ApiClient apiClient;

    public SegmentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SegmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Explore segments
     * Returns the top 10 segments matching a specified query.
     * <p><b>200</b> - List of matching segments.
     * <p><b>0</b> - Unexpected error.
     * @param bounds The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude] (required)
     * @param activityType Desired activity type. (optional)
     * @param minCat The minimum climbing category. (optional)
     * @param maxCat The maximum climbing category. (optional)
     * @return ExplorerResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExplorerResponse exploreSegments(List<Float> bounds, String activityType, Integer minCat, Integer maxCat) throws RestClientException {
        return exploreSegmentsWithHttpInfo(bounds, activityType, minCat, maxCat).getBody();
    }

    /**
     * Explore segments
     * Returns the top 10 segments matching a specified query.
     * <p><b>200</b> - List of matching segments.
     * <p><b>0</b> - Unexpected error.
     * @param bounds The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude] (required)
     * @param activityType Desired activity type. (optional)
     * @param minCat The minimum climbing category. (optional)
     * @param maxCat The maximum climbing category. (optional)
     * @return ResponseEntity&lt;ExplorerResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExplorerResponse> exploreSegmentsWithHttpInfo(List<Float> bounds, String activityType, Integer minCat, Integer maxCat) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'bounds' is set
        if (bounds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bounds' when calling exploreSegments");
        }
        
        String path = UriComponentsBuilder.fromPath("/segments/explore").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase()), "bounds", bounds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "activity_type", activityType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "min_cat", minCat));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "max_cat", maxCat));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<ExplorerResponse> returnType = new ParameterizedTypeReference<ExplorerResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Starred Segments
     * List of the authenticated athlete&#39;s starred segments. Private segments are filtered out unless requested by a token with read_all scope.
     * <p><b>200</b> - List of the authenticated athlete&#39;s starred segments.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;SummarySegment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummarySegment> getLoggedInAthleteStarredSegments(Integer page, Integer perPage) throws RestClientException {
        return getLoggedInAthleteStarredSegmentsWithHttpInfo(page, perPage).getBody();
    }

    /**
     * List Starred Segments
     * List of the authenticated athlete&#39;s starred segments. Private segments are filtered out unless requested by a token with read_all scope.
     * <p><b>200</b> - List of the authenticated athlete&#39;s starred segments.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;SummarySegment&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SummarySegment>> getLoggedInAthleteStarredSegmentsWithHttpInfo(Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/segments/starred").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<SummarySegment>> returnType = new ParameterizedTypeReference<List<SummarySegment>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Segment
     * Returns the specified segment. read_all scope required in order to retrieve athlete-specific segment information, or to retrieve private segments.
     * <p><b>200</b> - Representation of a segment.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment. (required)
     * @return DetailedSegment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedSegment getSegmentById(Long id) throws RestClientException {
        return getSegmentByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Segment
     * Returns the specified segment. read_all scope required in order to retrieve athlete-specific segment information, or to retrieve private segments.
     * <p><b>200</b> - Representation of a segment.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment. (required)
     * @return ResponseEntity&lt;DetailedSegment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedSegment> getSegmentByIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSegmentById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/segments/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<DetailedSegment> returnType = new ParameterizedTypeReference<DetailedSegment>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Star Segment
     * Stars/Unstars the given segment for the authenticated athlete. Requires profile:write scope.
     * <p><b>200</b> - Representation of a segment.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment to star. (required)
     * @param starred If true, star the segment; if false, unstar the segment. (required)
     * @return DetailedSegment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedSegment starSegment(Long id, Boolean starred) throws RestClientException {
        return starSegmentWithHttpInfo(id, starred).getBody();
    }

    /**
     * Star Segment
     * Stars/Unstars the given segment for the authenticated athlete. Requires profile:write scope.
     * <p><b>200</b> - Representation of a segment.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the segment to star. (required)
     * @param starred If true, star the segment; if false, unstar the segment. (required)
     * @return ResponseEntity&lt;DetailedSegment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedSegment> starSegmentWithHttpInfo(Long id, Boolean starred) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling starSegment");
        }
        
        // verify the required parameter 'starred' is set
        if (starred == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'starred' when calling starSegment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/segments/{id}/starred").buildAndExpand(uriVariables).toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (starred != null)
            formParams.add("starred", starred);

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<DetailedSegment> returnType = new ParameterizedTypeReference<DetailedSegment>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
