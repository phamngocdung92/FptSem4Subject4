package fptSem4.Subject4.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ViettelPostApiProperties {
    @Value("${viettel-post-api.base-url}")
    private String baseUrl;
    @Value("${viettel-post-api.login-path}")
    private String loginPath;
    @Value("${viettel-post-api.get-list-office-path}")
    private String getListOfficePath;
    @Value("${viettel-post-api.username}")
    private String username;
    @Value("${viettel-post-api.password}")
    private String password;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getLoginPath() {
        return loginPath;
    }

    public void setLoginPath(String loginPath) {
        this.loginPath = loginPath;
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

    public String getGetListOfficePath() {
        return getListOfficePath;
    }

    public void setGetListOfficePath(String getListOfficePath) {
        this.getListOfficePath = getListOfficePath;
    }
}
