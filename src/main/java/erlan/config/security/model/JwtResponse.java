package erlan.config.security.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {

    private String token;
    private String type = "Bearer";
    private String email;
    private String role;

    public JwtResponse(String accessToken, List<String> role, String email) {
        this.token = accessToken;
        this.role = String.valueOf(role);
        this.email = email;
    }

}