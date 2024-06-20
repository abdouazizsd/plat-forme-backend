package sn.aziz.platformebackend.services.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResetOrForgetFormDTO {

    private String login;
    private String password;
    private String newPassword;
}
