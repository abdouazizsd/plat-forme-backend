package sn.aziz.platformebackend.security.services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserPrinciple  {

    private final Long id;
    private final String name;
    private final String username;
    @JsonIgnore
    private final String password;

}
