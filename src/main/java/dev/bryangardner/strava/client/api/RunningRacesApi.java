package dev.bryangardner.strava.client.api;

import dev.bryangardner.strava.client.ApiClient;

import dev.bryangardner.strava.client.model.Fault;
import dev.bryangardner.strava.client.model.RunningRace;

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


@Component("dev.bryangardner.strava.client.api.RunningRacesApi")
public class RunningRacesApi {
    private ApiClient apiClient;

    public RunningRacesApi() {
        this(new ApiClient());
    }

    @Autowired
    public RunningRacesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Running Race
     * Returns a running race for a given identifier.
     * <p><b>200</b> - Representation of a running race.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the running race. (required)
     * @return RunningRace
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RunningRace getRunningRaceById(Long id) throws RestClientException {
        return getRunningRaceByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Running Race
     * Returns a running race for a given identifier.
     * <p><b>200</b> - Representation of a running race.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the running race. (required)
     * @return ResponseEntity&lt;RunningRace&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RunningRace> getRunningRaceByIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRunningRaceById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/running_races/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<RunningRace> returnType = new ParameterizedTypeReference<RunningRace>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Running Races
     * Returns a list running races based on a set of search criteria.
     * <p><b>200</b> - Representation of a list of running race.
     * <p><b>0</b> - Unexpected error.
     * @param year Filters the list by a given year. (optional)
     * @return List&lt;RunningRace&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<RunningRace> getRunningRaces(Integer year) throws RestClientException {
        return getRunningRacesWithHttpInfo(year).getBody();
    }

    /**
     * List Running Races
     * Returns a list running races based on a set of search criteria.
     * <p><b>200</b> - Representation of a list of running race.
     * <p><b>0</b> - Unexpected error.
     * @param year Filters the list by a given year. (optional)
     * @return ResponseEntity&lt;List&lt;RunningRace&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<RunningRace>> getRunningRacesWithHttpInfo(Integer year) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/running_races").build().toUriString();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "year", year));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "strava_oauth" };

        ParameterizedTypeReference<List<RunningRace>> returnType = new ParameterizedTypeReference<List<RunningRace>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
