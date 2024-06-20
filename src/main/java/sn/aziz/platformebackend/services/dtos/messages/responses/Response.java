package sn.aziz.platformebackend.services.dtos.messages.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.Accessors;

@Setter
@Accessors(chain = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@Builder
public class Response<T> {

    private Status status;
    private T payload;
    private Object errors;
    private Object metadata;
    private Object message;
    private String url;

    public static <T> Response<T> firstConnexion() {
        Response<T> response = new Response<>();
        response.setStatus(Status.FIRST_CONNECTION);
        return response;
    }

    public static <T> Response<T> disabledAccount() {
        Response<T> response = new Response<>();
        response.setStatus(Status.DISABLED_ACCOUNT);
        return response;
    }

    public static <T> Response<T> badRequest() {
        Response<T> response = new Response<>();
        response.setStatus(Status.BAD_REQUEST);
        return response;
    }

    public static <T> Response<T> invalideToken() {
        Response<T> response = new Response<>();
        response.setStatus(Status.INVALIDE_TOKEN);
        return response;
    }

    public static <T> Response<T> invalideUrl() {
        Response<T> response = new Response<>();
        response.setStatus(Status.INVALIDE_URL);
        return response;
    }

    public static <T> Response<T> ok() {
        Response<T> response = new Response<>();
        response.setStatus(Status.OK);
        return response;
    }

    public static <T> Response<T> unauthorized() {
        Response<T> response = new Response<>();
        response.setStatus(Status.UNAUTHORIZED);
        return response;
    }

    public static <T> Response<T> validationException() {
        Response<T> response = new Response<>();
        response.setStatus(Status.VALIDATION_EXCEPTION);
        return response;
    }

    public static <T> Response<T> wrongCredentials() {
        Response<T> response = new Response<>();
        response.setStatus(Status.WRONG_CREDENTIALS);
        return response;
    }

    public static <T> Response<T> accessDenied() {
        Response<T> response = new Response<>();
        response.setStatus(Status.ACCESS_DENIED);
        return response;
    }

    public static <T> Response<T> exception() {
        Response<T> response = new Response<>();
        response.setStatus(Status.EXCEPTION);
        return response;
    }

    public static <T> Response<T> notFound() {
        Response<T> response = new Response<>();
        response.setStatus(Status.NOT_FOUND);
        return response;
    }

    public static <T> Response<T> duplicateEntity() {
        Response<T> response = new Response<>();
        response.setStatus(Status.DUPLICATE_ENTITY);
        return response;
    }
    public static <T> Response<T> duplicateEmail() {
        Response<T> response = new Response<>();
        response.setStatus(Status.DUPLICATE_EMAIL);
        return response;
    }

    public static <T> Response<T> duplicateReference() {
        Response<T> response = new Response<>();
        response.setStatus(Status.DUPLICATE_REFERENCE);
        return response;
    }

    public static  <T> Response<?> duplicateTelephone() {

        Response<T> response = new Response<>();
        response.setStatus(Status.DUPLICATE_TELEPHONE);
        return response;
    }

    public static  <T> Response<?> duplicateNinea() {

        Response<T> response = new Response<>();
        response.setStatus(Status.DUPLICATE_NINEA);
        return response;
    }

    public static  <T> Response<?> tokenExpired() {
        Response<T> response = new Response<>();
        response.setStatus(Status.TOKEN_EXPIRED);
        return response;
    }



    public enum Status {
        OK, BAD_REQUEST, UNAUTHORIZED, VALIDATION_EXCEPTION, EXCEPTION, WRONG_CREDENTIALS, ACCESS_DENIED,
        NOT_FOUND, DUPLICATE_ENTITY, DUPLICATE_EMAIL, DUPLICATE_REFERENCE, DUPLICATE_TELEPHONE,DUPLICATE_NINEA,TOKEN_EXPIRED,
        FIRST_CONNECTION, DISABLED_ACCOUNT,INVALIDE_TOKEN,INVALIDE_URL
    }

    @Getter
    @Accessors(chain = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PageMetadata {
        private final int size;
        private final long totalElements;
        private final int totalPages;
        private final int number;

        public PageMetadata(int size, long totalElements, int totalPages, int number) {
            this.size = size;
            this.totalElements = totalElements;
            this.totalPages = totalPages;
            this.number = number;
        }
    }
}
