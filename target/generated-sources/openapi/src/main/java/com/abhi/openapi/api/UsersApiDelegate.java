package com.abhi.openapi.api;

import com.abhi.openapi.model.UpdateUser;
import com.abhi.openapi.model.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link UsersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-29T21:27:48.925634-07:00[America/Los_Angeles]")
public interface UsersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /users : Delete an existing user
     *
     * @return No Content (status code 204)
     * @see UsersApi#usersDelete
     */
    default ResponseEntity<Void> usersDelete() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /users : Retrieve a list of users
     *
     * @return OK (status code 200)
     * @see UsersApi#usersGet
     */
    default ResponseEntity<List<User>> usersGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"end_date\" : \"2000-01-23T04:56:07.000+00:00\", \"employment_type\" : \"employment_type\", \"rehire_date\" : \"2000-01-23T04:56:07.000+00:00\", \"last_name\" : \"last_name\", \"title\" : \"title\", \"team_key\" : 6, \"update_date\" : \"2000-01-23T04:56:07.000+00:00\", \"userkey\" : 0, \"rehire\" : true, \"user_type\" : \"user_type\", \"cost_center\" : \"cost_center\", \"employee_id\" : \"employee_id\", \"name\" : \"name\", \"location\" : \"location\", \"employee_class\" : \"employee_class\", \"manager_email\" : \"manager_email\", \"create_date\" : \"2000-01-23T04:56:07.000+00:00\", \"department\" : \"department\", \"first_name\" : \"first_name\", \"email\" : \"email\", \"status\" : \"status\", \"start_date\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /users : Create a new user
     *
     * @param body  (required)
     * @return Created (status code 201)
     * @see UsersApi#usersPost
     */
    default ResponseEntity<User> usersPost(Object body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"end_date\" : \"2000-01-23T04:56:07.000+00:00\", \"employment_type\" : \"employment_type\", \"rehire_date\" : \"2000-01-23T04:56:07.000+00:00\", \"last_name\" : \"last_name\", \"title\" : \"title\", \"team_key\" : 6, \"update_date\" : \"2000-01-23T04:56:07.000+00:00\", \"userkey\" : 0, \"rehire\" : true, \"user_type\" : \"user_type\", \"cost_center\" : \"cost_center\", \"employee_id\" : \"employee_id\", \"name\" : \"name\", \"location\" : \"location\", \"employee_class\" : \"employee_class\", \"manager_email\" : \"manager_email\", \"create_date\" : \"2000-01-23T04:56:07.000+00:00\", \"department\" : \"department\", \"first_name\" : \"first_name\", \"email\" : \"email\", \"status\" : \"status\", \"start_date\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /users : Update an existing user
     *
     * @param updateUser  (required)
     * @return No Content (status code 204)
     * @see UsersApi#usersPut
     */
    default ResponseEntity<Void> usersPut(UpdateUser updateUser) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /users/{userkey} : Retrieve a single user by userkey
     *
     * @param userkey User key to retrieve (required)
     * @return OK (status code 200)
     * @see UsersApi#usersUserkeyGet
     */
    default ResponseEntity<User> usersUserkeyGet(Integer userkey) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"end_date\" : \"2000-01-23T04:56:07.000+00:00\", \"employment_type\" : \"employment_type\", \"rehire_date\" : \"2000-01-23T04:56:07.000+00:00\", \"last_name\" : \"last_name\", \"title\" : \"title\", \"team_key\" : 6, \"update_date\" : \"2000-01-23T04:56:07.000+00:00\", \"userkey\" : 0, \"rehire\" : true, \"user_type\" : \"user_type\", \"cost_center\" : \"cost_center\", \"employee_id\" : \"employee_id\", \"name\" : \"name\", \"location\" : \"location\", \"employee_class\" : \"employee_class\", \"manager_email\" : \"manager_email\", \"create_date\" : \"2000-01-23T04:56:07.000+00:00\", \"department\" : \"department\", \"first_name\" : \"first_name\", \"email\" : \"email\", \"status\" : \"status\", \"start_date\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
