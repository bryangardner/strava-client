package dev.bryangardner.strava.client.api;

import dev.bryangardner.strava.client.ApiClient;

import dev.bryangardner.strava.client.model.DetailedClub;
import dev.bryangardner.strava.client.model.Fault;
import dev.bryangardner.strava.client.model.SummaryActivity;
import dev.bryangardner.strava.client.model.SummaryAthlete;
import dev.bryangardner.strava.client.model.SummaryClub;

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


@Component("dev.bryangardner.strava.client.api.ClubsApi")
public class ClubsApi {
    private ApiClient apiClient;

    public ClubsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ClubsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List Club Activities
     * Retrieve recent activities from members of a specific club. The authenticated athlete must belong to the requested club in order to hit this endpoint. Pagination is supported. Athlete profile visibility is respected for all activities.
     * <p><b>200</b> - A list of activities.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;SummaryActivity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummaryActivity> getClubActivitiesById(Long id, Integer page, Integer perPage) throws RestClientException {
        return getClubActivitiesByIdWithHttpInfo(id, page, perPage).getBody();
    }

    /**
     * List Club Activities
     * Retrieve recent activities from members of a specific club. The authenticated athlete must belong to the requested club in order to hit this endpoint. Pagination is supported. Athlete profile visibility is respected for all activities.
     * <p><b>200</b> - A list of activities.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;SummaryActivity&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SummaryActivity>> getClubActivitiesByIdWithHttpInfo(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClubActivitiesById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/clubs/{id}/activities").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<List<SummaryActivity>> returnType = new ParameterizedTypeReference<List<SummaryActivity>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Club Administrators
     * Returns a list of the administrators of a given club.
     * <p><b>200</b> - A list of summary athlete representations.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;SummaryAthlete&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummaryAthlete> getClubAdminsById(Long id, Integer page, Integer perPage) throws RestClientException {
        return getClubAdminsByIdWithHttpInfo(id, page, perPage).getBody();
    }

    /**
     * List Club Administrators
     * Returns a list of the administrators of a given club.
     * <p><b>200</b> - A list of summary athlete representations.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;SummaryAthlete&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SummaryAthlete>> getClubAdminsByIdWithHttpInfo(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClubAdminsById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/clubs/{id}/admins").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<List<SummaryAthlete>> returnType = new ParameterizedTypeReference<List<SummaryAthlete>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Club
     * Returns a given club using its identifier.
     * <p><b>200</b> - The detailed representation of a club.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @return DetailedClub
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DetailedClub getClubById(Long id) throws RestClientException {
        return getClubByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Club
     * Returns a given club using its identifier.
     * <p><b>200</b> - The detailed representation of a club.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @return ResponseEntity&lt;DetailedClub&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DetailedClub> getClubByIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClubById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/clubs/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<DetailedClub> returnType = new ParameterizedTypeReference<DetailedClub>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Club Members
     * Returns a list of the athletes who are members of a given club.
     * <p><b>200</b> - A list of summary athlete representations.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;SummaryAthlete&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummaryAthlete> getClubMembersById(Long id, Integer page, Integer perPage) throws RestClientException {
        return getClubMembersByIdWithHttpInfo(id, page, perPage).getBody();
    }

    /**
     * List Club Members
     * Returns a list of the athletes who are members of a given club.
     * <p><b>200</b> - A list of summary athlete representations.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the club. (required)
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;SummaryAthlete&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SummaryAthlete>> getClubMembersByIdWithHttpInfo(Long id, Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getClubMembersById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/clubs/{id}/members").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<List<SummaryAthlete>> returnType = new ParameterizedTypeReference<List<SummaryAthlete>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Athlete Clubs
     * Returns a list of the clubs whose membership includes the authenticated athlete.
     * <p><b>200</b> - A list of summary club representations.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;SummaryClub&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SummaryClub> getLoggedInAthleteClubs(Integer page, Integer perPage) throws RestClientException {
        return getLoggedInAthleteClubsWithHttpInfo(page, perPage).getBody();
    }

    /**
     * List Athlete Clubs
     * Returns a list of the clubs whose membership includes the authenticated athlete.
     * <p><b>200</b> - A list of summary club representations.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;SummaryClub&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SummaryClub>> getLoggedInAthleteClubsWithHttpInfo(Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/athlete/clubs").build().toUriString();

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

        ParameterizedTypeReference<List<SummaryClub>> returnType = new ParameterizedTypeReference<List<SummaryClub>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
