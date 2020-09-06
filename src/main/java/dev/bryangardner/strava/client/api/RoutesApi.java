package dev.bryangardner.strava.client.api;

import dev.bryangardner.strava.client.ApiClient;

import dev.bryangardner.strava.client.model.Fault;
import dev.bryangardner.strava.client.model.Route;

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


@Component("dev.bryangardner.strava.client.api.RoutesApi")
public class RoutesApi {
    private ApiClient apiClient;

    public RoutesApi() {
        this(new ApiClient());
    }

    @Autowired
    public RoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Export Route GPX
     * Returns a GPX file of the route. Requires read_all scope for private routes.
     * <p><b>200</b> - A GPX file with the route.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getRouteAsGPX(Long id) throws RestClientException {
        getRouteAsGPXWithHttpInfo(id);
    }

    /**
     * Export Route GPX
     * Returns a GPX file of the route. Requires read_all scope for private routes.
     * <p><b>200</b> - A GPX file with the route.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getRouteAsGPXWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRouteAsGPX");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/routes/{id}/export_gpx").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Export Route TCX
     * Returns a TCX file of the route. Requires read_all scope for private routes.
     * <p><b>200</b> - A TCX file with the route.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getRouteAsTCX(Long id) throws RestClientException {
        getRouteAsTCXWithHttpInfo(id);
    }

    /**
     * Export Route TCX
     * Returns a TCX file of the route. Requires read_all scope for private routes.
     * <p><b>200</b> - A TCX file with the route.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getRouteAsTCXWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRouteAsTCX");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/routes/{id}/export_tcx").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Route
     * Returns a route using its identifier. Requires read_all scope for private routes.
     * <p><b>200</b> - A representation of the route.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @return Route
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Route getRouteById(Long id) throws RestClientException {
        return getRouteByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Route
     * Returns a route using its identifier. Requires read_all scope for private routes.
     * <p><b>200</b> - A representation of the route.
     * <p><b>0</b> - Unexpected error.
     * @param id The identifier of the route. (required)
     * @return ResponseEntity&lt;Route&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Route> getRouteByIdWithHttpInfo(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getRouteById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/routes/{id}").buildAndExpand(uriVariables).toUriString();

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

        ParameterizedTypeReference<Route> returnType = new ParameterizedTypeReference<Route>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List Athlete Routes
     * Returns a list of the routes created by the authenticated athlete. Private routes are filtered out unless requested by a token with read_all scope.
     * <p><b>200</b> - A representation of the route.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return List&lt;Route&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Route> getRoutesByAthleteId(Integer page, Integer perPage) throws RestClientException {
        return getRoutesByAthleteIdWithHttpInfo(page, perPage).getBody();
    }

    /**
     * List Athlete Routes
     * Returns a list of the routes created by the authenticated athlete. Private routes are filtered out unless requested by a token with read_all scope.
     * <p><b>200</b> - A representation of the route.
     * <p><b>0</b> - Unexpected error.
     * @param page Page number. Defaults to 1. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional, default to 30)
     * @return ResponseEntity&lt;List&lt;Route&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Route>> getRoutesByAthleteIdWithHttpInfo(Integer page, Integer perPage) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/athletes/{id}/routes").build().toUriString();

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

        ParameterizedTypeReference<List<Route>> returnType = new ParameterizedTypeReference<List<Route>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
