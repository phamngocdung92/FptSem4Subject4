package fptSem4.Subject4.dto.RequestDto.ViettelReqDto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class viettelPostLoginRequestDto {
    @JsonProperty("USERNAME")
    private String username;
    @JsonProperty("PASSWORD")
    private String password;

    public viettelPostLoginRequestDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public viettelPostLoginRequestDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
