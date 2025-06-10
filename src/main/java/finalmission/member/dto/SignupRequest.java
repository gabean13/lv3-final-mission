package finalmission.member.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record SignupRequest(
        @Email
        String email,
        @NotNull
        String password,
        @Size(min = 2, max = 10)
        @NotNull
        String name
) {

}
